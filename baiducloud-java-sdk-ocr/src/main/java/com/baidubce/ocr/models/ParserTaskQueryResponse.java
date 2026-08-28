package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParserTaskQueryResponse extends BaseBceResponse {

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
    private ParserQueryResult result;

    public Integer getErrorCode() {
        return errorCode;
    }

    public ParserTaskQueryResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public ParserTaskQueryResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public String getLogId() {
        return logId;
    }

    public ParserTaskQueryResponse setLogId(String logId) {
        this.logId = logId;
        return this;
    }

    public ParserQueryResult getResult() {
        return result;
    }

    public ParserTaskQueryResponse setResult(ParserQueryResult result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ParserTaskQueryResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "result=" + result + "\n" + "}";
    }

}
