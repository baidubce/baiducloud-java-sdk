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
import com.baidubce.model.AbstractBceStreamResponse;

/**
 * HTTP response handler for BCE responses that contain a file stream.
 * This handler passes the raw InputStream to the response object without any parsing.
 */
public class BceStreamResponseHandler implements HttpResponseHandler {

    @Override
    public boolean handle(BceHttpResponse httpResponse, AbstractBceResponse response) throws Exception {
        if (!(response instanceof AbstractBceStreamResponse)) {
            // Not a stream response, continue to next handler
            return false;
        }

        AbstractBceStreamResponse streamResponse = (AbstractBceStreamResponse) response;

        // 将响应流写入 response（子类可覆写 populateStream 将流写入用户指定字段）
        streamResponse.populateStream(httpResponse.getContent());

        // Set the underlying HTTP response for proper resource management
        streamResponse.setHttpResponse(httpResponse.getHttpResponse());

        // Set content type and content length from headers
        String contentType = httpResponse.getHeader(Headers.CONTENT_TYPE);
        if (contentType != null) {
            streamResponse.setContentType(contentType);
        }

        long contentLength = httpResponse.getHeaderAsLong(Headers.CONTENT_LENGTH);
        if (contentLength >= 0) {
            streamResponse.setContentLength(contentLength);
        }

        // Return true to stop the handler chain - we've handled this stream response
        return true;
    }
}
