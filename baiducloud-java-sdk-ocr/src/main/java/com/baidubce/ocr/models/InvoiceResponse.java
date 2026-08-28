package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InvoiceResponse extends BaseBceResponse {

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
    * 图像方向，-1：未定义，0：正向，1：逆时针90度，2：逆时针180度，3：逆时针270度
    */
    private Integer direction;

    /**
    * 识别结果数，表示words_result的元素个数
    */
    @JsonProperty("words_result_num")
    private Integer wordsResultNum;

    /**
    * wordsResult
    */
    @JsonProperty("words_result")
    private InvoiceWordsResult wordsResult;

    /**
    * 传入PDF文件的总页数，当pdf_file参数有效时返回该字段
    */
    @JsonProperty("pdf_file_size")
    private Integer pdfFileSize;

    public Long getLogId() {
        return logId;
    }

    public InvoiceResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public InvoiceResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public InvoiceResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Integer getDirection() {
        return direction;
    }

    public InvoiceResponse setDirection(Integer direction) {
        this.direction = direction;
        return this;
    }

    public Integer getWordsResultNum() {
        return wordsResultNum;
    }

    public InvoiceResponse setWordsResultNum(Integer wordsResultNum) {
        this.wordsResultNum = wordsResultNum;
        return this;
    }

    public InvoiceWordsResult getWordsResult() {
        return wordsResult;
    }

    public InvoiceResponse setWordsResult(InvoiceWordsResult wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    public Integer getPdfFileSize() {
        return pdfFileSize;
    }

    public InvoiceResponse setPdfFileSize(Integer pdfFileSize) {
        this.pdfFileSize = pdfFileSize;
        return this;
    }

    @Override
    public String toString() {
        return "InvoiceResponse{" + "logId=" + logId + "\n" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "direction=" + direction + "\n" + "wordsResultNum="
                + wordsResultNum + "\n" + "wordsResult=" + wordsResult + "\n" + "pdfFileSize=" + pdfFileSize + "\n" + "}";
    }

}
