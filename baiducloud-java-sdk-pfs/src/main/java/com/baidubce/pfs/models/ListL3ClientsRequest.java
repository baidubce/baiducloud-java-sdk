package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListL3ClientsRequest extends BaseBceRequest {

    /**
    * PFS 实例 ID
    */
    private String instanceId;

    /**
    * 按 clientIp 的字典序排列，从 marker 之后开始返回（不含 marker），默认空串
    */
    private String marker;

    /**
    * 本次最多返回的客户端数量，默认 1000；传 ≤ 0 会被纠正为 1，传 > 1000 会被纠正为 1000
    */
    private Integer maxKeys;

    public String getInstanceId() {
        return instanceId;
    }

    public ListL3ClientsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListL3ClientsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListL3ClientsRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
