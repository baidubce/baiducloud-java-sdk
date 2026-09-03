package com.baidubce.image.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AiRetouchingQueryTaskResponse extends BaseBceResponse {

    /**
    * 错误码
    */
    @JsonProperty("error_code")
    private Integer errorCode;

    /**
    * 错误信息
    */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
    * 唯一的log id，用于问题定位
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 请求ID，问题定位时使用
    */
    @JsonProperty("request_id")
    private Long requestId;

    /**
    * result
    */
    private RetouchingResult result;

    public Integer getErrorCode() {
        return errorCode;
    }

    public AiRetouchingQueryTaskResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public AiRetouchingQueryTaskResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public AiRetouchingQueryTaskResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Long getRequestId() {
        return requestId;
    }

    public AiRetouchingQueryTaskResponse setRequestId(Long requestId) {
        this.requestId = requestId;
        return this;
    }

    public RetouchingResult getResult() {
        return result;
    }

    public AiRetouchingQueryTaskResponse setResult(RetouchingResult result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "AiRetouchingQueryTaskResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "requestId=" + requestId + "\n"
                + "result=" + result + "\n" + "}";
    }

}
