package com.baidubce.face.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceDetectResponse extends BaseBceResponse {

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
    * 唯一的log id，用于排查问题
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
    private FaceDetectResult result;

    public Integer getErrorCode() {
        return errorCode;
    }

    public FaceDetectResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public FaceDetectResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public FaceDetectResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public FaceDetectResponse setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Integer getCached() {
        return cached;
    }

    public FaceDetectResponse setCached(Integer cached) {
        this.cached = cached;
        return this;
    }

    public FaceDetectResult getResult() {
        return result;
    }

    public FaceDetectResponse setResult(FaceDetectResult result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "FaceDetectResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "timestamp=" + timestamp + "\n" + "cached="
                + cached + "\n" + "result=" + result + "\n" + "}";
    }

}
