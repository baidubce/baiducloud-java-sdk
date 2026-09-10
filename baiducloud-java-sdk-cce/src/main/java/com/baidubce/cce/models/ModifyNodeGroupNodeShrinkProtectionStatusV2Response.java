package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyNodeGroupNodeShrinkProtectionStatusV2Response extends BaseBceResponse {

    /**
    * 修改失败的节点及原因列表，字段见下表
    */
    private List<Object> failedInstances;

    /**
    * 请求 ID, 问题定位提供该 ID
    */
    private String requestID;

    public List<Object> getFailedInstances() {
        return failedInstances;
    }

    public ModifyNodeGroupNodeShrinkProtectionStatusV2Response setFailedInstances(List<Object> failedInstances) {
        this.failedInstances = failedInstances;
        return this;
    }

    public String getRequestID() {
        return requestID;
    }

    public ModifyNodeGroupNodeShrinkProtectionStatusV2Response setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }

    @Override
    public String toString() {
        return "ModifyNodeGroupNodeShrinkProtectionStatusV2Response{" + "failedInstances=" + failedInstances + "\n" + "requestID=" + requestID + "\n" + "}";
    }

}
