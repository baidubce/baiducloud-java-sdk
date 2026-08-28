package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmartStructResponse extends BaseBceResponse {

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
    * 传入PDF文件的总页数，当 pdf_file 参数有效时返回该字段
    */
    @JsonProperty("pdf_file_size")
    private Integer pdfFileSize;

    /**
    * 文本行结果数，表示 object_id 的个数，当 return_relation=true 时返回
    */
    @JsonProperty("object_id_num")
    private Integer objectIdNum;

    /**
    * wordsResult
    */
    @JsonProperty("words_result")
    private SmartStructWordsResult wordsResult;

    public Integer getErrorCode() {
        return errorCode;
    }

    public SmartStructResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public SmartStructResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public SmartStructResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getPdfFileSize() {
        return pdfFileSize;
    }

    public SmartStructResponse setPdfFileSize(Integer pdfFileSize) {
        this.pdfFileSize = pdfFileSize;
        return this;
    }

    public Integer getObjectIdNum() {
        return objectIdNum;
    }

    public SmartStructResponse setObjectIdNum(Integer objectIdNum) {
        this.objectIdNum = objectIdNum;
        return this;
    }

    public SmartStructWordsResult getWordsResult() {
        return wordsResult;
    }

    public SmartStructResponse setWordsResult(SmartStructWordsResult wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    @Override
    public String toString() {
        return "SmartStructResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "pdfFileSize=" + pdfFileSize + "\n"
                + "objectIdNum=" + objectIdNum + "\n" + "wordsResult=" + wordsResult + "\n" + "}";
    }

}
