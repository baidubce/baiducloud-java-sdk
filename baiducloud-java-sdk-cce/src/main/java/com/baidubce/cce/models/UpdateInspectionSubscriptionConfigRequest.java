package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateInspectionSubscriptionConfigRequest extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

    /**
    * inspectionConfig
    */
    private InspectionConfig inspectionConfig;

    /**
    * subscriptionConfig
    */
    private SubscriptionConfig subscriptionConfig;

    public String getClusterID() {
        return clusterID;
    }

    public UpdateInspectionSubscriptionConfigRequest setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public InspectionConfig getInspectionConfig() {
        return inspectionConfig;
    }

    public UpdateInspectionSubscriptionConfigRequest setInspectionConfig(InspectionConfig inspectionConfig) {
        this.inspectionConfig = inspectionConfig;
        return this;
    }

    public SubscriptionConfig getSubscriptionConfig() {
        return subscriptionConfig;
    }

    public UpdateInspectionSubscriptionConfigRequest setSubscriptionConfig(SubscriptionConfig subscriptionConfig) {
        this.subscriptionConfig = subscriptionConfig;
        return this;
    }

}
