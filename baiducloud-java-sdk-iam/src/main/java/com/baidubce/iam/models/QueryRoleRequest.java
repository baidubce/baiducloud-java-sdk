package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryRoleRequest extends BaseBceRequest {

    /**
    * roleName
    */
    @JsonIgnore
    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public QueryRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

}
