package com.baidubce.aigw.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MatchRule {
    /**
     * pathRule
     */
    private PathRule pathRule;

    /**
     * HTTP 方法列表
     */
    private List<String> methods;

    /**
     * 请求头匹配规则，每项包含 key、matchType、value
     */
    private List<MatcherRule> headers;

    /**
     * Query 参数匹配规则，每项包含 key、matchType、value
     */
    private List<MatcherRule> queryParams;

    public MatchRule setPathRule(PathRule pathRule) {
        this.pathRule = pathRule;
        return this;
    }

    public PathRule getPathRule() {
        return this.pathRule;
    }

    public MatchRule setMethods(List<String> methods) {
        this.methods = methods;
        return this;
    }

    public List<String> getMethods() {
        return this.methods;
    }

    public MatchRule setHeaders(List<MatcherRule> headers) {
        this.headers = headers;
        return this;
    }

    public List<MatcherRule> getHeaders() {
        return this.headers;
    }

    public MatchRule setQueryParams(List<MatcherRule> queryParams) {
        this.queryParams = queryParams;
        return this;
    }

    public List<MatcherRule> getQueryParams() {
        return this.queryParams;
    }

    @Override
    public String toString() {
        return "MatchRule{" + "pathRule=" + pathRule + "\n" + "methods=" + methods + "\n" + "headers=" + headers + "\n" + "queryParams=" + queryParams + "\n" + "}";
    }

}