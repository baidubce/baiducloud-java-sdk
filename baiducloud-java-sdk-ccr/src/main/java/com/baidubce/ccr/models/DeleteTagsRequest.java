package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteTagsRequest extends BaseBceRequest {

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
    * 待删除的Tag名称数组，最大100个
    */
    private List<String> items;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteTagsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public DeleteTagsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public DeleteTagsRequest setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    public List<String> getItems() {
        return items;
    }

    public DeleteTagsRequest setItems(List<String> items) {
        this.items = items;
        return this;
    }

}
