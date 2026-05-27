package com.baidubce.csn.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CsnRtPropagation {
    /**
     * 网络实例在云智能网中的身份ID
     */
    private String attachId;

    /**
     * 学习关系的描述信息
     */
    private String description;

    /**
     * 网络实例的ID
     */
    private String instanceId;

    /**
     * 网络实例的名称
     */
    private String instanceName;

    /**
     * 网络实例所属region
     */
    private String instanceRegion;

    /**
     * 网络实例类型，取值 [ vpc \| channel \| bec_vpc ]
     */
    private String instanceType;

    /**
     * 学习关系的状态
     */
    private String status;

    public CsnRtPropagation setAttachId(String attachId) {
        this.attachId = attachId;
        return this;
    }

    public String getAttachId() {
        return this.attachId;
    }

    public CsnRtPropagation setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public CsnRtPropagation setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public CsnRtPropagation setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public CsnRtPropagation setInstanceRegion(String instanceRegion) {
        this.instanceRegion = instanceRegion;
        return this;
    }

    public String getInstanceRegion() {
        return this.instanceRegion;
    }

    public CsnRtPropagation setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public CsnRtPropagation setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "CsnRtPropagation{" + "attachId=" + attachId + "\n" + "description=" + description + "\n" + "instanceId=" + instanceId + "\n" + "instanceName=" + instanceName
                + "\n" + "instanceRegion=" + instanceRegion + "\n" + "instanceType=" + instanceType + "\n" + "status=" + status + "\n" + "}";
    }

}