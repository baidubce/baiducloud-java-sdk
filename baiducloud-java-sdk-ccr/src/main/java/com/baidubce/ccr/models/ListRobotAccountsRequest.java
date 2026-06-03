package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListRobotAccountsRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * status
    */
    @JsonIgnore
    private String status;

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

    public ListRobotAccountsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ListRobotAccountsRequest setStatus(String status) {
        this.status = status;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListRobotAccountsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListRobotAccountsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
