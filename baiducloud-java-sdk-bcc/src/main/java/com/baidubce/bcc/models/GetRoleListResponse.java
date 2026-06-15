package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetRoleListResponse extends BaseBceResponse {

    /**
    * 实例角色列表
    */
    private List<InstanceRoleModel> roles;

    public List<InstanceRoleModel> getRoles() {
        return roles;
    }

    public GetRoleListResponse setRoles(List<InstanceRoleModel> roles) {
        this.roles = roles;
        return this;
    }

    @Override
    public String toString() {
        return "GetRoleListResponse{" + "roles=" + roles + "\n" + "}";
    }

}
