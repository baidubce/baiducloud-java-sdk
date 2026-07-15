package com.baidubce.cloudassistant.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Target {
    /**
     * 实例类型。枚举值：BCC，BBC
     */
    private String instanceType;

    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例名称
     */
    private String instanceName;

    /**
     * 内网IP
     */
    private String internalIp;

    /**
     * 外网IP
     */
    private String externalIp;

    /**
     * 带宽
     */
    private String bandwidth;

    public Target setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public Target setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public Target setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public Target setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }

    public String getInternalIp() {
        return this.internalIp;
    }

    public Target setExternalIp(String externalIp) {
        this.externalIp = externalIp;
        return this;
    }

    public String getExternalIp() {
        return this.externalIp;
    }

    public Target setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public String getBandwidth() {
        return this.bandwidth;
    }

    @Override
    public String toString() {
        return "Target{" + "instanceType=" + instanceType + "\n" + "instanceId=" + instanceId + "\n" + "instanceName=" + instanceName + "\n" + "internalIp=" + internalIp + "\n"
                + "externalIp=" + externalIp + "\n" + "bandwidth=" + bandwidth + "\n" + "}";
    }

}