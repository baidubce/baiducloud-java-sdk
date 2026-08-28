package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaperCutEduVlmGetResultResponse extends BaseBceResponse {

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
    private PaperCutEduVlmGetResult result;

    public Long getLogId() {
        return logId;
    }

    public PaperCutEduVlmGetResultResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public PaperCutEduVlmGetResultResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public PaperCutEduVlmGetResultResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public PaperCutEduVlmGetResult getResult() {
        return result;
    }

    public PaperCutEduVlmGetResultResponse setResult(PaperCutEduVlmGetResult result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "PaperCutEduVlmGetResultResponse{" + "logId=" + logId + "\n" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "result=" + result + "\n" + "}";
    }

}
