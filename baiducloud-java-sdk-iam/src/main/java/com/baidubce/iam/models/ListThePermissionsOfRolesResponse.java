package com.baidubce.iam.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListThePermissionsOfRolesResponse extends BaseBceResponse {

    /**
    * 策略对象的列表
    */
    private List<PolicyModel> policies;

    public List<PolicyModel> getPolicies() {
        return policies;
    }

    public ListThePermissionsOfRolesResponse setPolicies(List<PolicyModel> policies) {
        this.policies = policies;
        return this;
    }

    @Override
    public String toString() {
        return "ListThePermissionsOfRolesResponse{" + "policies=" + policies + "\n" + "}";
    }

}
