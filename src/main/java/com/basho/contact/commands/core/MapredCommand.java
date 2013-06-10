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

import com.basho.contact.commands.RiakCommand;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.core.params.MapRedParams;
import com.basho.contact.symbols.ResultsSymbol;

public class MapredCommand extends RiakCommand<ResultsSymbol, MapRedParams.Pre> {

    public MapredCommand() {
        super(MapRedParams.Pre.class);
    }

    @Override
    protected boolean requiresConnection() {
        return true;
    }

    @Override
    protected ResultsSymbol exec(RuntimeContext ctx) {
        //ctx.getNextPBClient().mapReduce()

        return null;
    }


}
