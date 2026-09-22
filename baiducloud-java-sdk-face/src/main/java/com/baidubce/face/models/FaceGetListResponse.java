package com.baidubce.face.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceGetListResponse extends BaseBceResponse {

    /**
    * 时间戳
    */
    private Long timestamp;

    /**
    * result
    */
    private FaceGetListResult result;

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

    public Long getTimestamp() {
        return timestamp;
    }

    public FaceGetListResponse setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public FaceGetListResult getResult() {
        return result;
    }

    public FaceGetListResponse setResult(FaceGetListResult result) {
        this.result = result;
        return this;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public FaceGetListResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public FaceGetListResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public FaceGetListResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    @Override
    public String toString() {
        return "FaceGetListResponse{" + "timestamp=" + timestamp + "\n" + "result=" + result + "\n" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId="
                + logId + "\n" + "}";
    }

}
