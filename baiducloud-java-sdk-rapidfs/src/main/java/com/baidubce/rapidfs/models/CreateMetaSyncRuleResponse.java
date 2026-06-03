package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateMetaSyncRuleResponse extends BaseBceResponse {

    /**
    * 元数据同步规则唯一 ID
    */
    private String metaSyncRuleId;

    public String getMetaSyncRuleId() {
        return metaSyncRuleId;
    }

    public CreateMetaSyncRuleResponse setMetaSyncRuleId(String metaSyncRuleId) {
        this.metaSyncRuleId = metaSyncRuleId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateMetaSyncRuleResponse{" + "metaSyncRuleId=" + metaSyncRuleId + "\n" + "}";
    }

}
