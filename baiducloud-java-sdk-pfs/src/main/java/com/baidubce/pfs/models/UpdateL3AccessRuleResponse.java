package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateL3AccessRuleResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回
    */
    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public UpdateL3AccessRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    @Override
    public String toString() {
        return "UpdateL3AccessRuleResponse{" + "requestId=" + requestId + "\n" + "}";
    }

}
