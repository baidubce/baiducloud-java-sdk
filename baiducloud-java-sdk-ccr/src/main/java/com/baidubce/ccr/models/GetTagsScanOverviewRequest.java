package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTagsScanOverviewRequest extends BaseBceRequest {

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

    public GetTagsScanOverviewRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public GetTagsScanOverviewRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public GetTagsScanOverviewRequest setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    public String getTagName() {
        return tagName;
    }

    public GetTagsScanOverviewRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public GetTagsScanOverviewRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public GetTagsScanOverviewRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
