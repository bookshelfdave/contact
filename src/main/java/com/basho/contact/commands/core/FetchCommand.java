/*
 * -------------------------------------------------------------------
 * Contact: a language and interactive shell for Riak
 *
 * Copyright (c) 2013 Dave Parfitt
 *
 * This file is provided to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain
 * a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * -------------------------------------------------------------------
 */

package com.basho.contact.commands.core;

import com.basho.contact.commands.*;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.core.params.FetchParams;
import com.basho.contact.symbols.ResultSymbol;
import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.RiakException;
import com.basho.riak.client.bucket.Bucket;
import com.basho.riak.client.operations.FetchObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FetchCommand extends BucketCommand<ResultSymbol, FetchParams.Pre> {

    public FetchCommand() {
        super("fetch", FetchParams.Pre.class);
    }

    static abstract class FetchSelectionMapper {
        public abstract String getValue(IRiakObject obj) throws RiakException;
    }

    static abstract class FetchOpt extends CommandOption<FetchObject<IRiakObject>> {}
    public static CommandOptions<FetchObject<IRiakObject>, FetchOpt> commandOptions =
                                new CommandOptions<FetchObject<IRiakObject>, FetchOpt>();

    public static Map<String, FetchSelectionMapper> fetchSelectMap = new HashMap<String, FetchSelectionMapper>();


    static {
        setupCommandOptions();
        setupFetchSelectionMapping();
    }

    private static void setupCommandOptions() {
//	    optional bytes if_modified = 7;
//	    optional bool deletedvclock = 9;

        // TODO: I don't need objectToInt anymore if everything passed in is a string
        commandOptions.addOption("r", new FetchOpt() {
            public FetchObject<IRiakObject> setOption(
                    FetchObject<IRiakObject> o, Object value) throws Exception {
                return o.r(CommandUtils.objectToInt(value));
            }
        });
        commandOptions.addOption("pr", new FetchOpt() {
            public FetchObject<IRiakObject> setOption(
                    FetchObject<IRiakObject> o, Object value) throws Exception {
                return o.pr(CommandUtils.objectToInt(value));
            }
        });
        commandOptions.addOption("basic_quorum", new FetchOpt() {
            public FetchObject<IRiakObject> setOption(
                    FetchObject<IRiakObject> o, Object value) throws Exception {
                return o.basicQuorum(CommandUtils.objectToBoolean(value));
            }
        });
        commandOptions.addOption("notfound_ok", new FetchOpt() {
            public FetchObject<IRiakObject> setOption(
                    FetchObject<IRiakObject> o, Object value) throws Exception {
                return o.notFoundOK(CommandUtils.objectToBoolean(value));
            }
        });
        commandOptions.addOption("head", new FetchOpt() {
            public FetchObject<IRiakObject> setOption(
                    FetchObject<IRiakObject> o, Object value) throws Exception {
                if(CommandUtils.objectToBoolean(value)) {
                    return o.headOnly();
                } else {
                    return o;
                }
            }
        });
        commandOptions.addOption("deletedvclock", new FetchOpt() {
            public FetchObject<IRiakObject> setOption(
                    FetchObject<IRiakObject> o, Object value) throws Exception {
                return o.returnDeletedVClock(CommandUtils.objectToBoolean(value));
            }
        });
    }

    private static void setupFetchSelectionMapping() {
        fetchSelectMap.put("content", new FetchSelectionMapper() {
            @Override
            public String getValue(IRiakObject obj) throws RiakException {
                return obj.getValueAsString();
            }
        });


        fetchSelectMap.put("vclock", new FetchSelectionMapper() {
            @Override
            public String getValue(IRiakObject obj) throws RiakException {
                return obj.getVClockAsString();
            }
        });

        fetchSelectMap.put("content_type", new FetchSelectionMapper() {
            @Override
            public String getValue(IRiakObject obj) throws RiakException {
                return obj.getContentType();
            }
        });

        fetchSelectMap.put("vtag", new FetchSelectionMapper() {
            @Override
            public String getValue(IRiakObject obj) throws RiakException {
                return obj.getVtag();
            }
        });
    }

    private void checkMd(RuntimeContext runtimeCtx, List<String> userSelections) throws Exception {
        if(userSelections != null) {
            for(String s: this.params.fetchMetadataSelection) {
                if(!fetchSelectMap.containsKey(s)) {
                    throw new Exception("Unknown fetch metadata:" + s);
                }
            }
        }
    }

    private void mapSelections(RuntimeContext runtimeCtx, List<String> md, IRiakObject obj, FetchParams.Post postParams) {
        if(md != null) {
            postParams.fetchMetadata = new HashMap<String, String>();
            for(String m : md) {
                try {
                    String v = fetchSelectMap.get(m).getValue(obj);
                    postParams.fetchMetadata.put(m,v);
                } catch (Exception e) {
                    runtimeCtx.appendError("Error fetching " + m + " metadata:" + e.getMessage());
                }
            }
        }
    }

    @Override
    protected ResultSymbol bucketExec(RuntimeContext runtimeCtx, String bucket) {
        try {
            // TODO: optimize this to skip fetch/create bucket every time
            Bucket b = conn.fetchBucket(this.params.bucket).execute();
            FetchObject<IRiakObject> fo =
                    commandOptions.processOptions(runtimeCtx, b.fetch(params.key), params);
            if(b.getAllowSiblings()) {
                fo = fo.withResolver(runtimeCtx.getActionListener().getResolverMill().getResolverForBucket(bucket));

            }
            params.fetchObj = fo;
            params.ctx = runtimeCtx;
            if(params.fetchMetadataSelection == null || params.fetchMetadataSelection.size() == 0) {
                // always show content
                params.fetchMetadataSelection = new ArrayList<String>();
                params.fetchMetadataSelection.add("content");
            }
            checkMd(runtimeCtx, params.fetchMetadataSelection);
            runtimeCtx.getActionListener().preFetchAction(params);
            ResultSymbol sym = new ResultSymbol(fo.execute());
            FetchParams.Post postParams = new FetchParams.Post();
            postParams.bucket = this.params.bucket;
            postParams.key = params.key;
            postParams.options = this.params.options;
            postParams.object = sym.value;
            postParams.ctx = runtimeCtx;
            mapSelections(runtimeCtx, params.fetchMetadataSelection, sym.value, postParams);
            runtimeCtx.getActionListener().postFetchAction(postParams);
            return sym;

        } catch (Exception e) {
            runtimeCtx.appendError("Can't fetch object from bucket:" + e.getMessage());
        }
        return null;
    }


}
