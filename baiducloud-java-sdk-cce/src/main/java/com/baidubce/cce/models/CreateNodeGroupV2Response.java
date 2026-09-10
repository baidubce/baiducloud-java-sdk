package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateNodeGroupV2Response extends BaseBceResponse {

    /**
    * 节点组 ID
    */
    private String instanceGroupID;

    /**
    * 请求 ID, 问题定位提供该 ID
    */
    private String requestID;

    public String getInstanceGroupID() {
        return instanceGroupID;
    }

    public CreateNodeGroupV2Response setInstanceGroupID(String instanceGroupID) {
        this.instanceGroupID = instanceGroupID;
        return this;
    }

    public String getRequestID() {
        return requestID;
    }

    public CreateNodeGroupV2Response setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }

    @Override
    public String toString() {
        return "CreateNodeGroupV2Response{" + "instanceGroupID=" + instanceGroupID + "\n" + "requestID=" + requestID + "\n" + "}";
    }

}
