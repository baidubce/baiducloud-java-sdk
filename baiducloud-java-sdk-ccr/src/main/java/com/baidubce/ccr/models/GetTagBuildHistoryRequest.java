package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTagBuildHistoryRequest extends BaseBceRequest {

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
    * repositoryName
    */
    @JsonIgnore
    private String repositoryName;

    /**
    * tagName
    */
    @JsonIgnore
    private String tagName;

    public String getInstanceId() {
        return instanceId;
    }

    public GetTagBuildHistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public GetTagBuildHistoryRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public GetTagBuildHistoryRequest setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    public String getTagName() {
        return tagName;
    }

    public GetTagBuildHistoryRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

}
