package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HkMacauTaiwanExitentrypermitResponse extends BaseBceResponse {

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
    * wordsResult
    */
    @JsonProperty("words_result")
    private HkMacauTaiwanExitentrypermitResult wordsResult;

    public Integer getErrorCode() {
        return errorCode;
    }

    public HkMacauTaiwanExitentrypermitResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public HkMacauTaiwanExitentrypermitResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public HkMacauTaiwanExitentrypermitResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getPdfFileSize() {
        return pdfFileSize;
    }

    public HkMacauTaiwanExitentrypermitResponse setPdfFileSize(Integer pdfFileSize) {
        this.pdfFileSize = pdfFileSize;
        return this;
    }

    public Integer getWordsResultNum() {
        return wordsResultNum;
    }

    public HkMacauTaiwanExitentrypermitResponse setWordsResultNum(Integer wordsResultNum) {
        this.wordsResultNum = wordsResultNum;
        return this;
    }

    public HkMacauTaiwanExitentrypermitResult getWordsResult() {
        return wordsResult;
    }

    public HkMacauTaiwanExitentrypermitResponse setWordsResult(HkMacauTaiwanExitentrypermitResult wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    @Override
    public String toString() {
        return "HkMacauTaiwanExitentrypermitResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "pdfFileSize=" + pdfFileSize
                + "\n" + "wordsResultNum=" + wordsResultNum + "\n" + "wordsResult=" + wordsResult + "\n" + "}";
    }

}
