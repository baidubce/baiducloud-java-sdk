package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalStatementResponse extends BaseBceResponse {

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
    * 识别结果数，表示words_result的元素个数
    */
    @JsonProperty("words_result_num")
    private Integer wordsResultNum;

    /**
    * 票据种类
    */
    @JsonProperty("InvoiceType")
    private String invoiceType;

    /**
    * wordResult
    */
    @JsonProperty("word_result")
    private MedicalStatementWordsResult wordResult;

    public Integer getErrorCode() {
        return errorCode;
    }

    public MedicalStatementResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public MedicalStatementResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public MedicalStatementResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getWordsResultNum() {
        return wordsResultNum;
    }

    public MedicalStatementResponse setWordsResultNum(Integer wordsResultNum) {
        this.wordsResultNum = wordsResultNum;
        return this;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public MedicalStatementResponse setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }

    public MedicalStatementWordsResult getWordResult() {
        return wordResult;
    }

    public MedicalStatementResponse setWordResult(MedicalStatementWordsResult wordResult) {
        this.wordResult = wordResult;
        return this;
    }

    @Override
    public String toString() {
        return "MedicalStatementResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "wordsResultNum=" + wordsResultNum + "\n"
                + "invoiceType=" + invoiceType + "\n" + "wordResult=" + wordResult + "\n" + "}";
    }

}
