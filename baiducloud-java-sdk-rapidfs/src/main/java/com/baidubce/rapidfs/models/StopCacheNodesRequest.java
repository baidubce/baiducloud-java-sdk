package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopCacheNodesRequest extends BaseBceRequest {

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
    * 待停止的 CacheNode ID 列表
    */
    private List<String> cacheNodeIds;

    /**
    * 停止节点时是否迁移数据，默认 true。不迁移数据直接停止缓存节点会导致正在读取作业的缓存命中率降低，除非有特殊情况，一般都建议先迁移数据再停止
    */
    private Boolean migrateDataBeforeStop;

    public String getClientToken() {
        return clientToken;
    }

    public StopCacheNodesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public StopCacheNodesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<String> getCacheNodeIds() {
        return cacheNodeIds;
    }

    public StopCacheNodesRequest setCacheNodeIds(List<String> cacheNodeIds) {
        this.cacheNodeIds = cacheNodeIds;
        return this;
    }

    public Boolean getMigrateDataBeforeStop() {
        return migrateDataBeforeStop;
    }

    public StopCacheNodesRequest setMigrateDataBeforeStop(Boolean migrateDataBeforeStop) {
        this.migrateDataBeforeStop = migrateDataBeforeStop;
        return this;
    }

}
