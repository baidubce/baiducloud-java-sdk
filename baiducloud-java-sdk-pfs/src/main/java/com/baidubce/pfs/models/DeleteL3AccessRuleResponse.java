package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteL3AccessRuleResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回
    */
    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public DeleteL3AccessRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    @Override
    public String toString() {
        return "DeleteL3AccessRuleResponse{" + "requestId=" + requestId + "\n" + "}";
    }

}
