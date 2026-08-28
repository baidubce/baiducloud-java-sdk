package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BankReceiptNewResponse extends BaseBceResponse {

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
    * 传入PDF文件的总页数，当pdf_file参数有效时返回该字段
    */
    @JsonProperty("pdf_file_size")
    private Integer pdfFileSize;

    /**
    * 识别结果数，表示words_result的元素个数
    */
    @JsonProperty("words_result_num")
    private Integer wordsResultNum;

    /**
    * 识别结果，key为字段名（如：标题、付款人户名、付款人开户银行、付款人账号、收款人户名、收款人开户银行、收款人账号、大写金额、小写金额、流水号、回单编号、交易日期、摘要、用途），value为对应字段的识别结果数组
    */
    @JsonProperty("words_result")
    private Object wordsResult;

    public Integer getErrorCode() {
        return errorCode;
    }

    public BankReceiptNewResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public BankReceiptNewResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public BankReceiptNewResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getPdfFileSize() {
        return pdfFileSize;
    }

    public BankReceiptNewResponse setPdfFileSize(Integer pdfFileSize) {
        this.pdfFileSize = pdfFileSize;
        return this;
    }

    public Integer getWordsResultNum() {
        return wordsResultNum;
    }

    public BankReceiptNewResponse setWordsResultNum(Integer wordsResultNum) {
        this.wordsResultNum = wordsResultNum;
        return this;
    }

    public Object getWordsResult() {
        return wordsResult;
    }

    public BankReceiptNewResponse setWordsResult(Object wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    @Override
    public String toString() {
        return "BankReceiptNewResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "pdfFileSize=" + pdfFileSize + "\n"
                + "wordsResultNum=" + wordsResultNum + "\n" + "wordsResult=" + wordsResult + "\n" + "}";
    }

}
