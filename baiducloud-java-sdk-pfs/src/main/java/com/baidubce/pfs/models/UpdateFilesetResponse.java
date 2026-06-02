package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateFilesetResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public UpdateFilesetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    @Override
    public String toString() {
        return "UpdateFilesetResponse{" + "requestId=" + requestId + "\n" + "}";
    }

}
