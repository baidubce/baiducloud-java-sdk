package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocClassifyResponse extends BaseBceResponse {

    /**
    * 唯一的日志id，用于问题定位
    */
    @JsonProperty("log_id")
    private Long logId;

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
    * 检测和分类结果数组，如图片中无文字内容，则此数组为空
    */
    @JsonProperty("words_result")
    private List<DocClassifyWordsResult> wordsResult;

    public Long getLogId() {
        return logId;
    }

    public DocClassifyResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public DocClassifyResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public DocClassifyResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public List<DocClassifyWordsResult> getWordsResult() {
        return wordsResult;
    }

    public DocClassifyResponse setWordsResult(List<DocClassifyWordsResult> wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    @Override
    public String toString() {
        return "DocClassifyResponse{" + "logId=" + logId + "\n" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "wordsResult=" + wordsResult + "\n" + "}";
    }

}
