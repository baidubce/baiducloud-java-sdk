package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthorizeServerEventResponse extends BaseBceResponse {

    /**
    * 请求Id
    */
    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public AuthorizeServerEventResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    @Override
    public String toString() {
        return "AuthorizeServerEventResponse{" + "requestId=" + requestId + "\n" + "}";
    }

}
