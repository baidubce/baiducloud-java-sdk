package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyVolumeChargeTypeRequest extends BaseBceRequest {

    /**
    * volumeId
    */
    @JsonIgnore
    private String volumeId;

    /**
    * billing
    */
    private Billing billing;

    /**
    * 转后付费生效方式，可选参数：AtOnce（立即转按量付费）、AfterExpiration（到期后转按量付费）。不传默认为到期后按量付费。
    */
    private String effectiveType;

    public String getVolumeId() {
        return volumeId;
    }

    public ModifyVolumeChargeTypeRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public ModifyVolumeChargeTypeRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public String getEffectiveType() {
        return effectiveType;
    }

    public ModifyVolumeChargeTypeRequest setEffectiveType(String effectiveType) {
        this.effectiveType = effectiveType;
        return this;
    }

}
