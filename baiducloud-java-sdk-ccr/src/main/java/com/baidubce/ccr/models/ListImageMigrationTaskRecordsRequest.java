package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListImageMigrationTaskRecordsRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * executionId
    */
    @JsonIgnore
    private String executionId;

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

    public ListImageMigrationTaskRecordsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getExecutionId() {
        return executionId;
    }

    public ListImageMigrationTaskRecordsRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListImageMigrationTaskRecordsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListImageMigrationTaskRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
