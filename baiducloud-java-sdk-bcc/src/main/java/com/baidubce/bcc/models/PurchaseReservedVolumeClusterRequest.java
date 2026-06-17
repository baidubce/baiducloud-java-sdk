package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseReservedVolumeClusterRequest extends BaseBceRequest {

    /**
    * clusterId
    */
    @JsonIgnore
    private String clusterId;

    /**
    * billing
    */
    private Billing billing;

    public String getClusterId() {
        return clusterId;
    }

    public PurchaseReservedVolumeClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public PurchaseReservedVolumeClusterRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

}
