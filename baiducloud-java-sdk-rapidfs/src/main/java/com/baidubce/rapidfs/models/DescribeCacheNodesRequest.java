package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeCacheNodesRequest extends BaseBceRequest {

    /**
    * RapidFS 实例 ID
    */
    private String instanceId;

    /**
    * 条件筛选，见附录 Filter，多组 filter 之间为条件与关系，多个 value 之间为条件或关系。当前支持字段:* name=cacheNodeId，例如 value=["wn-LVWFONLJei7W-DFfmSUFht1zt", "wn-LVWFONLJei7W-CKVxoBV6soGW"]；* name=ip，例如
    * value=["192.168.0.1", "192.168.0.2"]；* name=zone，例如 value=["zoneA", "zoneB"]；* name=status，可选枚举值参考 CacheNodeStatus，例如 value=["RUNNING","ADDING"]；*
    * name=cacheDeployGroupName，仅缓存接入类型为 K8S/CCE/AIHC 时支持，例如 value=["test-cache-deploy-group", "test-cdp"]
    */
    private List<Filter> filters;

    /**
    * 返回列表长度，有效范围 [1, 1000]，默认 100
    */
    private Integer maxKeys;

    /**
    * 批量获取列表的查询的起始位置，返回列表按 cacheNodeId 字典序排序，取值为上一次返回的 nextMarker
    */
    private String marker;

    public String getInstanceId() {
        return instanceId;
    }

    public DescribeCacheNodesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeCacheNodesRequest setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeCacheNodesRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeCacheNodesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

}
