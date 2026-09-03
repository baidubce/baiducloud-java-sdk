package com.baidubce.image.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocRepairResponse extends BaseBceResponse {

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
    * 返回处理后的图片，base64编码
    */
    private String result;

    public Long getLogId() {
        return logId;
    }

    public DocRepairResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public DocRepairResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public DocRepairResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public String getResult() {
        return result;
    }

    public DocRepairResponse setResult(String result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "DocRepairResponse{" + "logId=" + logId + "\n" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "result=" + result + "\n" + "}";
    }

}
