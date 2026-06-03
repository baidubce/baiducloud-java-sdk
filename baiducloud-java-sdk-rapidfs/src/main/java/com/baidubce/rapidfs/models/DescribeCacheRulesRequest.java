package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeCacheRulesRequest extends BaseBceRequest {

    /**
    * RapidFS 实例 ID
    */
    private String instanceId;

    /**
    * 条件筛选，见附录 Filter，多组 filter 之间为条件与关系，多个 value 之间为条件或关系。当前支持字段:* name=dataSrcId，按数据源 ID 筛选，例如 value=["ds-AOLmxozuEqas",  "ds-kykIYfOmY9ZU"]；* name=cacheRuleId，例如
    * value=["df-HljnqUtZBazs", "df-3LwVtPjGYPij"]；
    */
    private List<Filter> filters;

    /**
    * 返回列表长度，有效范围 [1, 1000]，默认 100
    */
    private Integer maxKeys;

    /**
    * 批量获取列表的查询的起始位置，返回列表按 cacheRuleId 字典序排序，取值为上一次返回的 nextMarker
    */
    private String marker;

    public String getInstanceId() {
        return instanceId;
    }

    public DescribeCacheRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeCacheRulesRequest setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeCacheRulesRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeCacheRulesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

}
