package com.baidubce.ccr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RobotPermission {
    /**
     * 固定值为 `project`
     */
    private String kind;

    /**
     * 命名空间名称，如果是选择所有命名空间，则展示 `*`
     */
    private String namespace;

    /**
     * 访问权限内容
     */
    private List<RobotPermissionAccess> access;

    public RobotPermission setKind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getKind() {
        return this.kind;
    }

    public RobotPermission setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public RobotPermission setAccess(List<RobotPermissionAccess> access) {
        this.access = access;
        return this;
    }

    public List<RobotPermissionAccess> getAccess() {
        return this.access;
    }

    @Override
    public String toString() {
        return "RobotPermission{" + "kind=" + kind + "\n" + "namespace=" + namespace + "\n" + "access=" + access + "\n" + "}";
    }

}