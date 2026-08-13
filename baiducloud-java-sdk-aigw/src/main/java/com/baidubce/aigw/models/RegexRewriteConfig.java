package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegexRewriteConfig {
    /**
     * 正则匹配规则
     */
    private String match;

    /**
     * 替换规则
     */
    private String rewrite;

    public RegexRewriteConfig setMatch(String match) {
        this.match = match;
        return this;
    }

    public String getMatch() {
        return this.match;
    }

    public RegexRewriteConfig setRewrite(String rewrite) {
        this.rewrite = rewrite;
        return this;
    }

    public String getRewrite() {
        return this.rewrite;
    }

    @Override
    public String toString() {
        return "RegexRewriteConfig{" + "match=" + match + "\n" + "rewrite=" + rewrite + "\n" + "}";
    }

}