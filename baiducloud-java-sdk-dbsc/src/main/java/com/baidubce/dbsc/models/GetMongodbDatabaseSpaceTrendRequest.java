package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMongodbDatabaseSpaceTrendRequest extends BaseBceRequest {

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

    public GetMongodbDatabaseSpaceTrendRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getDatabase() {
        return database;
    }

    public GetMongodbDatabaseSpaceTrendRequest setDatabase(String database) {
        this.database = database;
        return this;
    }

    public Integer getPeriod() {
        return period;
    }

    public GetMongodbDatabaseSpaceTrendRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }

    public String getStart() {
        return start;
    }

    public GetMongodbDatabaseSpaceTrendRequest setStart(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public GetMongodbDatabaseSpaceTrendRequest setEnd(String end) {
        this.end = end;
        return this;
    }

    public String getMetrics() {
        return metrics;
    }

    public GetMongodbDatabaseSpaceTrendRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }

    public String getStatistics() {
        return statistics;
    }

    public GetMongodbDatabaseSpaceTrendRequest setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }

}
