package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListChartVersionsRequest extends BaseBceRequest {

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
    * chartVersion
    */
    @JsonIgnore
    private String chartVersion;

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

    public ListChartVersionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public ListChartVersionsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getChartName() {
        return chartName;
    }

    public ListChartVersionsRequest setChartName(String chartName) {
        this.chartName = chartName;
        return this;
    }

    public String getChartVersion() {
        return chartVersion;
    }

    public ListChartVersionsRequest setChartVersion(String chartVersion) {
        this.chartVersion = chartVersion;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListChartVersionsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListChartVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
