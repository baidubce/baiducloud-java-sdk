package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListChartsRequest extends BaseBceRequest {

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

    public ListChartsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public ListChartsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getChartName() {
        return chartName;
    }

    public ListChartsRequest setChartName(String chartName) {
        this.chartName = chartName;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListChartsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListChartsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
