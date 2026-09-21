package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMysqlSlowLogTimeDistributionRequest extends BaseBceRequest {

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
    * dbNames
    */
    @JsonIgnore
    private String dbNames;

    /**
    * fingerprintMd5
    */
    @JsonIgnore
    private String fingerprintMd5;

    public String getNodeId() {
        return nodeId;
    }

    public GetMysqlSlowLogTimeDistributionRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getStart() {
        return start;
    }

    public GetMysqlSlowLogTimeDistributionRequest setStart(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public GetMysqlSlowLogTimeDistributionRequest setEnd(String end) {
        this.end = end;
        return this;
    }

    public String getDbNames() {
        return dbNames;
    }

    public GetMysqlSlowLogTimeDistributionRequest setDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }

    public String getFingerprintMd5() {
        return fingerprintMd5;
    }

    public GetMysqlSlowLogTimeDistributionRequest setFingerprintMd5(String fingerprintMd5) {
        this.fingerprintMd5 = fingerprintMd5;
        return this;
    }

}
