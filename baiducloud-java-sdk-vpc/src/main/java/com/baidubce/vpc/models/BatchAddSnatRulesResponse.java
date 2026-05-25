package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchAddSnatRulesResponse extends BaseBceResponse {

    /**
    * 创建的SNAT规则的ID集合
    */
    private List<String> snatRuleIds;

    public List<String> getSnatRuleIds() {
        return snatRuleIds;
    }

    public BatchAddSnatRulesResponse setSnatRuleIds(List<String> snatRuleIds) {
        this.snatRuleIds = snatRuleIds;
        return this;
    }

    @Override
    public String toString() {
        return "BatchAddSnatRulesResponse{" + "snatRuleIds=" + snatRuleIds + "\n" + "}";
    }

}
