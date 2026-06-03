package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveCacheNodesRequest extends BaseBceRequest {

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
    * 待移除的 CacheNode ID 列表
    */
    private List<String> cacheNodeIds;

    /**
    * 节点连接状态离线时，是否强制移除
    */
    private Boolean forceRemoveOnOffline;

    public String getClientToken() {
        return clientToken;
    }

    public RemoveCacheNodesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public RemoveCacheNodesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<String> getCacheNodeIds() {
        return cacheNodeIds;
    }

    public RemoveCacheNodesRequest setCacheNodeIds(List<String> cacheNodeIds) {
        this.cacheNodeIds = cacheNodeIds;
        return this;
    }

    public Boolean getForceRemoveOnOffline() {
        return forceRemoveOnOffline;
    }

    public RemoveCacheNodesRequest setForceRemoveOnOffline(Boolean forceRemoveOnOffline) {
        this.forceRemoveOnOffline = forceRemoveOnOffline;
        return this;
    }

}
