package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingChangePreToPostBlbRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 计费方式。"BySpec"表示按固定规格计费(默认值)，"ByCapacityUnit"表示按使用量计费。
    */
    private String billingMethod;

    /**
    * 性能规格参数，默认为当前实例的性能规格。取值如下："small1"标准型1，"small2"标准型2，"medium1"增强型1，"medium2"增强型2，"large1"超大型1，"large2"超大型2，"large3"超大型3。仅后付费-按使用量支持"unlimited"不限速。
    */
    private String performanceLevel;

    /**
    * 是否立即生效，默认false。
    */
    private Boolean effectiveImmediately;

    public String getBlbId() {
        return blbId;
    }

    public BillingChangePreToPostBlbRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public BillingChangePreToPostBlbRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getBillingMethod() {
        return billingMethod;
    }

    public BillingChangePreToPostBlbRequest setBillingMethod(String billingMethod) {
        this.billingMethod = billingMethod;
        return this;
    }

    public String getPerformanceLevel() {
        return performanceLevel;
    }

    public BillingChangePreToPostBlbRequest setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }

    public Boolean getEffectiveImmediately() {
        return effectiveImmediately;
    }

    public BillingChangePreToPostBlbRequest setEffectiveImmediately(Boolean effectiveImmediately) {
        this.effectiveImmediately = effectiveImmediately;
        return this;
    }

}
