package com.baidubce.face.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SessionCodeResponse extends BaseBceResponse {

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
    * 请求标识码，随机数，唯一
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * result
    */
    private VideoLivenessSessionCodeResult result;

    public Integer getErrorCode() {
        return errorCode;
    }

    public SessionCodeResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public SessionCodeResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public SessionCodeResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public VideoLivenessSessionCodeResult getResult() {
        return result;
    }

    public SessionCodeResponse setResult(VideoLivenessSessionCodeResult result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "SessionCodeResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "result=" + result + "\n" + "}";
    }

}
