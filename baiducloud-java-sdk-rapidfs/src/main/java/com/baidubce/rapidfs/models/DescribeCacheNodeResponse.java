package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeCacheNodeResponse extends BaseBceResponse {

    /**
    * cacheNodeInfo
    */
    private CacheNodeInfo cacheNodeInfo;

    public CacheNodeInfo getCacheNodeInfo() {
        return cacheNodeInfo;
    }

    public DescribeCacheNodeResponse setCacheNodeInfo(CacheNodeInfo cacheNodeInfo) {
        this.cacheNodeInfo = cacheNodeInfo;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeCacheNodeResponse{" + "cacheNodeInfo=" + cacheNodeInfo + "\n" + "}";
    }

}
