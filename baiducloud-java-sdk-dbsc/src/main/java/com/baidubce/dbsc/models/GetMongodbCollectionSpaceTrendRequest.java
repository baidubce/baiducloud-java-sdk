package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMongodbCollectionSpaceTrendRequest extends BaseBceRequest {

    /**
    * nodeId
    */
    @JsonIgnore
    private String nodeId;

    /**
    * database
    */
    @JsonIgnore
    private String database;

    /**
    * collection
    */
    @JsonIgnore
    private String collection;

    /**
    * period
    */
    @JsonIgnore
    private Integer period;

    /**
    * start
    */
    @JsonIgnore
    private String start;

    /**
    * end
    */
    @JsonIgnore
    private String end;

    /**
    * metrics
    */
    @JsonIgnore
    private String metrics;

    /**
    * statistics
    */
    @JsonIgnore
    private String statistics;

    public String getNodeId() {
        return nodeId;
    }

    public GetMongodbCollectionSpaceTrendRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getDatabase() {
        return database;
    }

    public GetMongodbCollectionSpaceTrendRequest setDatabase(String database) {
        this.database = database;
        return this;
    }

    public String getCollection() {
        return collection;
    }

    public GetMongodbCollectionSpaceTrendRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }

    public Integer getPeriod() {
        return period;
    }

    public GetMongodbCollectionSpaceTrendRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }

    public String getStart() {
        return start;
    }

    public GetMongodbCollectionSpaceTrendRequest setStart(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public GetMongodbCollectionSpaceTrendRequest setEnd(String end) {
        this.end = end;
        return this;
    }

    public String getMetrics() {
        return metrics;
    }

    public GetMongodbCollectionSpaceTrendRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }

    public String getStatistics() {
        return statistics;
    }

    public GetMongodbCollectionSpaceTrendRequest setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }

}
