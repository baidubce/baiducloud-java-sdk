package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetClusterAsSlaveRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 热活主实例的访问域名，如果是跨region，需要打开对等链接的dns复制功能
    */
    private String masterDomain;

    /**
    * 热活主实例的访问端口
    */
    private Integer masterPort;

    public String getInstanceId() {
        return instanceId;
    }

    public SetClusterAsSlaveRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getMasterDomain() {
        return masterDomain;
    }

    public SetClusterAsSlaveRequest setMasterDomain(String masterDomain) {
        this.masterDomain = masterDomain;
        return this;
    }

    public Integer getMasterPort() {
        return masterPort;
    }

    public SetClusterAsSlaveRequest setMasterPort(Integer masterPort) {
        this.masterPort = masterPort;
        return this;
    }

}
