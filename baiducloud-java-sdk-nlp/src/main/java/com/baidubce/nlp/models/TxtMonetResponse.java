package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TxtMonetResponse extends BaseBceResponse {

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
    * 输入的原文本内容列表
    */
    @JsonProperty("results_list")
    private List<ResultContent> resultsList;

    public Integer getErrorCode() {
        return errorCode;
    }

    public TxtMonetResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public TxtMonetResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public TxtMonetResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public List<ResultContent> getResultsList() {
        return resultsList;
    }

    public TxtMonetResponse setResultsList(List<ResultContent> resultsList) {
        this.resultsList = resultsList;
        return this;
    }

    @Override
    public String toString() {
        return "TxtMonetResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "resultsList=" + resultsList + "\n" + "}";
    }

}
