package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiIdcardResponse extends BaseBceResponse {

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
    private Long logId;

    /**
    * 定位和识别结果数组
    */
    @JsonProperty("words_result")
    private List<MultiIdcardItem> wordsResult;

    public Integer getErrorCode() {
        return errorCode;
    }

    public MultiIdcardResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public MultiIdcardResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public MultiIdcardResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public List<MultiIdcardItem> getWordsResult() {
        return wordsResult;
    }

    public MultiIdcardResponse setWordsResult(List<MultiIdcardItem> wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    @Override
    public String toString() {
        return "MultiIdcardResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "wordsResult=" + wordsResult + "\n" + "}";
    }

}
