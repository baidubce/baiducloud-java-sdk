package com.baidubce.image.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageUnderstandingGetResultResponse extends BaseBceResponse {

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
    private ImageUnderstandingGetResult result;

    public Integer getErrorCode() {
        return errorCode;
    }

    public ImageUnderstandingGetResultResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public ImageUnderstandingGetResultResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public ImageUnderstandingGetResultResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public ImageUnderstandingGetResult getResult() {
        return result;
    }

    public ImageUnderstandingGetResultResponse setResult(ImageUnderstandingGetResult result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ImageUnderstandingGetResultResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "result=" + result + "\n"
                + "}";
    }

}
