package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateConsumerResponse extends BaseBceResponse {

    /**
    * 是否成功
    */
    private Boolean success;

    /**
    * HTTP 状态码
    */
    private Integer status;

    /**
    * 成功时为空
    */
    private String result;

    public Boolean getSuccess() {
        return success;
    }

    public UpdateConsumerResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public UpdateConsumerResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getResult() {
        return result;
    }

    public UpdateConsumerResponse setResult(String result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "UpdateConsumerResponse{" + "success=" + success + "\n" + "status=" + status + "\n" + "result=" + result + "\n" + "}";
    }

}
