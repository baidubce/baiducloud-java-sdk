package com.baidubce.rapidfs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthGroupInfo {
    /**
     * 权限组ID
     */
    private String authGroupId;

    /**
     * 权限组名称
     */
    private String authGroupName;

    /**
     * 所属 rapidFS 实例唯一ID
     */
    private String instanceId;

    /**
     * 权限组状态，见 AuthGroupStatus
     */
    private String status;

    /**
     * 描述
     */
    private String description;

    /**
     * 权限组中的权限列表
     */
    private List<AuthInfo> authInfos;

    public AuthGroupInfo setAuthGroupId(String authGroupId) {
        this.authGroupId = authGroupId;
        return this;
    }

    public String getAuthGroupId() {
        return this.authGroupId;
    }

    public AuthGroupInfo setAuthGroupName(String authGroupName) {
        this.authGroupName = authGroupName;
        return this;
    }

    public String getAuthGroupName() {
        return this.authGroupName;
    }

    public AuthGroupInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public AuthGroupInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public AuthGroupInfo setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public AuthGroupInfo setAuthInfos(List<AuthInfo> authInfos) {
        this.authInfos = authInfos;
        return this;
    }

    public List<AuthInfo> getAuthInfos() {
        return this.authInfos;
    }

    @Override
    public String toString() {
        return "AuthGroupInfo{" + "authGroupId=" + authGroupId + "\n" + "authGroupName=" + authGroupName + "\n" + "instanceId=" + instanceId + "\n" + "status=" + status + "\n"
                + "description=" + description + "\n" + "authInfos=" + authInfos + "\n" + "}";
    }

}