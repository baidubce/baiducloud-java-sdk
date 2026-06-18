package com.baidubce.iam.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListRolesResponse extends BaseBceResponse {

    /**
    * 角色对象的列表
    */
    private List<RoleModel> roles;

    public List<RoleModel> getRoles() {
        return roles;
    }

    public ListRolesResponse setRoles(List<RoleModel> roles) {
        this.roles = roles;
        return this;
    }

    @Override
    public String toString() {
        return "ListRolesResponse{" + "roles=" + roles + "\n" + "}";
    }

}
