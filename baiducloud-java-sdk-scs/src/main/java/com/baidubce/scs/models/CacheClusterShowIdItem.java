package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CacheClusterShowIdItem {
    /**
     * 实例所在地域
     */
    private String region;

    /**
     * 实例ID
     */
    private String cacheClusterShowId;

    public CacheClusterShowIdItem setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public CacheClusterShowIdItem setCacheClusterShowId(String cacheClusterShowId) {
        this.cacheClusterShowId = cacheClusterShowId;
        return this;
    }

    public String getCacheClusterShowId() {
        return this.cacheClusterShowId;
    }

    @Override
    public String toString() {
        return "CacheClusterShowIdItem{" + "region=" + region + "\n" + "cacheClusterShowId=" + cacheClusterShowId + "\n" + "}";
    }

}