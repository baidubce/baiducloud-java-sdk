package com.baidubce.image.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ColorEnhanceResponse extends BaseBceResponse {

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
    private String image;

    public Integer getErrorCode() {
        return errorCode;
    }

    public ColorEnhanceResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public ColorEnhanceResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public ColorEnhanceResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public String getImage() {
        return image;
    }

    public ColorEnhanceResponse setImage(String image) {
        this.image = image;
        return this;
    }

    @Override
    public String toString() {
        return "ColorEnhanceResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "image=" + image + "\n" + "}";
    }

}
