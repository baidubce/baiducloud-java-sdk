package com.baidubce.image.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveMoireResponse extends BaseBceResponse {

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
    * 返回处理后的图片，base64编码
    */
    @JsonProperty("image_processed")
    private String imageProcessed;

    /**
    * 传入PDF文件的总页数，当 pdf_file 参数有效时返回该字段
    */
    @JsonProperty("pdf_file_size")
    private Integer pdfFileSize;

    public Integer getErrorCode() {
        return errorCode;
    }

    public RemoveMoireResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public RemoveMoireResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public RemoveMoireResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public String getImageProcessed() {
        return imageProcessed;
    }

    public RemoveMoireResponse setImageProcessed(String imageProcessed) {
        this.imageProcessed = imageProcessed;
        return this;
    }

    public Integer getPdfFileSize() {
        return pdfFileSize;
    }

    public RemoveMoireResponse setPdfFileSize(Integer pdfFileSize) {
        this.pdfFileSize = pdfFileSize;
        return this;
    }

    @Override
    public String toString() {
        return "RemoveMoireResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "imageProcessed=" + imageProcessed + "\n"
                + "pdfFileSize=" + pdfFileSize + "\n" + "}";
    }

}
