package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListSnapchainRequest extends BaseBceRequest {

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
    * pageSize
    */
    @JsonIgnore
    private Integer pageSize;

    /**
    * pageNo
    */
    @JsonIgnore
    private Integer pageNo;

    /**
    * volumeId
    */
    @JsonIgnore
    private String volumeId;

    public String getOrderBy() {
        return orderBy;
    }

    public ListSnapchainRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListSnapchainRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListSnapchainRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListSnapchainRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public String getVolumeId() {
        return volumeId;
    }

    public ListSnapchainRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

}
