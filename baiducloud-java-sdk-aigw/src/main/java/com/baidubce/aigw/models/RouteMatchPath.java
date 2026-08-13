package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RouteMatchPath {
    /**
     * 匹配方式：prefix、exact、regex
     */
    private String matchType;

    /**
     * 路径匹配值
     */
    private String value;

    public RouteMatchPath setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    public String getMatchType() {
        return this.matchType;
    }

    public RouteMatchPath setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "RouteMatchPath{" + "matchType=" + matchType + "\n" + "value=" + value + "\n" + "}";
    }

}