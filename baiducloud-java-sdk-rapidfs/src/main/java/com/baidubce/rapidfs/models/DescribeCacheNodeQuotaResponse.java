package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeCacheNodeQuotaResponse extends BaseBceResponse {

    /**
    * cacheNodeQuotaInfo
    */
    private CacheNodeQuotaInfo cacheNodeQuotaInfo;

    public CacheNodeQuotaInfo getCacheNodeQuotaInfo() {
        return cacheNodeQuotaInfo;
    }

    public DescribeCacheNodeQuotaResponse setCacheNodeQuotaInfo(CacheNodeQuotaInfo cacheNodeQuotaInfo) {
        this.cacheNodeQuotaInfo = cacheNodeQuotaInfo;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeCacheNodeQuotaResponse{" + "cacheNodeQuotaInfo=" + cacheNodeQuotaInfo + "\n" + "}";
    }

}
