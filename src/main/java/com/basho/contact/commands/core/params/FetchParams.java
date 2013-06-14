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

package com.basho.contact.commands.core.params;


import com.basho.contact.actions.ActionParams;
import com.basho.contact.actions.Binding;
import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.operations.FetchObject;

import java.util.List;
import java.util.Map;

public class FetchParams {
    public static class Pre extends ActionParams {
        @Binding(name = "key")
        public String key;

        @Binding(name = "fetchObj")
        public FetchObject<IRiakObject> fetchObj;

        @Binding(name = "fetchMetadataSelection")
        public List<String> fetchMetadataSelection;
    }

    public static class Post extends ActionParams {
        @Binding(name = "key")
        public String key;

        @Binding(name = "riak_object")
        public IRiakObject object;

        @Binding(name = "fetchMetadata")
        public Map<String, String> fetchMetadata;

    }
}
