package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheIpAddressesOccupiedByProductsWithinVpcRequest {

    /**
    * vpcId
    */
    @JsonIgnore
    private String vpcId;

    /**
    * subnetId
    */
    @JsonIgnore
    private String subnetId;

    /**
    * resourceType
    */
    @JsonIgnore
    private String resourceType;

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


    public String getVpcId() {
        return vpcId;
    }

    public QueryTheIpAddressesOccupiedByProductsWithinVpcRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public QueryTheIpAddressesOccupiedByProductsWithinVpcRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public QueryTheIpAddressesOccupiedByProductsWithinVpcRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public QueryTheIpAddressesOccupiedByProductsWithinVpcRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public QueryTheIpAddressesOccupiedByProductsWithinVpcRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


}
