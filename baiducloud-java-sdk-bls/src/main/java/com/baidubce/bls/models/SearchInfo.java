package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchInfo {
    /**
     * 返回语句类型，match：检索语句，sql：分析语句，match_and_sql：包含检索和分析语句
     */
    private String queryType;

    /**
     * 统计耗时，单位毫秒
     */
    private Integer took;

    /**
     * 匹配上的总日志条数
     */
    private Integer hits;

    public SearchInfo setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }

    public String getQueryType() {
        return this.queryType;
    }

    public SearchInfo setTook(Integer took) {
        this.took = took;
        return this;
    }

    public Integer getTook() {
        return this.took;
    }

    public SearchInfo setHits(Integer hits) {
        this.hits = hits;
        return this;
    }

    public Integer getHits() {
        return this.hits;
    }

    @Override
    public String toString() {
        return "SearchInfo{" + "queryType=" + queryType + "\n" + "took=" + took + "\n" + "hits=" + hits + "\n" + "}";
    }

}