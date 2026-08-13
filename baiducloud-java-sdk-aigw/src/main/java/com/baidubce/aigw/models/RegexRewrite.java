package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegexRewrite {
    /**
     * 正则匹配表达式
     */
    private String match;

    /**
     * 重写模板，支持捕获组引用
     */
    private String rewrite;

    public RegexRewrite setMatch(String match) {
        this.match = match;
        return this;
    }

    public String getMatch() {
        return this.match;
    }

    public RegexRewrite setRewrite(String rewrite) {
        this.rewrite = rewrite;
        return this;
    }

    public String getRewrite() {
        return this.rewrite;
    }

    @Override
    public String toString() {
        return "RegexRewrite{" + "match=" + match + "\n" + "rewrite=" + rewrite + "\n" + "}";
    }

}