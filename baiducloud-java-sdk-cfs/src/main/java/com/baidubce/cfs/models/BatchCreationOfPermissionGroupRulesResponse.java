package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchCreationOfPermissionGroupRulesResponse extends BaseBceResponse {

    /**
    * 按顺序返回每条权限组规则创建的结果
    */
    private List<CreateAccessRuleResponse> responses;

    public List<CreateAccessRuleResponse> getResponses() {
        return responses;
    }

    public BatchCreationOfPermissionGroupRulesResponse setResponses(List<CreateAccessRuleResponse> responses) {
        this.responses = responses;
        return this;
    }

    @Override
    public String toString() {
        return "BatchCreationOfPermissionGroupRulesResponse{" + "responses=" + responses + "\n" + "}";
    }

}
