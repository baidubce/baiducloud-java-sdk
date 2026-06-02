package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MountTargetListClientsRequest extends BaseBceRequest {

    /**
    * 挂载服务ID
    */
    private String mountTargetId;

    /**
    * 返回客户端挂载列表长度，默认为100个，取值范围为【1, 500】，超过范围的规整为1或500
    */
    private Integer maxKeys;

    /**
    * 请求的分段类型，必须指定marker
    */
    private String manner;

    /**
    * 按照internalIp的字典序排列，从marker之后的第一个开始返回（不包括marker）
    */
    private String marker;

    public String getMountTargetId() {
        return mountTargetId;
    }

    public MountTargetListClientsRequest setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public MountTargetListClientsRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getManner() {
        return manner;
    }

    public MountTargetListClientsRequest setManner(String manner) {
        this.manner = manner;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public MountTargetListClientsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

}
