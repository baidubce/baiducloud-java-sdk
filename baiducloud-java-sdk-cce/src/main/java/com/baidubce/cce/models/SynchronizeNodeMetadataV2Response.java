package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SynchronizeNodeMetadataV2Response extends BaseBceResponse {

    /**
    * 请求的集群ID
    */
    private String clusterID;

    /**
    * 请求ID
    */
    private String requestID;

    public String getClusterID() {
        return clusterID;
    }

    public SynchronizeNodeMetadataV2Response setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getRequestID() {
        return requestID;
    }

    public SynchronizeNodeMetadataV2Response setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }

    @Override
    public String toString() {
        return "SynchronizeNodeMetadataV2Response{" + "clusterID=" + clusterID + "\n" + "requestID=" + requestID + "\n" + "}";
    }

}
