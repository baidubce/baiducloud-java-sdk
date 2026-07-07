package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAgentRequest extends BaseBceRequest {

    /**
    * Agent ID
    */
    private String agentId;

    public String getAgentId() {
        return agentId;
    }

    public DeleteAgentRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

}
