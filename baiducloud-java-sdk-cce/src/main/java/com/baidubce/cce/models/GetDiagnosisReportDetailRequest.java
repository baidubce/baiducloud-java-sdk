package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetDiagnosisReportDetailRequest extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

    /**
    * taskID
    */
    @JsonIgnore
    private String taskID;

    public String getClusterID() {
        return clusterID;
    }

    public GetDiagnosisReportDetailRequest setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getTaskID() {
        return taskID;
    }

    public GetDiagnosisReportDetailRequest setTaskID(String taskID) {
        this.taskID = taskID;
        return this;
    }

}
