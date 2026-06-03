package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TriggerTarget {
    /**
     * 触发器被触发后访问的 URL 地址
     */
    private String address;

    /**
     * 自定义 Header 信息<br>Header Key 仅支持 `Authorization`
     */
    private Object headers;

    public TriggerTarget setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getAddress() {
        return this.address;
    }

    public TriggerTarget setHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    public Object getHeaders() {
        return this.headers;
    }

    @Override
    public String toString() {
        return "TriggerTarget{" + "address=" + address + "\n" + "headers=" + headers + "\n" + "}";
    }

}