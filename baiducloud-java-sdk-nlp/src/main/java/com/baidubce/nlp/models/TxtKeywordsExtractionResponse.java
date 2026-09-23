package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TxtKeywordsExtractionResponse extends BaseBceResponse {

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
    * 关键词提取结果的数组集合
    */
    private List<TxtKeywordsExtractionResult> results;

    public Integer getErrorCode() {
        return errorCode;
    }

    public TxtKeywordsExtractionResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public TxtKeywordsExtractionResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public TxtKeywordsExtractionResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public List<TxtKeywordsExtractionResult> getResults() {
        return results;
    }

    public TxtKeywordsExtractionResponse setResults(List<TxtKeywordsExtractionResult> results) {
        this.results = results;
        return this;
    }

    @Override
    public String toString() {
        return "TxtKeywordsExtractionResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "results=" + results + "\n" + "}";
    }

}
