package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveRolePermissionsRequest extends BaseBceRequest {

    /**
    * roleName
    */
    @JsonIgnore
    private String roleName;

    /**
    * policyName
    */
    @JsonIgnore
    private String policyName;

    /**
    * policyType
    */
    @JsonIgnore
    private String policyType;

    public String getRoleName() {
        return roleName;
    }

    public RemoveRolePermissionsRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public String getPolicyName() {
        return policyName;
    }

    public RemoveRolePermissionsRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    public String getPolicyType() {
        return policyType;
    }

    public RemoveRolePermissionsRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

}
