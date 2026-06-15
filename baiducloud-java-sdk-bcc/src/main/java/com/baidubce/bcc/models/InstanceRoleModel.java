package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceRoleModel {
    /**
     * 角色名称
     */
    private String roleName;

    public InstanceRoleModel setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public String getRoleName() {
        return this.roleName;
    }

    @Override
    public String toString() {
        return "InstanceRoleModel{" + "roleName=" + roleName + "\n" + "}";
    }

}