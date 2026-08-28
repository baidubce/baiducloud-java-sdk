package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SocialSecurityCardResponse extends BaseBceResponse {

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
    * 唯一的log id
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 图像方向
    */
    private String direction;

    /**
    * wordsResult
    */
    @JsonProperty("words_result")
    private SocialSecurityCardResult wordsResult;

    public Integer getErrorCode() {
        return errorCode;
    }

    public SocialSecurityCardResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public SocialSecurityCardResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public SocialSecurityCardResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public String getDirection() {
        return direction;
    }

    public SocialSecurityCardResponse setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public SocialSecurityCardResult getWordsResult() {
        return wordsResult;
    }

    public SocialSecurityCardResponse setWordsResult(SocialSecurityCardResult wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    @Override
    public String toString() {
        return "SocialSecurityCardResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "direction=" + direction + "\n"
                + "wordsResult=" + wordsResult + "\n" + "}";
    }

}
