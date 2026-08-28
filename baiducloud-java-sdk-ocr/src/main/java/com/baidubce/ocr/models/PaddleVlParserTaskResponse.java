package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaddleVlParserTaskResponse extends BaseBceResponse {

    /**
    * 错误码
    */
    @JsonProperty("error_code")
    private Integer errorCode;

    /**
    * 错误信息
    */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
    * 唯一的log id，用于问题定位
    */
    @JsonProperty("log_id")
    private String logId;

    /**
    * result
    */
    private PaddleVlParserResult result;

    public Integer getErrorCode() {
        return errorCode;
    }

    public PaddleVlParserTaskResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public PaddleVlParserTaskResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public String getLogId() {
        return logId;
    }

    public PaddleVlParserTaskResponse setLogId(String logId) {
        this.logId = logId;
        return this;
    }

    public PaddleVlParserResult getResult() {
        return result;
    }

    public PaddleVlParserTaskResponse setResult(PaddleVlParserResult result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "PaddleVlParserTaskResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "result=" + result + "\n" + "}";
    }

}
