package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeCacheNodeBccCandidatesRequest extends BaseBceRequest {

    /**
    * RapidFS 实例 ID
    */
    private String instanceId;

    /**
    * VPC ID
    */
    private String vpcId;

    /**
    * 条件筛选，见附录 Filter，多组 filter 之间为条件与关系，多个 value 之间为条件或关系。当前支持字段:<br> • name=bccId，按 BCC Id 筛选，例如 value=["i-RC35eAcH", "i-5si77yc4"]；<br> • name=bccName，按 BCC 名称筛选，例如
    * value=["name1", "name2"]；<br> • name=bccIp，按 BCC ip 筛选，例如 value=["192.168.0.1", "192.168.0.2"]；<br> • name=tag，按 BCC 绑定标签批量筛选，例如 value=["tagkey:tagvalue", "tagkey"]
    */
    private List<Filter> filters;

    /**
    * 返回列表长度，有效范围 [1, 1000]，默认 100
    */
    private Integer maxKeys;

    /**
    * 批量获取列表的查询的起始位置，取值为上一次返回的 nextMarker
    */
    private String marker;

    public String getInstanceId() {
        return instanceId;
    }

    public DescribeCacheNodeBccCandidatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public DescribeCacheNodeBccCandidatesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeCacheNodeBccCandidatesRequest setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeCacheNodeBccCandidatesRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeCacheNodeBccCandidatesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

}
