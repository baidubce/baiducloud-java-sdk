package com.baidubce.image.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageUnderstandingRequestResponse extends BaseBceResponse {

    /**
    * 错误码
    */
    @JsonProperty("error_code")
    private Integer errorCode;

    /**
    * 错误描述信息
    */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
    * 唯一的log id，用于问题定位
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * result
    */
    private ImageUnderstandingTaskResult result;

    public Integer getErrorCode() {
        return errorCode;
    }

    public ImageUnderstandingRequestResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public ImageUnderstandingRequestResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public ImageUnderstandingRequestResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public ImageUnderstandingTaskResult getResult() {
        return result;
    }

    public ImageUnderstandingRequestResponse setResult(ImageUnderstandingTaskResult result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ImageUnderstandingRequestResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "result=" + result + "\n" + "}";
    }

}
