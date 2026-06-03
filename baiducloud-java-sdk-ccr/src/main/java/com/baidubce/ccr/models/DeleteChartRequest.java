package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteChartRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * projectName
    */
    @JsonIgnore
    private String projectName;

    /**
    * chartName
    */
    @JsonIgnore
    private String chartName;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteChartRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public DeleteChartRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getChartName() {
        return chartName;
    }

    public DeleteChartRequest setChartName(String chartName) {
        this.chartName = chartName;
        return this;
    }

}
