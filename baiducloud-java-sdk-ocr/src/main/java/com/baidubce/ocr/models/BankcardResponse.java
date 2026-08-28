package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BankcardResponse extends BaseBceResponse {

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
    * 请求标识码
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 图像方向
    */
    private Integer direction;

    /**
    * result
    */
    private BankcardResult result;

    public Integer getErrorCode() {
        return errorCode;
    }

    public BankcardResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public BankcardResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public BankcardResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getDirection() {
        return direction;
    }

    public BankcardResponse setDirection(Integer direction) {
        this.direction = direction;
        return this;
    }

    public BankcardResult getResult() {
        return result;
    }

    public BankcardResponse setResult(BankcardResult result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "BankcardResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "direction=" + direction + "\n" + "result="
                + result + "\n" + "}";
    }

}
