package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeCceClustersRequest extends BaseBceRequest {

    /**
    * VPC ID，仅返回归属该 VPC 的集群
    */
    private String vpcId;

    /**
    * 返回列表长度，有效范围 [1, 1000]，默认 100
    */
    private Integer maxKeys;

    /**
    * 批量获取列表的查询的起始位置，取值为上一次返回的 nextMarker
    */
    private String marker;

    public String getVpcId() {
        return vpcId;
    }

    public DescribeCceClustersRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeCceClustersRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeCceClustersRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

}
