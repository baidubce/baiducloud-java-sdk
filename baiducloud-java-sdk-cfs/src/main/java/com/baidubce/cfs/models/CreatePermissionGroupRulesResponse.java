package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatePermissionGroupRulesResponse extends BaseBceResponse {

    /**
    * 权限组规则的标识符
    */
    private Integer accessRuleId;

    public Integer getAccessRuleId() {
        return accessRuleId;
    }

    public CreatePermissionGroupRulesResponse setAccessRuleId(Integer accessRuleId) {
        this.accessRuleId = accessRuleId;
        return this;
    }

    @Override
    public String toString() {
        return "CreatePermissionGroupRulesResponse{" + "accessRuleId=" + accessRuleId + "\n" + "}";
    }

}
