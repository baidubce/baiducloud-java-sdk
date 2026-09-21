package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetInspectionSubscriptionConfigResponse extends BaseBceResponse {

    /**
    * inspectionConfig
    */
    private InspectionConfig inspectionConfig;

    /**
    * subscriptionConfig
    */
    private SubscriptionConfig subscriptionConfig;

    public InspectionConfig getInspectionConfig() {
        return inspectionConfig;
    }

    public GetInspectionSubscriptionConfigResponse setInspectionConfig(InspectionConfig inspectionConfig) {
        this.inspectionConfig = inspectionConfig;
        return this;
    }

    public SubscriptionConfig getSubscriptionConfig() {
        return subscriptionConfig;
    }

    public GetInspectionSubscriptionConfigResponse setSubscriptionConfig(SubscriptionConfig subscriptionConfig) {
        this.subscriptionConfig = subscriptionConfig;
        return this;
    }

    @Override
    public String toString() {
        return "GetInspectionSubscriptionConfigResponse{" + "inspectionConfig=" + inspectionConfig + "\n" + "subscriptionConfig=" + subscriptionConfig + "\n" + "}";
    }

}
