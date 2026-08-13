package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PathRule {
    /**
     * 匹配类型
     */
    private String matchType;

    /**
     * 匹配值
     */
    private String value;

    /**
     * 是否区分大小写
     */
    private Boolean caseSensitive;

    public PathRule setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    public String getMatchType() {
        return this.matchType;
    }

    public PathRule setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public PathRule setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }

    public Boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    @Override
    public String toString() {
        return "PathRule{" + "matchType=" + matchType + "\n" + "value=" + value + "\n" + "caseSensitive=" + caseSensitive + "\n" + "}";
    }

}