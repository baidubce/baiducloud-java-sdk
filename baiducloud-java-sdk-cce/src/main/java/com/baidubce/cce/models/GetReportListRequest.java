package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetReportListRequest extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

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
    * inspectionType
    */
    @JsonIgnore
    private String inspectionType;

    /**
    * inspectionStatus
    */
    @JsonIgnore
    private String inspectionStatus;

    public String getClusterID() {
        return clusterID;
    }

    public GetReportListRequest setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public GetReportListRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public GetReportListRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getInspectionType() {
        return inspectionType;
    }

    public GetReportListRequest setInspectionType(String inspectionType) {
        this.inspectionType = inspectionType;
        return this;
    }

    public String getInspectionStatus() {
        return inspectionStatus;
    }

    public GetReportListRequest setInspectionStatus(String inspectionStatus) {
        this.inspectionStatus = inspectionStatus;
        return this;
    }

}
