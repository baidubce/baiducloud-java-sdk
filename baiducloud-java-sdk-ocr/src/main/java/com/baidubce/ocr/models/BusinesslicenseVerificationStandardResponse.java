package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinesslicenseVerificationStandardResponse extends BaseBceResponse {

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
    * 识别结果数，表示words_result的元素个数
    */
    @JsonProperty("words_result_num")
    private Integer wordsResultNum;

    /**
    * wordsResult
    */
    @JsonProperty("words_result")
    private BusinesslicenseVerificationStandardResult wordsResult;

    public Integer getErrorCode() {
        return errorCode;
    }

    public BusinesslicenseVerificationStandardResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public BusinesslicenseVerificationStandardResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public BusinesslicenseVerificationStandardResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getWordsResultNum() {
        return wordsResultNum;
    }

    public BusinesslicenseVerificationStandardResponse setWordsResultNum(Integer wordsResultNum) {
        this.wordsResultNum = wordsResultNum;
        return this;
    }

    public BusinesslicenseVerificationStandardResult getWordsResult() {
        return wordsResult;
    }

    public BusinesslicenseVerificationStandardResponse setWordsResult(BusinesslicenseVerificationStandardResult wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    @Override
    public String toString() {
        return "BusinesslicenseVerificationStandardResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "wordsResultNum="
                + wordsResultNum + "\n" + "wordsResult=" + wordsResult + "\n" + "}";
    }

}
