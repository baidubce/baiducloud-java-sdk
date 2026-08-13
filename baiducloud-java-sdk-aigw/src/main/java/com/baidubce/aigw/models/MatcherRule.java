package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MatcherRule {
    /**
     * 匹配键名
     */
    private String key;

    /**
     * 匹配类型
     */
    private String matchType;

    /**
     * 匹配值
     */
    private String value;

    public MatcherRule setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public MatcherRule setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    public String getMatchType() {
        return this.matchType;
    }

    public MatcherRule setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "MatcherRule{" + "key=" + key + "\n" + "matchType=" + matchType + "\n" + "value=" + value + "\n" + "}";
    }

}