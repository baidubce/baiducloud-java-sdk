package com.baidubce.as.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExecRuleV2Request extends BaseBceRequest {

    /**
    * groupId
    */
    @JsonIgnore
    private String groupId;

    /**
    * execRule
    */
    @JsonIgnore
    private String execRule;

    /**
    * 伸缩组规则的 ID
    */
    private String ruleId;

    public String getGroupId() {
        return groupId;
    }

    public ExecRuleV2Request setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getExecRule() {
        return execRule;
    }

    public ExecRuleV2Request setExecRule(String execRule) {
        this.execRule = execRule;
        return this;
    }

    public String getRuleId() {
        return ruleId;
    }

    public ExecRuleV2Request setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

}
