package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyTheNumberOfNodeReplicasInANodeGroupV2Response extends BaseBceResponse {

    /**
    * 请求 ID, 问题定位提供该 ID
    */
    private String requestID;

    public String getRequestID() {
        return requestID;
    }

    public ModifyTheNumberOfNodeReplicasInANodeGroupV2Response setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }

    @Override
    public String toString() {
        return "ModifyTheNumberOfNodeReplicasInANodeGroupV2Response{" + "requestID=" + requestID + "\n" + "}";
    }

}
