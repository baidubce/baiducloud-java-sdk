package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMysqlSlowLogTrendRequest extends BaseBceRequest {

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

    public GetMysqlSlowLogTrendRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getStart() {
        return start;
    }

    public GetMysqlSlowLogTrendRequest setStart(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public GetMysqlSlowLogTrendRequest setEnd(String end) {
        this.end = end;
        return this;
    }

    public String getPeriod() {
        return period;
    }

    public GetMysqlSlowLogTrendRequest setPeriod(String period) {
        this.period = period;
        return this;
    }

}
