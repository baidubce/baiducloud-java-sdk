package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeCacheRuleJobsRequest extends BaseBceRequest {

    /**
    * RapidFS 实例 ID
    */
    private String instanceId;

    /**
    * 数据源 ID
    */
    private String dataSrcId;

    /**
    * 缓存管理规则 ID
    */
    private String cacheRuleId;

    /**
    * 返回列表长度，有效范围 [1, 1000]，默认 100
    */
    private Integer maxKeys;

    /**
    * 批量获取列表的查询的起始位置，返回列表按 cacheJobId 字典序排序，取值为上一次返回的 nextMarker
    */
    private String marker;

    public String getInstanceId() {
        return instanceId;
    }

    public DescribeCacheRuleJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDataSrcId() {
        return dataSrcId;
    }

    public DescribeCacheRuleJobsRequest setDataSrcId(String dataSrcId) {
        this.dataSrcId = dataSrcId;
        return this;
    }

    public String getCacheRuleId() {
        return cacheRuleId;
    }

    public DescribeCacheRuleJobsRequest setCacheRuleId(String cacheRuleId) {
        this.cacheRuleId = cacheRuleId;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeCacheRuleJobsRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeCacheRuleJobsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

}
