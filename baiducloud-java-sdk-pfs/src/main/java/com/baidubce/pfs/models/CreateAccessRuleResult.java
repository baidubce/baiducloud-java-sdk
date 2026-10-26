package com.baidubce.pfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAccessRuleResult {
    /**
     * 该条规则是否创建成功
     */
    private Boolean success;

    /**
     * 创建成功时返回的规则 ID
     */
    private Integer accessRuleId;

    /**
     * 创建失败的原因
     */
    private String errorMsg;

    public CreateAccessRuleResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public CreateAccessRuleResult setAccessRuleId(Integer accessRuleId) {
        this.accessRuleId = accessRuleId;
        return this;
    }

    public Integer getAccessRuleId() {
        return this.accessRuleId;
    }

    public CreateAccessRuleResult setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    @Override
    public String toString() {
        return "CreateAccessRuleResult{" + "success=" + success + "\n" + "accessRuleId=" + accessRuleId + "\n" + "errorMsg=" + errorMsg + "\n" + "}";
    }

}
