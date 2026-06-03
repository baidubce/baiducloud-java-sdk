package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListRepositoriesRequest extends BaseBceRequest {

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
    * pageNo
    */
    @JsonIgnore
    private Integer pageNo;

    /**
    * pageSize
    */
    @JsonIgnore
    private Integer pageSize;

    public String getInstanceId() {
        return instanceId;
    }

    public ListRepositoriesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public ListRepositoriesRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public ListRepositoriesRequest setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListRepositoriesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListRepositoriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
