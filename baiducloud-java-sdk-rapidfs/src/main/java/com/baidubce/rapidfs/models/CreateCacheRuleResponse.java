package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCacheRuleResponse extends BaseBceResponse {

    /**
    * 缓存管理规则唯一 ID
    */
    private String cacheRuleId;

    public String getCacheRuleId() {
        return cacheRuleId;
    }

    public CreateCacheRuleResponse setCacheRuleId(String cacheRuleId) {
        this.cacheRuleId = cacheRuleId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateCacheRuleResponse{" + "cacheRuleId=" + cacheRuleId + "\n" + "}";
    }

}
