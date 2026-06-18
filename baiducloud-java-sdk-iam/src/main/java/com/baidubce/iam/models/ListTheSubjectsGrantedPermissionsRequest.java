package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTheSubjectsGrantedPermissionsRequest extends BaseBceRequest {

    /**
    * policyId
    */
    @JsonIgnore
    private String policyId;

    /**
    * grantType
    */
    @JsonIgnore
    private String grantType;

    public String getPolicyId() {
        return policyId;
    }

    public ListTheSubjectsGrantedPermissionsRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getGrantType() {
        return grantType;
    }

    public ListTheSubjectsGrantedPermissionsRequest setGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }

}
