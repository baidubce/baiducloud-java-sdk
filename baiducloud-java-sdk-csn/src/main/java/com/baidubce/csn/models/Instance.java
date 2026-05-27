package com.baidubce.csn.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Instance {
    /**
     * 网络实例在云智能网中的身份ID
     */
    private String attachId;

    /**
     * 取值 [ vpc \| channel \| bec_vpc ]，分别表示私有网络、专线通道、边缘网络
     */
    private String instanceType;

    /**
     * 网络实例的ID
     */
    private String instanceId;

    /**
     * 网络实例的名称
     */
    private String instanceName;

    /**
     * 网络实例所属地域
     */
    private String instanceRegion;

    /**
     * 网络实例所属的主账号ID
     */
    private String instanceAccountId;

    /**
     * 网络实例状态，取值 [ attached \| attaching \| detaching \| attach_failed ]，分别表示已加载、加载中、卸载中、加载失败
     */
    private String status;

    public Instance setAttachId(String attachId) {
        this.attachId = attachId;
        return this;
    }

    public String getAttachId() {
        return this.attachId;
    }

    public Instance setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public Instance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public Instance setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public Instance setInstanceRegion(String instanceRegion) {
        this.instanceRegion = instanceRegion;
        return this;
    }

    public String getInstanceRegion() {
        return this.instanceRegion;
    }

    public Instance setInstanceAccountId(String instanceAccountId) {
        this.instanceAccountId = instanceAccountId;
        return this;
    }

    public String getInstanceAccountId() {
        return this.instanceAccountId;
    }

    public Instance setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "Instance{" + "attachId=" + attachId + "\n" + "instanceType=" + instanceType + "\n" + "instanceId=" + instanceId + "\n" + "instanceName=" + instanceName + "\n"
                + "instanceRegion=" + instanceRegion + "\n" + "instanceAccountId=" + instanceAccountId + "\n" + "status=" + status + "\n" + "}";
    }

}