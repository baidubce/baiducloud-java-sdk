package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAlertTemplatesResponse extends BaseBceResponse {

    /**
    * 告警模板列表
    */
    private List<RuleTemplate> ruleTemplates;

    public List<RuleTemplate> getRuleTemplates() {
        return ruleTemplates;
    }

    public ListAlertTemplatesResponse setRuleTemplates(List<RuleTemplate> ruleTemplates) {
        this.ruleTemplates = ruleTemplates;
        return this;
    }

    @Override
    public String toString() {
        return "ListAlertTemplatesResponse{" + "ruleTemplates=" + ruleTemplates + "\n" + "}";
    }

}
