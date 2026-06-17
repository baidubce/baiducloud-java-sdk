package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListLogShipperRequest extends BaseBceRequest {

    /**
    * logShipperID
    */
    @JsonIgnore
    private String logShipperID;

    /**
    * logShipperName
    */
    @JsonIgnore
    private String logShipperName;

    /**
    * project
    */
    @JsonIgnore
    private String project;

    /**
    * logStoreName
    */
    @JsonIgnore
    private String logStoreName;

    /**
    * destType
    */
    @JsonIgnore
    private String destType;

    /**
    * status
    */
    @JsonIgnore
    private String status;

    /**
    * orderBy
    */
    @JsonIgnore
    private String orderBy;

    /**
    * order
    */
    @JsonIgnore
    private String order;

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

    public String getLogShipperID() {
        return logShipperID;
    }

    public ListLogShipperRequest setLogShipperID(String logShipperID) {
        this.logShipperID = logShipperID;
        return this;
    }

    public String getLogShipperName() {
        return logShipperName;
    }

    public ListLogShipperRequest setLogShipperName(String logShipperName) {
        this.logShipperName = logShipperName;
        return this;
    }

    public String getProject() {
        return project;
    }

    public ListLogShipperRequest setProject(String project) {
        this.project = project;
        return this;
    }

    public String getLogStoreName() {
        return logStoreName;
    }

    public ListLogShipperRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getDestType() {
        return destType;
    }

    public ListLogShipperRequest setDestType(String destType) {
        this.destType = destType;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ListLogShipperRequest setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListLogShipperRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListLogShipperRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListLogShipperRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListLogShipperRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
