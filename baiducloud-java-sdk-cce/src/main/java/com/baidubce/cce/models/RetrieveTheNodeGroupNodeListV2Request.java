package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RetrieveTheNodeGroupNodeListV2Request extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

    /**
    * instanceGroupID
    */
    @JsonIgnore
    private String instanceGroupID;

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

    public String getClusterID() {
        return clusterID;
    }

    public RetrieveTheNodeGroupNodeListV2Request setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getInstanceGroupID() {
        return instanceGroupID;
    }

    public RetrieveTheNodeGroupNodeListV2Request setInstanceGroupID(String instanceGroupID) {
        this.instanceGroupID = instanceGroupID;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public RetrieveTheNodeGroupNodeListV2Request setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public RetrieveTheNodeGroupNodeListV2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
