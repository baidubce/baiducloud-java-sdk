package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HaVipBindedInstance {
    /**
     * 绑定的实例ID
     */
    private String instanceId;

    /**
     * 绑定的实例类型，"SERVER"表示云服务器（BCC/BBC/DCC），"ENI"表示弹性网卡
     */
    private String instanceType;

    /**
     * 主备标识，true表示主，false表示备
     */
    private Boolean master;

    public HaVipBindedInstance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public HaVipBindedInstance setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public HaVipBindedInstance setMaster(Boolean master) {
        this.master = master;
        return this;
    }

    public Boolean getMaster() {
        return this.master;
    }

    @Override
    public String toString() {
        return "HaVipBindedInstance{" + "instanceId=" + instanceId + "\n" + "instanceType=" + instanceType + "\n" + "master=" + master + "\n" + "}";
    }

}