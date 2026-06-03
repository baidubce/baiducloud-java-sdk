package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DownloadChartRequest extends BaseBceRequest {

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
    * filename
    */
    @JsonIgnore
    private String filename;

    public String getInstanceId() {
        return instanceId;
    }

    public DownloadChartRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public DownloadChartRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getFilename() {
        return filename;
    }

    public DownloadChartRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }

}
