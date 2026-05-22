package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAppRule {
    /**
     * 规则的类型，host/uri/\*
     */
    private String key;

    /**
     * 通配符匹配字符串，详见[ValueExample](#ValueExample)
     */
    private String value;

    public CreateAppRule setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public CreateAppRule setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "CreateAppRule{" + "key=" + key + "\n" + "value=" + value + "\n" + "}";
    }

}