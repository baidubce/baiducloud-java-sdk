package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListL3MountTargetRequest extends BaseBceRequest {

    /**
    * PFS实例ID
    */
    private String instanceId;

    /**
    * 返回挂载点列表长度，最大为1000，默认为1000个（超过1000或者小于等于0的都规整为1000）
    */
    private Integer maxKeys;

    /**
    * 按照mountTargetId的字典序排列，从marker开始返回（包括marker）
    */
    private String marker;

    public String getInstanceId() {
        return instanceId;
    }

    public ListL3MountTargetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListL3MountTargetRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListL3MountTargetRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

}
