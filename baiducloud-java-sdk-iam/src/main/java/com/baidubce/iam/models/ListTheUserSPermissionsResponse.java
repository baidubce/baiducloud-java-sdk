package com.baidubce.iam.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTheUserSPermissionsResponse extends BaseBceResponse {

    /**
    * 策略对象的列表
    */
    private List<PolicyModel> policies;

    public List<PolicyModel> getPolicies() {
        return policies;
    }

    public ListTheUserSPermissionsResponse setPolicies(List<PolicyModel> policies) {
        this.policies = policies;
        return this;
    }

    @Override
    public String toString() {
        return "ListTheUserSPermissionsResponse{" + "policies=" + policies + "\n" + "}";
    }

}
