package com.baidubce.as.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTaskV2Request extends BaseBceRequest {

    /**
    * groupid
    */
    @JsonIgnore
    private String groupid;

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

    /**
    * startTime
    */
    @JsonIgnore
    private String startTime;

    /**
    * endTime
    */
    @JsonIgnore
    private String endTime;

    public String getGroupid() {
        return groupid;
    }

    public ListTaskV2Request setGroupid(String groupid) {
        this.groupid = groupid;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListTaskV2Request setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListTaskV2Request setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListTaskV2Request setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListTaskV2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public ListTaskV2Request setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public ListTaskV2Request setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

}
