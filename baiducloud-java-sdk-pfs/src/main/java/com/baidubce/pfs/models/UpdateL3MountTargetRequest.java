package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateL3MountTargetRequest extends BaseBceRequest {

    /**
    * PFS 实例 ID
    */
    private String instanceId;

    /**
    * 挂载点 ID
    */
    private String mountTargetId;

    /**
    * 传入该值时更新挂载点禁用状态，传 1 禁用、传 0 启用；不传表示不修改状态
    */
    private Integer admissionStatus;

    /**
    * 传入该值时更新挂载点名称，长度 1~128 个字符，不可为空串；不传表示不改名
    */
    private String name;

    /**
    * 传入该值时更新绑定的权限组；不传表示不修改
    */
    private String accessGroupName;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateL3MountTargetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getMountTargetId() {
        return mountTargetId;
    }

    public UpdateL3MountTargetRequest setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
        return this;
    }

    public Integer getAdmissionStatus() {
        return admissionStatus;
    }

    public UpdateL3MountTargetRequest setAdmissionStatus(Integer admissionStatus) {
        this.admissionStatus = admissionStatus;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateL3MountTargetRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getAccessGroupName() {
        return accessGroupName;
    }

    public UpdateL3MountTargetRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }

}
