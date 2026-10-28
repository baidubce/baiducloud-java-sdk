package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryElasticityAssuranceRequest extends BaseBceRequest {

    /**
    * 批量获取列表的查询的起始位置，是一个由系统生成的字符串
    */
    private String marker;

    /**
    * 每页包含的最大数量，最大数量通常不超过1000，缺省值为1000
    */
    private Integer maxKeys;

    /**
    * 弹性保障的id集合
    */
    private List<String> elasticityAssuranceIds;

    /**
    * 弹性保障的名称
    */
    private String elasticityAssuranceName;

    /**
    * 可用区，例如：cn-bj-a
    */
    private String zoneName;

    /**
    * 实例规格，例如：bcc.g4.c2m8
    */
    private String spec;

    /**
    * 弹性保障状态,可选值：CREATING/ACTIVE
    */
    private List<String> status;

    public String getMarker() {
        return marker;
    }

    public QueryElasticityAssuranceRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryElasticityAssuranceRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public List<String> getElasticityAssuranceIds() {
        return elasticityAssuranceIds;
    }

    public QueryElasticityAssuranceRequest setElasticityAssuranceIds(List<String> elasticityAssuranceIds) {
        this.elasticityAssuranceIds = elasticityAssuranceIds;
        return this;
    }

    public String getElasticityAssuranceName() {
        return elasticityAssuranceName;
    }

    public QueryElasticityAssuranceRequest setElasticityAssuranceName(String elasticityAssuranceName) {
        this.elasticityAssuranceName = elasticityAssuranceName;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public QueryElasticityAssuranceRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getSpec() {
        return spec;
    }

    public QueryElasticityAssuranceRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public List<String> getStatus() {
        return status;
    }

    public QueryElasticityAssuranceRequest setStatus(List<String> status) {
        this.status = status;
        return this;
    }

}
