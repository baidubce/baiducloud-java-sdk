package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyElasticityAssuranceRequest extends BaseBceRequest {

    /**
    * 弹性保障id，单次最多100个
    */
    private List<String> elasticityAssuranceIds;

    /**
    * 是否自动续费, true：开启或修改自动续费；false：取消自动续费
    */
    private Boolean autoRenew;

    /**
    * 自动续费周期, autoRenew=true时必填，单位为月；允许值：1~9、12、24、36、48、60；autoRenew=false时无需传，传入不生效
    */
    private Integer autoRenewPeriod;

    public List<String> getElasticityAssuranceIds() {
        return elasticityAssuranceIds;
    }

    public ModifyElasticityAssuranceRequest setElasticityAssuranceIds(List<String> elasticityAssuranceIds) {
        this.elasticityAssuranceIds = elasticityAssuranceIds;
        return this;
    }

    public Boolean getAutoRenew() {
        return autoRenew;
    }

    public ModifyElasticityAssuranceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    public Integer getAutoRenewPeriod() {
        return autoRenewPeriod;
    }

    public ModifyElasticityAssuranceRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }

}
