package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAllSubjectsGrantedPermissionsRequest extends BaseBceRequest {

    /**
    * policyId
    */
    @JsonIgnore
    private String policyId;

    public String getPolicyId() {
        return policyId;
    }

    public ListAllSubjectsGrantedPermissionsRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

}
