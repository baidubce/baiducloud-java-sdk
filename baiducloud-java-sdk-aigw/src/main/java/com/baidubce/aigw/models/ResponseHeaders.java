package com.baidubce.aigw.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseHeaders {
    /**
     * 是否启用自定义响应头
     */
    private Boolean enabled;

    /**
     * 响应头列表
     */
    private List<CustomHeader> headers;

    public ResponseHeaders setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public ResponseHeaders setHeaders(List<CustomHeader> headers) {
        this.headers = headers;
        return this;
    }

    public List<CustomHeader> getHeaders() {
        return this.headers;
    }

    @Override
    public String toString() {
        return "ResponseHeaders{" + "enabled=" + enabled + "\n" + "headers=" + headers + "\n" + "}";
    }

}