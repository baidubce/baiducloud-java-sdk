package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetRedisSlowLogTimeDistributionRequest extends BaseBceRequest {

    /**
    * nodeId
    */
    @JsonIgnore
    private String nodeId;

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
    * dbEngine
    */
    @JsonIgnore
    private String dbEngine;

    public String getNodeId() {
        return nodeId;
    }

    public GetRedisSlowLogTimeDistributionRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getStart() {
        return start;
    }

    public GetRedisSlowLogTimeDistributionRequest setStart(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public GetRedisSlowLogTimeDistributionRequest setEnd(String end) {
        this.end = end;
        return this;
    }

    public String getDbEngine() {
        return dbEngine;
    }

    public GetRedisSlowLogTimeDistributionRequest setDbEngine(String dbEngine) {
        this.dbEngine = dbEngine;
        return this;
    }

}
