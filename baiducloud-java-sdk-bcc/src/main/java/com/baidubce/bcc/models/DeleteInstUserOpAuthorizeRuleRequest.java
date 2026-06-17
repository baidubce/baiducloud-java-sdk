package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteInstUserOpAuthorizeRuleRequest extends BaseBceRequest {

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * 预授权规则ID，只有在禁用状态DISABLED的规则才可以删除
    */
    private String ruleId;

    public String getAction() {
        return action;
    }

    public DeleteInstUserOpAuthorizeRuleRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getRuleId() {
        return ruleId;
    }

    public DeleteInstUserOpAuthorizeRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

}
