package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindInstanceSecurityGroupResponse extends BaseBceResponse {

    /**
    * 请求Id
    */
    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public BindInstanceSecurityGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    @Override
    public String toString() {
        return "BindInstanceSecurityGroupResponse{" + "requestId=" + requestId + "\n" + "}";
    }

}
