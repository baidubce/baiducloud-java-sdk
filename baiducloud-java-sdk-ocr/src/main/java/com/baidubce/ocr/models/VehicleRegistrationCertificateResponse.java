package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleRegistrationCertificateResponse extends BaseBceResponse {

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
    * 图像方向，-1：未定义，0：正向，1：逆时针90度，2：逆时针180度，3：逆时针270度
    */
    private String direction;

    /**
    * wordsResult
    */
    @JsonProperty("words_result")
    private VehicleRegisterCertificationwordsResult wordsResult;

    public Integer getErrorCode() {
        return errorCode;
    }

    public VehicleRegistrationCertificateResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public VehicleRegistrationCertificateResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public VehicleRegistrationCertificateResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public String getDirection() {
        return direction;
    }

    public VehicleRegistrationCertificateResponse setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public VehicleRegisterCertificationwordsResult getWordsResult() {
        return wordsResult;
    }

    public VehicleRegistrationCertificateResponse setWordsResult(VehicleRegisterCertificationwordsResult wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    @Override
    public String toString() {
        return "VehicleRegistrationCertificateResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "direction=" + direction
                + "\n" + "wordsResult=" + wordsResult + "\n" + "}";
    }

}
