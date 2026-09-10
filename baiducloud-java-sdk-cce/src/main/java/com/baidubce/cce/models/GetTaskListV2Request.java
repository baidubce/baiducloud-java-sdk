package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTaskListV2Request extends BaseBceRequest {

    /**
    * taskType
    */
    @JsonIgnore
    private String taskType;

    /**
    * targetID
    */
    @JsonIgnore
    private String targetID;

    /**
    * operationType
    */
    @JsonIgnore
    private String operationType;

    /**
    * phase
    */
    @JsonIgnore
    private String phase;

    /**
    * order
    */
    @JsonIgnore
    private String order;

    /**
    * orderBy
    */
    @JsonIgnore
    private String orderBy;

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

    public String getTaskType() {
        return taskType;
    }

    public GetTaskListV2Request setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    public String getTargetID() {
        return targetID;
    }

    public GetTaskListV2Request setTargetID(String targetID) {
        this.targetID = targetID;
        return this;
    }

    public String getOperationType() {
        return operationType;
    }

    public GetTaskListV2Request setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    public String getPhase() {
        return phase;
    }

    public GetTaskListV2Request setPhase(String phase) {
        this.phase = phase;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public GetTaskListV2Request setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public GetTaskListV2Request setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public GetTaskListV2Request setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public GetTaskListV2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
