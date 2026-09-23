package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SimnetResponse extends BaseBceResponse {

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
    * 随机数，请求唯一标识码
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 相似度结果取值(0,1]，分数越高说明相似度越高
    */
    private Float score;

    /**
    * texts
    */
    private Texts texts;

    public Integer getErrorCode() {
        return errorCode;
    }

    public SimnetResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public SimnetResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public SimnetResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Float getScore() {
        return score;
    }

    public SimnetResponse setScore(Float score) {
        this.score = score;
        return this;
    }

    public Texts getTexts() {
        return texts;
    }

    public SimnetResponse setTexts(Texts texts) {
        this.texts = texts;
        return this;
    }

    @Override
    public String toString() {
        return "SimnetResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "score=" + score + "\n" + "texts=" + texts + "\n"
                + "}";
    }

}
