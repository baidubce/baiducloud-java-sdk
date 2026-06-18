package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveGroupPermissionsRequest extends BaseBceRequest {

    /**
    * groupName
    */
    @JsonIgnore
    private String groupName;

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

    public String getGroupName() {
        return groupName;
    }

    public RemoveGroupPermissionsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getPolicyName() {
        return policyName;
    }

    public RemoveGroupPermissionsRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    public String getPolicyType() {
        return policyType;
    }

    public RemoveGroupPermissionsRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

}
