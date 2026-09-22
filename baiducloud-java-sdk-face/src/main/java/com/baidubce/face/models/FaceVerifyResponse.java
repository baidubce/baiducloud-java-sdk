package com.baidubce.face.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceVerifyResponse extends BaseBceResponse {

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
    * 时间戳
    */
    private Long timestamp;

    /**
    * 是否命中缓存，0表示未命中
    */
    private Integer cached;

    /**
    * result
    */
    private FaceVerifyResult result;

    public Integer getErrorCode() {
        return errorCode;
    }

    public FaceVerifyResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public FaceVerifyResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public FaceVerifyResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public FaceVerifyResponse setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Integer getCached() {
        return cached;
    }

    public FaceVerifyResponse setCached(Integer cached) {
        this.cached = cached;
        return this;
    }

    public FaceVerifyResult getResult() {
        return result;
    }

    public FaceVerifyResponse setResult(FaceVerifyResult result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "FaceVerifyResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "timestamp=" + timestamp + "\n" + "cached="
                + cached + "\n" + "result=" + result + "\n" + "}";
    }

}
