package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SealResponse extends BaseBceResponse {

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
    * 识别结果数，表示results的元素个数
    */
    @JsonProperty("result_num")
    private Integer resultNum;

    /**
    * 定位结果数组
    */
    private List<SealResult> result;

    /**
    * 传入PDF文件的总页数，当 pdf_file 参数有效时返回该字段
    */
    @JsonProperty("pdf_file_size")
    private Integer pdfFileSize;

    public Integer getErrorCode() {
        return errorCode;
    }

    public SealResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public SealResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public SealResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getResultNum() {
        return resultNum;
    }

    public SealResponse setResultNum(Integer resultNum) {
        this.resultNum = resultNum;
        return this;
    }

    public List<SealResult> getResult() {
        return result;
    }

    public SealResponse setResult(List<SealResult> result) {
        this.result = result;
        return this;
    }

    public Integer getPdfFileSize() {
        return pdfFileSize;
    }

    public SealResponse setPdfFileSize(Integer pdfFileSize) {
        this.pdfFileSize = pdfFileSize;
        return this;
    }

    @Override
    public String toString() {
        return "SealResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "resultNum=" + resultNum + "\n" + "result=" + result
                + "\n" + "pdfFileSize=" + pdfFileSize + "\n" + "}";
    }

}
