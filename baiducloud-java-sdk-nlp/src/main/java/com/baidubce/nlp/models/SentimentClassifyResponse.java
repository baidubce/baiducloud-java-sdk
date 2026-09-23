package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SentimentClassifyResponse extends BaseBceResponse {

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
    * 输入的文本内容
    */
    private String text;

    /**
    * 情感倾向分析结果数组
    */
    private List<SentimentClassifyItem> items;

    public Integer getErrorCode() {
        return errorCode;
    }

    public SentimentClassifyResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public SentimentClassifyResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public SentimentClassifyResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public String getText() {
        return text;
    }

    public SentimentClassifyResponse setText(String text) {
        this.text = text;
        return this;
    }

    public List<SentimentClassifyItem> getItems() {
        return items;
    }

    public SentimentClassifyResponse setItems(List<SentimentClassifyItem> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "SentimentClassifyResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "text=" + text + "\n" + "items=" + items
                + "\n" + "}";
    }

}
