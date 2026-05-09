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
package com.baidubce.model;

import org.apache.http.client.methods.CloseableHttpResponse;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/**
 * Abstract response class for BCE responses that contain a file stream.
 * This class holds the raw InputStream from the HTTP response and must be closed after use.
 */
public class AbstractBceStreamResponse extends AbstractBceResponse implements Closeable {

    /**
     * The raw content stream from the HTTP response.
     */
    private InputStream content;

    /**
     * The underlying HTTP response that must be closed after the stream is consumed.
     */
    private CloseableHttpResponse httpResponse;

    /**
     * The content type of the response.
     */
    private String contentType;

    /**
     * The content length of the response, or -1 if unknown.
     */
    private long contentLength = -1;

    /**
     * Gets the content stream from the response.
     * The caller is responsible for closing the stream and this response object after use.
     *
     * @return the content stream
     */
    public InputStream getContent() {
        return content;
    }

    /**
     * Sets the content stream.
     *
     * @param content the content stream
     */
    public void setContent(InputStream content) {
        this.content = content;
    }

    /**
     * 默认实现：将响应流写入 content 字段。
     * 生成的 response 子类可覆写此方法，将流写入用户指定的字段。
     */
    public void populateStream(InputStream stream) {
        this.content = stream;
    }

    /**
     * Sets the underlying HTTP response for proper resource management.
     *
     * @param httpResponse the HTTP response
     */
    public void setHttpResponse(CloseableHttpResponse httpResponse) {
        this.httpResponse = httpResponse;
    }

    /**
     * Gets the content type of the response.
     *
     * @return the content type
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the content type of the response.
     *
     * @param contentType the content type
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Gets the content length of the response.
     *
     * @return the content length, or -1 if unknown
     */
    public long getContentLength() {
        return contentLength;
    }

    /**
     * Sets the content length of the response.
     *
     * @param contentLength the content length
     */
    public void setContentLength(long contentLength) {
        this.contentLength = contentLength;
    }

    /**
     * Closes the content stream and the underlying HTTP response.
     * This method must be called after the stream has been fully consumed.
     *
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void close() throws IOException {
        if (content != null) {
            try {
                content.close();
            } catch (IOException ignored) {
            }
        }
        if (httpResponse != null) {
            httpResponse.close();
        }
    }
}
