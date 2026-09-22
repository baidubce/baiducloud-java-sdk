package com.baidubce.face.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VerifyResponse extends BaseBceResponse {

    /**
    * 错误码，0表示成功
    */
    @JsonProperty("error_code")
    private Integer errorCode;

    /**
    * 错误信息
    */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
    * 请求标识码
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 时间戳
    */
    private Long timestamp;

    /**
    * result
    */
    private VideoLivenessVerifyResult result;

    public Integer getErrorCode() {
        return errorCode;
    }

    public VerifyResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public VerifyResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public VerifyResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public VerifyResponse setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public VideoLivenessVerifyResult getResult() {
        return result;
    }

    public VerifyResponse setResult(VideoLivenessVerifyResult result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "VerifyResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "timestamp=" + timestamp + "\n" + "result=" + result
                + "\n" + "}";
    }

}
