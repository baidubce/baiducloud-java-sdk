package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeMetaSyncRuleResponse extends BaseBceResponse {

    /**
    * metaSyncRuleInfo
    */
    private MetaSyncRuleInfo metaSyncRuleInfo;

    public MetaSyncRuleInfo getMetaSyncRuleInfo() {
        return metaSyncRuleInfo;
    }

    public DescribeMetaSyncRuleResponse setMetaSyncRuleInfo(MetaSyncRuleInfo metaSyncRuleInfo) {
        this.metaSyncRuleInfo = metaSyncRuleInfo;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeMetaSyncRuleResponse{" + "metaSyncRuleInfo=" + metaSyncRuleInfo + "\n" + "}";
    }

}
