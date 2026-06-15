package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnbindRoleRequest extends BaseBceRequest {

    /**
    * 实例解绑的角色名称
    */
    private String roleName;

    /**
    * 要解绑角色的实例id列表
    */
    private List<InstancePassRoleModel> instances;

    public String getRoleName() {
        return roleName;
    }

    public UnbindRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public List<InstancePassRoleModel> getInstances() {
        return instances;
    }

    public UnbindRoleRequest setInstances(List<InstancePassRoleModel> instances) {
        this.instances = instances;
        return this;
    }

}
