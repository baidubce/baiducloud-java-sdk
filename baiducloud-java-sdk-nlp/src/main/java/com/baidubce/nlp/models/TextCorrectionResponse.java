package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextCorrectionResponse extends BaseBceResponse {

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
    * 请求唯一标识码
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * item
    */
    private TextCorrectionItem item;

    public Integer getErrorCode() {
        return errorCode;
    }

    public TextCorrectionResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public TextCorrectionResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public TextCorrectionResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public TextCorrectionItem getItem() {
        return item;
    }

    public TextCorrectionResponse setItem(TextCorrectionItem item) {
        this.item = item;
        return this;
    }

    @Override
    public String toString() {
        return "TextCorrectionResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "item=" + item + "\n" + "}";
    }

}
