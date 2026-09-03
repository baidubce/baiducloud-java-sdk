package com.baidubce.image.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogoAddResponse extends BaseBceResponse {

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
    * 输入图片签名，可用于删除
    */
    @JsonProperty("cont_sign")
    private String contSign;

    public Integer getErrorCode() {
        return errorCode;
    }

    public LogoAddResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public LogoAddResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public LogoAddResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public String getContSign() {
        return contSign;
    }

    public LogoAddResponse setContSign(String contSign) {
        this.contSign = contSign;
        return this;
    }

    @Override
    public String toString() {
        return "LogoAddResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "contSign=" + contSign + "\n" + "}";
    }

}
