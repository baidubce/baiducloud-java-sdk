package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RobotPermissionAccess {
    /**
     * 固定值为 `repository`
     */
    private String resource;

    /**
     * 访问权限内容，`pull` 对应镜像拉取权限，`push` 对应镜像推送权限
     */
    private String action;

    public RobotPermissionAccess setResource(String resource) {
        this.resource = resource;
        return this;
    }

    public String getResource() {
        return this.resource;
    }

    public RobotPermissionAccess setAction(String action) {
        this.action = action;
        return this;
    }

    public String getAction() {
        return this.action;
    }

    @Override
    public String toString() {
        return "RobotPermissionAccess{" + "resource=" + resource + "\n" + "action=" + action + "\n" + "}";
    }

}