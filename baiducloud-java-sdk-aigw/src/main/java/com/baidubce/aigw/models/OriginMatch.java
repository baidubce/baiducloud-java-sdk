package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OriginMatch {
    /**
     * 匹配类型
     */
    private String matchType;

    /**
     * 匹配值
     */
    private String value;

    public OriginMatch setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    public String getMatchType() {
        return this.matchType;
    }

    public OriginMatch setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "OriginMatch{" + "matchType=" + matchType + "\n" + "value=" + value + "\n" + "}";
    }

}