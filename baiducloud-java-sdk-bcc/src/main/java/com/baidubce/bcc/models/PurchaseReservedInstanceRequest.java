package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseReservedInstanceRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * relatedRenewFlag
    */
    @JsonIgnore
    private String relatedRenewFlag;

    /**
    * billing
    */
    private Billing billing;

    /**
    * 挂载磁盘的自定义续费周期，可选大于等于（续费后BCC到期时间-CDS当前到期时间）的续费时长，范围为【1，60】个月。不传时默认与BCC续费后的到期时间保持一致。
    */
    private List<CdsCustomPeriod> cdsCustomPeriod;

    public String getInstanceId() {
        return instanceId;
    }

    public PurchaseReservedInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getRelatedRenewFlag() {
        return relatedRenewFlag;
    }

    public PurchaseReservedInstanceRequest setRelatedRenewFlag(String relatedRenewFlag) {
        this.relatedRenewFlag = relatedRenewFlag;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public PurchaseReservedInstanceRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public List<CdsCustomPeriod> getCdsCustomPeriod() {
        return cdsCustomPeriod;
    }

    public PurchaseReservedInstanceRequest setCdsCustomPeriod(List<CdsCustomPeriod> cdsCustomPeriod) {
        this.cdsCustomPeriod = cdsCustomPeriod;
        return this;
    }

}
