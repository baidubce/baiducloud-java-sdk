package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteChartVersionRequest extends BaseBceRequest {

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

    /**
    * chartVersion
    */
    @JsonIgnore
    private String chartVersion;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteChartVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public DeleteChartVersionRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getChartName() {
        return chartName;
    }

    public DeleteChartVersionRequest setChartName(String chartName) {
        this.chartName = chartName;
        return this;
    }

    public String getChartVersion() {
        return chartVersion;
    }

    public DeleteChartVersionRequest setChartVersion(String chartVersion) {
        this.chartVersion = chartVersion;
        return this;
    }

}
