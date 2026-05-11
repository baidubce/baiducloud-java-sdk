/*
 * Copyright 2014 Baidu, Inc.
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
package com.baidubce.http.handler;

import com.baidubce.http.BceHttpResponse;
import com.baidubce.http.Headers;
import com.baidubce.model.AbstractBceResponse;
import com.google.common.base.CharMatcher;
import java.util.Map;
import java.util.TreeMap;

/**
 * HTTP response handler for Baidu BCE responses. Provides common utilities that other specialized BCE response
 * handlers need to share such as pulling common response metadata (ex: request IDs) out of headers.
 */
public class BceMetadataResponseHandler implements HttpResponseHandler {
    @Override
    public boolean handle(BceHttpResponse httpResponse, AbstractBceResponse response) throws Exception {
        Map<String, String> metadata = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        metadata.putAll(httpResponse.getHeaders());
        metadata.put(Headers.CONTENT_LENGTH, String.valueOf(httpResponse.getHeaderAsLong(Headers.CONTENT_LENGTH)));
        metadata.put(Headers.DATE, httpResponse.getHeaderAsRfc822Date(Headers.DATE) == null ?
                null : String.valueOf(httpResponse.getHeaderAsRfc822Date(Headers.DATE)));
        String eTag = httpResponse.getHeader(Headers.ETAG);
        if (eTag != null) {
            metadata.put(Headers.ETAG, CharMatcher.is('"').trimFrom(eTag));
        }
        metadata.put(Headers.EXPIRES, httpResponse.getHeaderAsRfc822Date(Headers.EXPIRES) == null ?
                null : String.valueOf(httpResponse.getHeaderAsRfc822Date(Headers.EXPIRES)));
        metadata.put(Headers.LAST_MODIFIED, httpResponse.getHeaderAsRfc822Date(Headers.LAST_MODIFIED) == null ?
                null : String.valueOf(httpResponse.getHeaderAsRfc822Date(Headers.LAST_MODIFIED)));
        response.setMetadata(metadata);
        return false;
    }
}
