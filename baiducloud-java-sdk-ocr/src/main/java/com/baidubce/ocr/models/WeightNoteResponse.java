package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeightNoteResponse extends BaseBceResponse {

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
    * 调用日志id，用于问题定位
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 识别结果数，表示words_result的元素个数
    */
    @JsonProperty("words_result_num")
    private Integer wordsResultNum;

    /**
    * 识别结果
    */
    @JsonProperty("words_result")
    private List<WeightNoteWordsResult> wordsResult;

    /**
    * 传入PDF文件的总页数，当pdf_file参数有效时返回该字段
    */
    @JsonProperty("pdf_file_size")
    private Integer pdfFileSize;

    public Integer getErrorCode() {
        return errorCode;
    }

    public WeightNoteResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public WeightNoteResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public WeightNoteResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getWordsResultNum() {
        return wordsResultNum;
    }

    public WeightNoteResponse setWordsResultNum(Integer wordsResultNum) {
        this.wordsResultNum = wordsResultNum;
        return this;
    }

    public List<WeightNoteWordsResult> getWordsResult() {
        return wordsResult;
    }

    public WeightNoteResponse setWordsResult(List<WeightNoteWordsResult> wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    public Integer getPdfFileSize() {
        return pdfFileSize;
    }

    public WeightNoteResponse setPdfFileSize(Integer pdfFileSize) {
        this.pdfFileSize = pdfFileSize;
        return this;
    }

    @Override
    public String toString() {
        return "WeightNoteResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "wordsResultNum=" + wordsResultNum + "\n"
                + "wordsResult=" + wordsResult + "\n" + "pdfFileSize=" + pdfFileSize + "\n" + "}";
    }

}
