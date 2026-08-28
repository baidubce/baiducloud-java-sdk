package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HandwritingCompositionCreateTaskResponse extends BaseBceResponse {

    /**
    * 唯一的log id，用于问题定位
    */
    @JsonProperty("log_id")
    private Long logId;

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
    * result
    */
    private HandwritingCompositionCreateTaskResult result;

    public Long getLogId() {
        return logId;
    }

    public HandwritingCompositionCreateTaskResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public HandwritingCompositionCreateTaskResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public HandwritingCompositionCreateTaskResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public HandwritingCompositionCreateTaskResult getResult() {
        return result;
    }

    public HandwritingCompositionCreateTaskResponse setResult(HandwritingCompositionCreateTaskResult result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "HandwritingCompositionCreateTaskResponse{" + "logId=" + logId + "\n" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "result=" + result + "\n"
                + "}";
    }

}
