package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListL2PolicyRequest extends BaseBceRequest {

    /**
    * policyId对应的pfs实例短id
    */
    private String instanceId;

    /**
    * 本次请求返回数量，默认为20
    */
    private Integer maxKeys;

    /**
    * 上一次返回的nextMarker的值，用于分段遍历list所有task使用，下次将从该makrer处继续往后返回值
    */
    private String marker;

    public String getInstanceId() {
        return instanceId;
    }

    public ListL2PolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListL2PolicyRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListL2PolicyRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

}
