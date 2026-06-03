package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAcceleratorFiltersRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * policyName
    */
    @JsonIgnore
    private String policyName;

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

    public ListAcceleratorFiltersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getPolicyName() {
        return policyName;
    }

    public ListAcceleratorFiltersRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListAcceleratorFiltersRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListAcceleratorFiltersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
