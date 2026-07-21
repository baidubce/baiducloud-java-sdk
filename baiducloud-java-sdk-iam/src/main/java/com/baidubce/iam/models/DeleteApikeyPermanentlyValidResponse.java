package com.baidubce.iam.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteApikeyPermanentlyValidResponse extends BaseBceResponse {

    /**
    * 标识
    */
    private Boolean success;

    /**
    * 状态吗
    */
    private Integer status;

    public Boolean getSuccess() {
        return success;
    }

    public DeleteApikeyPermanentlyValidResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public DeleteApikeyPermanentlyValidResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return "DeleteApikeyPermanentlyValidResponse{" + "success=" + success + "\n" + "status=" + status + "\n" + "}";
    }

}
