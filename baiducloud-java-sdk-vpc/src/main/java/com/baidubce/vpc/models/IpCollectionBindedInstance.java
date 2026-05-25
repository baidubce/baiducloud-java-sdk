package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IpCollectionBindedInstance {
    /**
     * 参数模板绑定的实例ID
     */
    private String instanceId;

    /**
     * 参数模板绑定的实例类型，目前暂时仅"ESG"，表示企业安全组
     */
    private String instanceType;

    public IpCollectionBindedInstance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public IpCollectionBindedInstance setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    @Override
    public String toString() {
        return "IpCollectionBindedInstance{" + "instanceId=" + instanceId + "\n" + "instanceType=" + instanceType + "\n" + "}";
    }

}