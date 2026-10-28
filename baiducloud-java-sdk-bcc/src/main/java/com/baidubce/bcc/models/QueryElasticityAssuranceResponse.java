package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryElasticityAssuranceResponse extends BaseBceResponse {

    /**
    * 标记查询的起始位置
    */
    private String marker;

    /**
    * 每页包含的最大数量
    */
    private Integer maxKeys;

    /**
    * 获取下一页所需要传递的marker值。当isTruncated为false时，该域不出现
    */
    private String nextMarker;

    /**
    * true表示后面还有数据，false表示已经是最后一页
    */
    private Boolean isTruncated;

    /**
    * 弹性保障信息，由 ElasticityAssuranceModel 组成的集合
    */
    private List<ElasticityAssuranceModel> elasticityAssurances;

    public String getMarker() {
        return marker;
    }

    public QueryElasticityAssuranceResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryElasticityAssuranceResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public QueryElasticityAssuranceResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public QueryElasticityAssuranceResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public List<ElasticityAssuranceModel> getElasticityAssurances() {
        return elasticityAssurances;
    }

    public QueryElasticityAssuranceResponse setElasticityAssurances(List<ElasticityAssuranceModel> elasticityAssurances) {
        this.elasticityAssurances = elasticityAssurances;
        return this;
    }

    @Override
    public String toString() {
        return "QueryElasticityAssuranceResponse{" + "marker=" + marker + "\n" + "maxKeys=" + maxKeys + "\n" + "nextMarker=" + nextMarker + "\n" + "isTruncated=" + isTruncated
                + "\n" + "elasticityAssurances=" + elasticityAssurances + "\n" + "}";
    }

}
