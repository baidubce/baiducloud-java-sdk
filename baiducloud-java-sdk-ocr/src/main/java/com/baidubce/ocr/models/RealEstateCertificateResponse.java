package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealEstateCertificateResponse extends BaseBceResponse {

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
    * PDF文件总页数（可选）
    */
    @JsonProperty("pdf_file_size")
    private Integer pdfFileSize;

    /**
    * 识别结果数
    */
    @JsonProperty("words_result_num")
    private Integer wordsResultNum;

    /**
    * 识别结果，key为字段名（如：权利人、坐落等），value为识别内容数组
    */
    @JsonProperty("words_result")
    private Object wordsResult;

    public Integer getErrorCode() {
        return errorCode;
    }

    public RealEstateCertificateResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public RealEstateCertificateResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public RealEstateCertificateResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getPdfFileSize() {
        return pdfFileSize;
    }

    public RealEstateCertificateResponse setPdfFileSize(Integer pdfFileSize) {
        this.pdfFileSize = pdfFileSize;
        return this;
    }

    public Integer getWordsResultNum() {
        return wordsResultNum;
    }

    public RealEstateCertificateResponse setWordsResultNum(Integer wordsResultNum) {
        this.wordsResultNum = wordsResultNum;
        return this;
    }

    public Object getWordsResult() {
        return wordsResult;
    }

    public RealEstateCertificateResponse setWordsResult(Object wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    @Override
    public String toString() {
        return "RealEstateCertificateResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "pdfFileSize=" + pdfFileSize + "\n"
                + "wordsResultNum=" + wordsResultNum + "\n" + "wordsResult=" + wordsResult + "\n" + "}";
    }

}
