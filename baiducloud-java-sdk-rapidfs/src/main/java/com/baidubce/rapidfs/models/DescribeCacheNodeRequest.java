package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeCacheNodeRequest extends BaseBceRequest {

    /**
    * RapidFS 实例 ID
    */
    private String instanceId;

    /**
    * CacheNode ID
    */
    private String cacheNodeId;

    public String getInstanceId() {
        return instanceId;
    }

    public DescribeCacheNodeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getCacheNodeId() {
        return cacheNodeId;
    }

    public DescribeCacheNodeRequest setCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
        return this;
    }

}
