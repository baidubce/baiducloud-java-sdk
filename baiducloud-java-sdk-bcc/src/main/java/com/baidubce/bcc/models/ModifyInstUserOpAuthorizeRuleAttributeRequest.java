package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyInstUserOpAuthorizeRuleAttributeRequest extends BaseBceRequest {

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * 是否启用立即启用预授权，默认为1，开启
    */
    private Integer enableRule;

    /**
    * 预授权方法（Repair / Reboot / TamAuthorize）
    */
    private List<String> authorizeMaintenanceOperations;

    /**
    * 规则名称
    */
    private String ruleName;

    /**
    * 规则ID
    */
    private String ruleId;

    public String getAction() {
        return action;
    }

    public ModifyInstUserOpAuthorizeRuleAttributeRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public Integer getEnableRule() {
        return enableRule;
    }

    public ModifyInstUserOpAuthorizeRuleAttributeRequest setEnableRule(Integer enableRule) {
        this.enableRule = enableRule;
        return this;
    }

    public List<String> getAuthorizeMaintenanceOperations() {
        return authorizeMaintenanceOperations;
    }

    public ModifyInstUserOpAuthorizeRuleAttributeRequest setAuthorizeMaintenanceOperations(List<String> authorizeMaintenanceOperations) {
        this.authorizeMaintenanceOperations = authorizeMaintenanceOperations;
        return this;
    }

    public String getRuleName() {
        return ruleName;
    }

    public ModifyInstUserOpAuthorizeRuleAttributeRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public String getRuleId() {
        return ruleId;
    }

    public ModifyInstUserOpAuthorizeRuleAttributeRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

}
