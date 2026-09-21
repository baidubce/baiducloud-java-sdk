package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMongodbSlowLogTrendRequest extends BaseBceRequest {

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
    * period
    */
    @JsonIgnore
    private String period;

    public String getNodeId() {
        return nodeId;
    }

    public GetMongodbSlowLogTrendRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getStart() {
        return start;
    }

    public GetMongodbSlowLogTrendRequest setStart(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public GetMongodbSlowLogTrendRequest setEnd(String end) {
        this.end = end;
        return this;
    }

    public String getPeriod() {
        return period;
    }

    public GetMongodbSlowLogTrendRequest setPeriod(String period) {
        this.period = period;
        return this;
    }

}
