package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindRoleRequest extends BaseBceRequest {

    /**
    * 实例绑定的角色名称
    */
    private String roleName;

    /**
    * 要绑定角色的实例id列表
    */
    private List<InstancePassRoleModel> instances;

    public String getRoleName() {
        return roleName;
    }

    public BindRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public List<InstancePassRoleModel> getInstances() {
        return instances;
    }

    public BindRoleRequest setInstances(List<InstancePassRoleModel> instances) {
        this.instances = instances;
        return this;
    }

}
