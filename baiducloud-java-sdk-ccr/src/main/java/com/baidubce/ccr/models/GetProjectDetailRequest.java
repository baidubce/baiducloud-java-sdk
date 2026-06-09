package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetProjectDetailRequest extends BaseBceRequest {

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

    public String getInstanceId() {
        return instanceId;
    }

    public GetProjectDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public GetProjectDetailRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

}
