package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LexerResponse extends BaseBceResponse {

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
    * 原始单条请求文本
    */
    private String text;

    /**
    * 词汇数组，每个元素对应结果中的一个词
    */
    private List<LexerItem> items;

    public Integer getErrorCode() {
        return errorCode;
    }

    public LexerResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public LexerResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public LexerResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public String getText() {
        return text;
    }

    public LexerResponse setText(String text) {
        this.text = text;
        return this;
    }

    public List<LexerItem> getItems() {
        return items;
    }

    public LexerResponse setItems(List<LexerItem> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "LexerResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "text=" + text + "\n" + "items=" + items + "\n"
                + "}";
    }

}
