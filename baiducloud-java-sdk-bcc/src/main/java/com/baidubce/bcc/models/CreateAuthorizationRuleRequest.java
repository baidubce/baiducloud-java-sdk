package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAuthorizationRuleRequest extends BaseBceRequest {

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
    * 预授权任务类型（非预期事件UnplannedMaintenanceEvent / 预期内事件PlannedMaintenanceEvent）
    */
    private String serverEventCategory;

    public String getAction() {
        return action;
    }

    public CreateAuthorizationRuleRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public Integer getEnableRule() {
        return enableRule;
    }

    public CreateAuthorizationRuleRequest setEnableRule(Integer enableRule) {
        this.enableRule = enableRule;
        return this;
    }

    public List<String> getAuthorizeMaintenanceOperations() {
        return authorizeMaintenanceOperations;
    }

    public CreateAuthorizationRuleRequest setAuthorizeMaintenanceOperations(List<String> authorizeMaintenanceOperations) {
        this.authorizeMaintenanceOperations = authorizeMaintenanceOperations;
        return this;
    }

    public String getRuleName() {
        return ruleName;
    }

    public CreateAuthorizationRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public String getServerEventCategory() {
        return serverEventCategory;
    }

    public CreateAuthorizationRuleRequest setServerEventCategory(String serverEventCategory) {
        this.serverEventCategory = serverEventCategory;
        return this;
    }

}
