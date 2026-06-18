package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveUserPermissionsRequest extends BaseBceRequest {

    /**
    * userName
    */
    @JsonIgnore
    private String userName;

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

    public String getUserName() {
        return userName;
    }

    public RemoveUserPermissionsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPolicyName() {
        return policyName;
    }

    public RemoveUserPermissionsRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    public String getPolicyType() {
        return policyType;
    }

    public RemoveUserPermissionsRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

}
