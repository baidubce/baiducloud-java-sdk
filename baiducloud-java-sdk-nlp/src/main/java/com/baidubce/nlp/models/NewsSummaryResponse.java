package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NewsSummaryResponse extends BaseBceResponse {

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
    * 请求唯一标识码
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 摘要结果
    */
    private String summary;

    public Integer getErrorCode() {
        return errorCode;
    }

    public NewsSummaryResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public NewsSummaryResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public NewsSummaryResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public NewsSummaryResponse setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    @Override
    public String toString() {
        return "NewsSummaryResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "summary=" + summary + "\n" + "}";
    }

}
