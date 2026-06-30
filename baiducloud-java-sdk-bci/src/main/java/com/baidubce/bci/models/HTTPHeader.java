package com.baidubce.bci.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HTTPHeader {
    /**
     * http header name
     */
    private String name;

    /**
     * http header value
     */
    private String value;

    public HTTPHeader setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public HTTPHeader setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "HTTPHeader{" + "name=" + name + "\n" + "value=" + value + "\n" + "}";
    }

}