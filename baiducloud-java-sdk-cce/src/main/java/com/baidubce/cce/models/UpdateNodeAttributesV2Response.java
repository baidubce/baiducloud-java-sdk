package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateNodeAttributesV2Response extends BaseBceResponse {

    /**
    * instance
    */
    private Instance instance;

    /**
    * 请求 ID, 问题定位提供该 ID
    */
    private String requestID;

    public Instance getInstance() {
        return instance;
    }

    public UpdateNodeAttributesV2Response setInstance(Instance instance) {
        this.instance = instance;
        return this;
    }

    public String getRequestID() {
        return requestID;
    }

    public UpdateNodeAttributesV2Response setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }

    @Override
    public String toString() {
        return "UpdateNodeAttributesV2Response{" + "instance=" + instance + "\n" + "requestID=" + requestID + "\n" + "}";
    }

}
