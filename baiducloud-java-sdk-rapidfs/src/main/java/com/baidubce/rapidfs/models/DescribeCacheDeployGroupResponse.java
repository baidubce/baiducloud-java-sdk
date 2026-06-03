package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeCacheDeployGroupResponse extends BaseBceResponse {

    /**
    * cacheDeployGroupInfo
    */
    private CacheDeployGroupInfo cacheDeployGroupInfo;

    public CacheDeployGroupInfo getCacheDeployGroupInfo() {
        return cacheDeployGroupInfo;
    }

    public DescribeCacheDeployGroupResponse setCacheDeployGroupInfo(CacheDeployGroupInfo cacheDeployGroupInfo) {
        this.cacheDeployGroupInfo = cacheDeployGroupInfo;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeCacheDeployGroupResponse{" + "cacheDeployGroupInfo=" + cacheDeployGroupInfo + "\n" + "}";
    }

}
