package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeCacheRuleResponse extends BaseBceResponse {

    /**
    * cacheRuleInfo
    */
    private CacheRuleInfo cacheRuleInfo;

    public CacheRuleInfo getCacheRuleInfo() {
        return cacheRuleInfo;
    }

    public DescribeCacheRuleResponse setCacheRuleInfo(CacheRuleInfo cacheRuleInfo) {
        this.cacheRuleInfo = cacheRuleInfo;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeCacheRuleResponse{" + "cacheRuleInfo=" + cacheRuleInfo + "\n" + "}";
    }

}
