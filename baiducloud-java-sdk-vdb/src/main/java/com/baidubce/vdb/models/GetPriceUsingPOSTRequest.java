package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPriceUsingPOSTRequest extends BaseBceRequest {

    /**
    * engineType
    */
    @JsonIgnore
    private String engineType;

    /**
    * autoRenew
    */
    private Boolean autoRenew;

    /**
    * autoRenewTime
    */
    private Integer autoRenewTime;

    /**
    * autoRenewTimeUnit
    */
    private String autoRenewTimeUnit;

    /**
    * components
    */
    private List<MilvusComponent> components;

    /**
    * duration
    */
    private Integer duration;

    /**
    * env
    */
    private String env;

    /**
    * instanceParam
    */
    private InstanceParam instanceParam;

    /**
    * productType
    */
    private String productType;

    /**
    * timeUnit
    */
    private String timeUnit;

    public String getEngineType() {
        return engineType;
    }

    public GetPriceUsingPOSTRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public Boolean getAutoRenew() {
        return autoRenew;
    }

    public GetPriceUsingPOSTRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    public Integer getAutoRenewTime() {
        return autoRenewTime;
    }

    public GetPriceUsingPOSTRequest setAutoRenewTime(Integer autoRenewTime) {
        this.autoRenewTime = autoRenewTime;
        return this;
    }

    public String getAutoRenewTimeUnit() {
        return autoRenewTimeUnit;
    }

    public GetPriceUsingPOSTRequest setAutoRenewTimeUnit(String autoRenewTimeUnit) {
        this.autoRenewTimeUnit = autoRenewTimeUnit;
        return this;
    }

    public List<MilvusComponent> getComponents() {
        return components;
    }

    public GetPriceUsingPOSTRequest setComponents(List<MilvusComponent> components) {
        this.components = components;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public GetPriceUsingPOSTRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public String getEnv() {
        return env;
    }

    public GetPriceUsingPOSTRequest setEnv(String env) {
        this.env = env;
        return this;
    }

    public InstanceParam getInstanceParam() {
        return instanceParam;
    }

    public GetPriceUsingPOSTRequest setInstanceParam(InstanceParam instanceParam) {
        this.instanceParam = instanceParam;
        return this;
    }

    public String getProductType() {
        return productType;
    }

    public GetPriceUsingPOSTRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public GetPriceUsingPOSTRequest setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

}
