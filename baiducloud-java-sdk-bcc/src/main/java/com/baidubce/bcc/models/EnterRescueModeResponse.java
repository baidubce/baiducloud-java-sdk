package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnterRescueModeResponse extends BaseBceResponse {

    /**
    * 请求ID
    */
    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public EnterRescueModeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    @Override
    public String toString() {
        return "EnterRescueModeResponse{" + "requestId=" + requestId + "\n" + "}";
    }

}
