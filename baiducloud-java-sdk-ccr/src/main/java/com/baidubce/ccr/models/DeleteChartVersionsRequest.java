package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteChartVersionsRequest extends BaseBceRequest {

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
    * Chart版本号数组
    */
    private List<String> items;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteChartVersionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public DeleteChartVersionsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getChartName() {
        return chartName;
    }

    public DeleteChartVersionsRequest setChartName(String chartName) {
        this.chartName = chartName;
        return this;
    }

    public List<String> getItems() {
        return items;
    }

    public DeleteChartVersionsRequest setItems(List<String> items) {
        this.items = items;
        return this;
    }

}
