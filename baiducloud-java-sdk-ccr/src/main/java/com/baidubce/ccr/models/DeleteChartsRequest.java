package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteChartsRequest extends BaseBceRequest {

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
    * Chart名称数组
    */
    private List<String> items;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteChartsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public DeleteChartsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public List<String> getItems() {
        return items;
    }

    public DeleteChartsRequest setItems(List<String> items) {
        this.items = items;
        return this;
    }

}
