package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseReservedVolumeRequest extends BaseBceRequest {

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
    * 未挂载磁盘预期挂载到的预付费BCC实例ID，磁盘未挂载状态下必传，已挂载状态下可不传或传当前挂载的实例ID
    */
    private String instanceId;

    public String getVolumeId() {
        return volumeId;
    }

    public PurchaseReservedVolumeRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public PurchaseReservedVolumeRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public PurchaseReservedVolumeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

}
