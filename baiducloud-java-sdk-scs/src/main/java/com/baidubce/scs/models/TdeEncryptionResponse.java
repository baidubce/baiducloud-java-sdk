package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TdeEncryptionResponse extends BaseBceResponse {

    /**
    * 操作状态。仅成功时返回success
    */
    private String operateStatus;

    /**
    * 操作失败原因。该值为空，无实际意义。
    */
    private String errorMessage;

    public String getOperateStatus() {
        return operateStatus;
    }

    public TdeEncryptionResponse setOperateStatus(String operateStatus) {
        this.operateStatus = operateStatus;
        return this;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public TdeEncryptionResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    @Override
    public String toString() {
        return "TdeEncryptionResponse{" + "operateStatus=" + operateStatus + "\n" + "errorMessage=" + errorMessage + "\n" + "}";
    }

}
