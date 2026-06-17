package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstUserOpAuthorizeRuleResponse {
    /**
     * 规则ID（获取授权规则列表接口返回）
     */
    private String ruleId;

    /**
     * 规则名称（获取授权规则列表接口返回）
     */
    private String ruleName;

    /**
     * 预授权事件分类（UnplannedMaintenanceEvent / PlannedMaintenanceEvent）（获取授权规则列表接口返回）
     */
    private String serverEventCategory;

    /**
     * 规则关联的范围（获取授权规则列表接口返回）
     */
    private String effectiveScope;

    /**
     * 规则状态（ DISABLED / ENABLED）（获取授权规则列表接口返回）
     */
    private String status;

    /**
     * 标签（获取授权规则列表接口返回）
     */
    private List<TagModel> tags;

    /**
     * 授权方法（TamAuthorize / Repair / Reboot）（获取授权规则列表接口返回）
     */
    private List<String> authorizeMaintenanceOperations;

    /**
     * 创建时间，符合BCE规范的日期格式（获取授权规则列表接口返回）
     */
    private String createTime;

    public InstUserOpAuthorizeRuleResponse setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    public String getRuleId() {
        return this.ruleId;
    }

    public InstUserOpAuthorizeRuleResponse setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public String getRuleName() {
        return this.ruleName;
    }

    public InstUserOpAuthorizeRuleResponse setServerEventCategory(String serverEventCategory) {
        this.serverEventCategory = serverEventCategory;
        return this;
    }

    public String getServerEventCategory() {
        return this.serverEventCategory;
    }

    public InstUserOpAuthorizeRuleResponse setEffectiveScope(String effectiveScope) {
        this.effectiveScope = effectiveScope;
        return this;
    }

    public String getEffectiveScope() {
        return this.effectiveScope;
    }

    public InstUserOpAuthorizeRuleResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public InstUserOpAuthorizeRuleResponse setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    public InstUserOpAuthorizeRuleResponse setAuthorizeMaintenanceOperations(List<String> authorizeMaintenanceOperations) {
        this.authorizeMaintenanceOperations = authorizeMaintenanceOperations;
        return this;
    }

    public List<String> getAuthorizeMaintenanceOperations() {
        return this.authorizeMaintenanceOperations;
    }

    public InstUserOpAuthorizeRuleResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    @Override
    public String toString() {
        return "InstUserOpAuthorizeRuleResponse{" + "ruleId=" + ruleId + "\n" + "ruleName=" + ruleName + "\n" + "serverEventCategory=" + serverEventCategory + "\n"
                + "effectiveScope=" + effectiveScope + "\n" + "status=" + status + "\n" + "tags=" + tags + "\n" + "authorizeMaintenanceOperations="
                + authorizeMaintenanceOperations + "\n" + "createTime=" + createTime + "\n" + "}";
    }

}