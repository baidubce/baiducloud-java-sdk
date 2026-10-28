package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RenewElasticityAssuranceRequest extends BaseBceRequest {

    /**
    * 弹性保障id集合，最多100个
    */
    private List<String> elasticityAssuranceIds;

    /**
    * 弹性保障续费时长，单位为月，允许值：1~9、12、24、36、48、60
    */
    private String period;

    public List<String> getElasticityAssuranceIds() {
        return elasticityAssuranceIds;
    }

    public RenewElasticityAssuranceRequest setElasticityAssuranceIds(List<String> elasticityAssuranceIds) {
        this.elasticityAssuranceIds = elasticityAssuranceIds;
        return this;
    }

    public String getPeriod() {
        return period;
    }

    public RenewElasticityAssuranceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }

}
