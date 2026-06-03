package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAuthGroupsRequest extends BaseBceRequest {

    /**
    * 待查询的 rapidFS 实例唯一 ID
    */
    private String instanceId;

    /**
    * 条件筛选，见附录 Filter，多组 filter 之间为条件与关系，多个 value 之间为条件或关系。当前支持字段:* name=authGroupId，例如 value=["ag-AOLmxozuEqas", "ag-MuzHGS8WtjHq"]
    */
    private List<Filter> filters;

    /**
    * 返回列表长度，有效范围 [1, 1000]，默认 100
    */
    private Integer maxKeys;

    /**
    * 批量获取列表的查询的起始位置，返回列表按 authGroupId 字典序排序， 取值为上一次返回的 nextMarker
    */
    private String marker;

    public String getInstanceId() {
        return instanceId;
    }

    public DescribeAuthGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeAuthGroupsRequest setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeAuthGroupsRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeAuthGroupsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

}
