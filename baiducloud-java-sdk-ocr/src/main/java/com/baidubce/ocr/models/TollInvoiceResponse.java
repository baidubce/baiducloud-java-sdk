package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TollInvoiceResponse extends BaseBceResponse {

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
    * 错误信息
    */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
    * 识别结果数，表示words_result的元素个数
    */
    @JsonProperty("words_result_num")
    private Integer wordsResultNum;

    /**
    * wordsResult
    */
    @JsonProperty("words_result")
    private TollInvoiceWordsResult wordsResult;

    /**
    * 传入PDF文件的总页数，当pdf_file参数有效时返回该字段
    */
    @JsonProperty("pdf_file_size")
    private Integer pdfFileSize;

    public Long getLogId() {
        return logId;
    }

    public TollInvoiceResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public TollInvoiceResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public TollInvoiceResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Integer getWordsResultNum() {
        return wordsResultNum;
    }

    public TollInvoiceResponse setWordsResultNum(Integer wordsResultNum) {
        this.wordsResultNum = wordsResultNum;
        return this;
    }

    public TollInvoiceWordsResult getWordsResult() {
        return wordsResult;
    }

    public TollInvoiceResponse setWordsResult(TollInvoiceWordsResult wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    public Integer getPdfFileSize() {
        return pdfFileSize;
    }

    public TollInvoiceResponse setPdfFileSize(Integer pdfFileSize) {
        this.pdfFileSize = pdfFileSize;
        return this;
    }

    @Override
    public String toString() {
        return "TollInvoiceResponse{" + "logId=" + logId + "\n" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "wordsResultNum=" + wordsResultNum + "\n"
                + "wordsResult=" + wordsResult + "\n" + "pdfFileSize=" + pdfFileSize + "\n" + "}";
    }

}
