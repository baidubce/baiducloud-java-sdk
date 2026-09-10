package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTheListOfClusterNodesV2Response extends BaseBceResponse {

    /**
    * instancePage
    */
    private InstancePage instancePage;

    /**
    * 响应的请求的ID
    */
    private String requestID;

    public InstancePage getInstancePage() {
        return instancePage;
    }

    public GetTheListOfClusterNodesV2Response setInstancePage(InstancePage instancePage) {
        this.instancePage = instancePage;
        return this;
    }

    public String getRequestID() {
        return requestID;
    }

    public GetTheListOfClusterNodesV2Response setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }

    @Override
    public String toString() {
        return "GetTheListOfClusterNodesV2Response{" + "instancePage=" + instancePage + "\n" + "requestID=" + requestID + "\n" + "}";
    }

}
