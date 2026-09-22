package com.baidubce.face.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceMergeResponse extends BaseBceResponse {

    /**
    * 时间戳
    */
    private Long timestamp;

    /**
    * result
    */
    private FaceMergeResult result;

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
    * 是否命中缓存，0表示未命中
    */
    private Integer cached;

    public Long getTimestamp() {
        return timestamp;
    }

    public FaceMergeResponse setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public FaceMergeResult getResult() {
        return result;
    }

    public FaceMergeResponse setResult(FaceMergeResult result) {
        this.result = result;
        return this;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public FaceMergeResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public FaceMergeResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public FaceMergeResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getCached() {
        return cached;
    }

    public FaceMergeResponse setCached(Integer cached) {
        this.cached = cached;
        return this;
    }

    @Override
    public String toString() {
        return "FaceMergeResponse{" + "timestamp=" + timestamp + "\n" + "result=" + result + "\n" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId="
                + logId + "\n" + "cached=" + cached + "\n" + "}";
    }

}
