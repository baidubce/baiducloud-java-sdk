package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheConfigurationOfAutoscalerV2Response extends BaseBceResponse {

    /**
    * autoscaler
    */
    private Autoscaler autoscaler;

    /**
    * 请求 ID，问题定位时请提供该 ID
    */
    private String requestID;

    public Autoscaler getAutoscaler() {
        return autoscaler;
    }

    public QueryTheConfigurationOfAutoscalerV2Response setAutoscaler(Autoscaler autoscaler) {
        this.autoscaler = autoscaler;
        return this;
    }

    public String getRequestID() {
        return requestID;
    }

    public QueryTheConfigurationOfAutoscalerV2Response setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }

    @Override
    public String toString() {
        return "QueryTheConfigurationOfAutoscalerV2Response{" + "autoscaler=" + autoscaler + "\n" + "requestID=" + requestID + "\n" + "}";
    }

}
