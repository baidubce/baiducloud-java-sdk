package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateL2PolicyResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    private String requestId;

    /**
    * 对应的policyId
    */
    private String policyId;

    public String getRequestId() {
        return requestId;
    }

    public CreateL2PolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }

    public CreateL2PolicyResponse setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateL2PolicyResponse{" + "requestId=" + requestId + "\n" + "policyId=" + policyId + "\n" + "}";
    }

}
