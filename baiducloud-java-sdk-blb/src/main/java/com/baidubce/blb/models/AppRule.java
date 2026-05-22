package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppRule {
    /**
     * 规则的标识符
     */
    private String id;

    /**
     * 规则的类型，host/uri/\*
     */
    private String key;

    /**
     * 通配符匹配字符串，详见[ValueExample](#ValueExample)
     */
    private String value;

    public AppRule setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public AppRule setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public AppRule setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "AppRule{" + "id=" + id + "\n" + "key=" + key + "\n" + "value=" + value + "\n" + "}";
    }

}