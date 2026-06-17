package com.baidubce.bls.models;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    /**
     * 查询耗时
     */
    private Integer took;

    /**
     * 是否超时
     */
    private Boolean timedOut;

    /**
     * shards
     */
    private Shard shards;

    /**
     * 命中的文档
     */
    private Map<String, List<Hit>> hits;

    /**
     * 聚合结果，参考[官网](https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-async-search-submit)
     */
    private Map<String, Object> aggregations;

    public Response setTook(Integer took) {
        this.took = took;
        return this;
    }

    public Integer getTook() {
        return this.took;
    }

    public Response setTimedOut(Boolean timedOut) {
        this.timedOut = timedOut;
        return this;
    }

    public Boolean getTimedOut() {
        return this.timedOut;
    }

    public Response setShards(Shard shards) {
        this.shards = shards;
        return this;
    }

    public Shard getShards() {
        return this.shards;
    }

    public Response setHits(Map<String, List<Hit>> hits) {
        this.hits = hits;
        return this;
    }

    public Map<String, List<Hit>> getHits() {
        return this.hits;
    }

    public Response setAggregations(Map<String, Object> aggregations) {
        this.aggregations = aggregations;
        return this;
    }

    public Map<String, Object> getAggregations() {
        return this.aggregations;
    }

    @Override
    public String toString() {
        return "Response{" + "took=" + took + "\n" + "timedOut=" + timedOut + "\n" + "shards=" + shards + "\n" + "hits=" + hits + "\n" + "aggregations=" + aggregations + "\n"
                + "}";
    }

}