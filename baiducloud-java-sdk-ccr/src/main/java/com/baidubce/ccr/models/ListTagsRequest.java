package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTagsRequest extends BaseBceRequest {

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

    public ListTagsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public ListTagsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public ListTagsRequest setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    public String getTagName() {
        return tagName;
    }

    public ListTagsRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListTagsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListTagsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
