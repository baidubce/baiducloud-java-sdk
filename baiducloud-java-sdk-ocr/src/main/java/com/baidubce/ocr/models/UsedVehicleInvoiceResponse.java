package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsedVehicleInvoiceResponse extends BaseBceResponse {

    /**
    * 错误码
    */
    @JsonProperty("error_code")
    private Integer errorCode;

    /**
    * 错误描述信息
    */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
    * 唯一的log id，用于问题定位
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 图像方向，-1：未定义，0：正向，1：逆时针90度，2：逆时针180度，3：逆时针270度
    */
    private String direction;

    /**
    * wordResult
    */
    @JsonProperty("word_result")
    private UsedVehicleInvoiceWordResult wordResult;

    public Integer getErrorCode() {
        return errorCode;
    }

    public UsedVehicleInvoiceResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public UsedVehicleInvoiceResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public UsedVehicleInvoiceResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public String getDirection() {
        return direction;
    }

    public UsedVehicleInvoiceResponse setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public UsedVehicleInvoiceWordResult getWordResult() {
        return wordResult;
    }

    public UsedVehicleInvoiceResponse setWordResult(UsedVehicleInvoiceWordResult wordResult) {
        this.wordResult = wordResult;
        return this;
    }

    @Override
    public String toString() {
        return "UsedVehicleInvoiceResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "direction=" + direction + "\n"
                + "wordResult=" + wordResult + "\n" + "}";
    }

}
