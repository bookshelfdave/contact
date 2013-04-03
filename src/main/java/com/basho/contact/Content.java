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

package com.basho.contact;

public class Content {
    private ContentType contentType = null;
    private String userDefinedContentType;
    private String value = null;

    public Content(ContentType contentType, String value) {
        super();
        this.contentType = contentType;
        this.value = value;
    }

    public Content(ContentType contentType, String userDefinedContentType, String value) {
        super();
        this.contentType = contentType;
        this.userDefinedContentType = userDefinedContentType;
        this.value = value;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public String getUserDefinedContentType() {
        return userDefinedContentType;
    }

    public void setUserDefinedContentType(String userDefinedContentType) {
        this.userDefinedContentType = userDefinedContentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString() {
        return "<<" + this.contentType + ":" + this.value + ">>";
    }

    // todo: move to Content
    public enum ContentType {
        TEXT("text/plain"),
        JSON("application/json"),
        XML("application/xml"),
        USER_DEFINED("");

        private String contentType;

        ContentType(String value) {
            contentType = value;
        }

        public String toString() {
            return contentType;
        }
    }
}
