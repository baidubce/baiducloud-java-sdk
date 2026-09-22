package com.baidubce.face.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceSearchResponse extends BaseBceResponse {

    /**
    * 时间戳
    */
    private Long timestamp;

    /**
    * result
    */
    private FaceSearchResult result;

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

    public Long getTimestamp() {
        return timestamp;
    }

    public FaceSearchResponse setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public FaceSearchResult getResult() {
        return result;
    }

    public FaceSearchResponse setResult(FaceSearchResult result) {
        this.result = result;
        return this;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public FaceSearchResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public FaceSearchResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public FaceSearchResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    @Override
    public String toString() {
        return "FaceSearchResponse{" + "timestamp=" + timestamp + "\n" + "result=" + result + "\n" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId="
                + logId + "\n" + "}";
    }

}
