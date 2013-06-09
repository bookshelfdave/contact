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

package com.basho.contact.commands;

import com.basho.contact.BucketCommand;
import com.basho.contact.ContactConnectionProvider;
import com.basho.contact.ContactExecutor;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.core.FetchCommand;
import com.basho.contact.commands.core.StoreCommand;
import com.basho.contact.security.DefaultAccessPolicy;
import com.basho.contact.testing.EmptyConnectionProvider;
import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.bucket.FetchBucket;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StoreCommandTest extends AbstractBucketCommandTest {
    @Override
    public BucketCommand<?, ?> getCommand() {
        return new StoreCommand();
    }

    @Override
    public String getCommandName() {
        return "store";
    }
}
