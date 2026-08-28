package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessLicenseResponse extends BaseBceResponse {

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
    * 请求标识码，随机数，唯一
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 图像方向
    */
    private Integer direction;

    /**
    * 营业执照类型（当risk_warn=true时返回）
    */
    @JsonProperty("risk_type")
    private String riskType;

    /**
    * 识别结果数
    */
    @JsonProperty("words_result_num")
    private Integer wordsResultNum;

    /**
    * 识别结果，key为字段名称
    */
    @JsonProperty("words_result")
    private Object wordsResult;

    /**
    * cardQuality
    */
    @JsonProperty("card_quality")
    private BusinessLicenseQuality cardQuality;

    public Integer getErrorCode() {
        return errorCode;
    }

    public BusinessLicenseResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public BusinessLicenseResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public BusinessLicenseResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getDirection() {
        return direction;
    }

    public BusinessLicenseResponse setDirection(Integer direction) {
        this.direction = direction;
        return this;
    }

    public String getRiskType() {
        return riskType;
    }

    public BusinessLicenseResponse setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }

    public Integer getWordsResultNum() {
        return wordsResultNum;
    }

    public BusinessLicenseResponse setWordsResultNum(Integer wordsResultNum) {
        this.wordsResultNum = wordsResultNum;
        return this;
    }

    public Object getWordsResult() {
        return wordsResult;
    }

    public BusinessLicenseResponse setWordsResult(Object wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    public BusinessLicenseQuality getCardQuality() {
        return cardQuality;
    }

    public BusinessLicenseResponse setCardQuality(BusinessLicenseQuality cardQuality) {
        this.cardQuality = cardQuality;
        return this;
    }

    @Override
    public String toString() {
        return "BusinessLicenseResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "direction=" + direction + "\n"
                + "riskType=" + riskType + "\n" + "wordsResultNum=" + wordsResultNum + "\n" + "wordsResult=" + wordsResult + "\n" + "cardQuality=" + cardQuality + "\n" + "}";
    }

}
