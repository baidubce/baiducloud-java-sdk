package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetNodeGroupDetailsV2Response extends BaseBceResponse {

    /**
    * 请求 ID, 问题定位提供该 ID
    */
    private String requestID;

    /**
    * instanceGroup
    */
    private InstanceGroup instanceGroup;

    public String getRequestID() {
        return requestID;
    }

    public GetNodeGroupDetailsV2Response setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }

    public InstanceGroup getInstanceGroup() {
        return instanceGroup;
    }

    public GetNodeGroupDetailsV2Response setInstanceGroup(InstanceGroup instanceGroup) {
        this.instanceGroup = instanceGroup;
        return this;
    }

    @Override
    public String toString() {
        return "GetNodeGroupDetailsV2Response{" + "requestID=" + requestID + "\n" + "instanceGroup=" + instanceGroup + "\n" + "}";
    }

}
