package com.baidubce.aigw.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MatchRules {
    /**
     * 路径匹配规则，包含 matchType、value、caseSensitive
     */
    private Object pathRule;

    /**
     * HTTP 方法列表
     */
    private List<String> methods;

    /**
     * 请求头匹配规则
     */
    private Object headers;

    /**
     * 查询参数匹配规则
     */
    private Object queryParams;

    public MatchRules setPathRule(Object pathRule) {
        this.pathRule = pathRule;
        return this;
    }

    public Object getPathRule() {
        return this.pathRule;
    }

    public MatchRules setMethods(List<String> methods) {
        this.methods = methods;
        return this;
    }

    public List<String> getMethods() {
        return this.methods;
    }

    public MatchRules setHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    public Object getHeaders() {
        return this.headers;
    }

    public MatchRules setQueryParams(Object queryParams) {
        this.queryParams = queryParams;
        return this;
    }

    public Object getQueryParams() {
        return this.queryParams;
    }

    @Override
    public String toString() {
        return "MatchRules{" + "pathRule=" + pathRule + "\n" + "methods=" + methods + "\n" + "headers=" + headers + "\n" + "queryParams=" + queryParams + "\n" + "}";
    }

}