/*
 * Copyright (c) 2024 Baidu.com, Inc. All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.baidubce.http;

/**
 * Request body type enumeration.
 * Defines how the request body should be encoded and transmitted.
 * 
 * @author chongkuitai
 */
public enum BodyType {
    
    /**
     * JSON format: application/json; charset=utf-8
     * The request object will be serialized to JSON string
     */
    JSON("application/json; charset=utf-8"),
    
    /**
     * Form-urlencoded format: application/x-www-form-urlencoded; charset=utf-8
     * The request object will be serialized to form key-value pairs
     */
    FORM("application/x-www-form-urlencoded; charset=utf-8"),
    
    /**
     * Binary stream format: application/octet-stream
     * The request body will be transmitted as binary stream (e.g., file upload)
     */
    BINARY("application/octet-stream"),
    
    /**
     * XML format: application/xml; charset=utf-8
     * The request object will be serialized to XML
     */
    XML("application/xml; charset=utf-8"),
    
    /**
     * No request body
     */
    NONE(null);
    
    private final String contentType;
    
    BodyType(String contentType) {
        this.contentType = contentType;
    }
    
    /**
     * Get the Content-Type header value for this body type
     * 
     * @return Content-Type header value, or null if NONE
     */
    public String getContentType() {
        return contentType;
    }
    
    /**
     * Check if this body type has a content type
     * 
     * @return true if content type is not null
     */
    public boolean hasContentType() {
        return contentType != null;
    }
}
