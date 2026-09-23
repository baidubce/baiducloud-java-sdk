package com.baidubce.nlp.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryItem {
    /**
     * 用户自定义的短语或问题
     */
    private String query;

    public QueryItem setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getQuery() {
        return this.query;
    }

    @Override
    public String toString() {
        return "QueryItem{" + "query=" + query + "\n" + "}";
    }

}