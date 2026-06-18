package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListThePermissionsOfRolesRequest extends BaseBceRequest {

    /**
    * roleName
    */
    @JsonIgnore
    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public ListThePermissionsOfRolesRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

}
