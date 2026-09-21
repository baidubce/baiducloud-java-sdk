package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPegadbSlowLogTimeDistributionRequest extends BaseBceRequest {

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

    public GetPegadbSlowLogTimeDistributionRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getStart() {
        return start;
    }

    public GetPegadbSlowLogTimeDistributionRequest setStart(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public GetPegadbSlowLogTimeDistributionRequest setEnd(String end) {
        this.end = end;
        return this;
    }

    public String getDbEngine() {
        return dbEngine;
    }

    public GetPegadbSlowLogTimeDistributionRequest setDbEngine(String dbEngine) {
        this.dbEngine = dbEngine;
        return this;
    }

}
