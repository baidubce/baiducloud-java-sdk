package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetClusterBindStatusResponse extends BaseBceResponse {

    /**
    * 可能返回的值：`Unbound`（未接入）、`Binding`（接入中）、`Bound`（已接入）、`BoundFailed`（接入失败）、`Unbinding`（解绑中）、`Unknown`（其他非预期状态）。
    */
    private String bindingStatus;

    /**
    * CProm 监控实例 ID。
    */
    private String instanceId;

    /**
    * Agent ID。
    */
    private String agentId;

    public String getBindingStatus() {
        return bindingStatus;
    }

    public GetClusterBindStatusResponse setBindingStatus(String bindingStatus) {
        this.bindingStatus = bindingStatus;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public GetClusterBindStatusResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAgentId() {
        return agentId;
    }

    public GetClusterBindStatusResponse setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    @Override
    public String toString() {
        return "GetClusterBindStatusResponse{" + "bindingStatus=" + bindingStatus + "\n" + "instanceId=" + instanceId + "\n" + "agentId=" + agentId + "\n" + "}";
    }

}
