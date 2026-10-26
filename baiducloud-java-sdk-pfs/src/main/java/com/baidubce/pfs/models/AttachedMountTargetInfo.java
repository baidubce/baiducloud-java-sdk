package com.baidubce.pfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttachedMountTargetInfo {
    /**
     * 挂载点 ID
     */
    private String mountTargetId;

    /**
     * 挂载点名称
     */
    private String mountTargetName;

    /**
     * 所属实例 ID
     */
    private String instanceId;

    /**
     * 所属实例名称
     */
    private String instanceName;

    public AttachedMountTargetInfo setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
        return this;
    }

    public String getMountTargetId() {
        return this.mountTargetId;
    }

    public AttachedMountTargetInfo setMountTargetName(String mountTargetName) {
        this.mountTargetName = mountTargetName;
        return this;
    }

    public String getMountTargetName() {
        return this.mountTargetName;
    }

    public AttachedMountTargetInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachedMountTargetInfo setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    @Override
    public String toString() {
        return "AttachedMountTargetInfo{" + "mountTargetId=" + mountTargetId + "\n" + "mountTargetName=" + mountTargetName + "\n" + "instanceId=" + instanceId + "\n"
                + "instanceName=" + instanceName + "\n" + "}";
    }

}
