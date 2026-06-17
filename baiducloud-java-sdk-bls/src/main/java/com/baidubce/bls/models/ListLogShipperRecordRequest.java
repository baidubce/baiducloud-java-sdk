package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListLogShipperRecordRequest extends BaseBceRequest {

    /**
    * logShipperID
    */
    @JsonIgnore
    private String logShipperID;

    /**
    * sinceHours
    */
    @JsonIgnore
    private Integer sinceHours;

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

    public ListLogShipperRecordRequest setLogShipperID(String logShipperID) {
        this.logShipperID = logShipperID;
        return this;
    }

    public Integer getSinceHours() {
        return sinceHours;
    }

    public ListLogShipperRecordRequest setSinceHours(Integer sinceHours) {
        this.sinceHours = sinceHours;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListLogShipperRecordRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListLogShipperRecordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
