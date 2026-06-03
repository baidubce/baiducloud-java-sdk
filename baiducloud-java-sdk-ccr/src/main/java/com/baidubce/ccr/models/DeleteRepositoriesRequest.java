package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteRepositoriesRequest extends BaseBceRequest {

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
    * 待删除的镜像仓库名称数组,最大100
    */
    private List<String> items;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteRepositoriesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public DeleteRepositoriesRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public List<String> getItems() {
        return items;
    }

    public DeleteRepositoriesRequest setItems(List<String> items) {
        this.items = items;
        return this;
    }

}
