package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestartCacheNodesRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * RapidFS 实例 ID
    */
    private String instanceId;

    /**
    * 待重启的 CacheNode ID 列表
    */
    private List<String> cacheNodeIds;

    public String getClientToken() {
        return clientToken;
    }

    public RestartCacheNodesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public RestartCacheNodesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<String> getCacheNodeIds() {
        return cacheNodeIds;
    }

    public RestartCacheNodesRequest setCacheNodeIds(List<String> cacheNodeIds) {
        this.cacheNodeIds = cacheNodeIds;
        return this;
    }

}
