package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DivorceCertificateResponse extends BaseBceResponse {

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
    * 识别结果，key为字段名（如：姓名_男、身份证件号_女等），value为识别内容数组
    */
    @JsonProperty("words_result")
    private Object wordsResult;

    public Integer getErrorCode() {
        return errorCode;
    }

    public DivorceCertificateResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public DivorceCertificateResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public DivorceCertificateResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getPdfFileSize() {
        return pdfFileSize;
    }

    public DivorceCertificateResponse setPdfFileSize(Integer pdfFileSize) {
        this.pdfFileSize = pdfFileSize;
        return this;
    }

    public Integer getWordsResultNum() {
        return wordsResultNum;
    }

    public DivorceCertificateResponse setWordsResultNum(Integer wordsResultNum) {
        this.wordsResultNum = wordsResultNum;
        return this;
    }

    public Object getWordsResult() {
        return wordsResult;
    }

    public DivorceCertificateResponse setWordsResult(Object wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    @Override
    public String toString() {
        return "DivorceCertificateResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "pdfFileSize=" + pdfFileSize + "\n"
                + "wordsResultNum=" + wordsResultNum + "\n" + "wordsResult=" + wordsResult + "\n" + "}";
    }

}
