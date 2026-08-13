package com.baidubce.aigw.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestRateLimit {
    /**
     * 规则名称
     */
    @JsonProperty("rule_name")
    private String ruleName;

    /**
     * 是否启用
     */
    private Boolean enabled;

    /**
     * 请求次数限流规则；每项包含 match_condition 和 limit_config
     */
    @JsonProperty("rule_items")
    private List<RuleItem> ruleItems;

    public RequestRateLimit setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public String getRuleName() {
        return this.ruleName;
    }

    public RequestRateLimit setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public RequestRateLimit setRuleItems(List<RuleItem> ruleItems) {
        this.ruleItems = ruleItems;
        return this;
    }

    public List<RuleItem> getRuleItems() {
        return this.ruleItems;
    }

    @Override
    public String toString() {
        return "RequestRateLimit{" + "ruleName=" + ruleName + "\n" + "enabled=" + enabled + "\n" + "ruleItems=" + ruleItems + "\n" + "}";
    }

}