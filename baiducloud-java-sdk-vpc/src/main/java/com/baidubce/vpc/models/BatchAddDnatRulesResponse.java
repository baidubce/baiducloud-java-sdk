package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchAddDnatRulesResponse extends BaseBceResponse {

    /**
    * 创建的DNAT规则的ID集合
    */
    private List<String> ruleIds;

    public List<String> getRuleIds() {
        return ruleIds;
    }

    public BatchAddDnatRulesResponse setRuleIds(List<String> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }

    @Override
    public String toString() {
        return "BatchAddDnatRulesResponse{" + "ruleIds=" + ruleIds + "\n" + "}";
    }

}
