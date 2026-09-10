package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteNodesClusterScalingV2Response extends BaseBceResponse {

    /**
    * 响应的请求的ID
    */
    private String requestID;

    public String getRequestID() {
        return requestID;
    }

    public DeleteNodesClusterScalingV2Response setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }

    @Override
    public String toString() {
        return "DeleteNodesClusterScalingV2Response{" + "requestID=" + requestID + "\n" + "}";
    }

}
