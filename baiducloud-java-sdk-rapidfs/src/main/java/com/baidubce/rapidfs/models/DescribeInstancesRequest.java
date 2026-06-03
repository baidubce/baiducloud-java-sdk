package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeInstancesRequest extends BaseBceRequest {

    /**
    * 条件筛选，见附录 Filter，多组 filter 之间为条件与关系，多个 value 之间为条件或关系。当前支持字段:* name=instanceId，例如 value=["rapidfs-wKEltVDfQwgO", "rapidfs-Lp1yaDO582fz"]；* name=instanceName，例如
    * value=["filter-name", "test-name"]；* name=status, 状态枚举值参考附录 InstanceStatus，例如 value=["RUNNING", "CREATING"]；* name=aihcResourcePoolId/cceClusterId/k8sControllerId，例如
    * value=["aihc-hk25ilq7xcfd", "cce-gv45s2cp"]
    */
    private List<Filter> filters;

    /**
    * 返回实例列表长度，有效范围 [1, 1000]，默认 100
    */
    private Integer maxKeys;

    /**
    * 批量获取列表的查询的起始位置，返回列表按 instanceId 字典序排列，取值为上一次返回的 nextMarker
    */
    private String marker;

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeInstancesRequest setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeInstancesRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeInstancesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

}
