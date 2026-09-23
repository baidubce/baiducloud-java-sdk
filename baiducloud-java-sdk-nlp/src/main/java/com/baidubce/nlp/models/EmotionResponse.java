package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmotionResponse extends BaseBceResponse {

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
    * 输入的对话文本内容
    */
    private String text;

    /**
    * 分析结果数组
    */
    private List<EmotionItem> items;

    public Integer getErrorCode() {
        return errorCode;
    }

    public EmotionResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public EmotionResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public EmotionResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public String getText() {
        return text;
    }

    public EmotionResponse setText(String text) {
        this.text = text;
        return this;
    }

    public List<EmotionItem> getItems() {
        return items;
    }

    public EmotionResponse setItems(List<EmotionItem> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "EmotionResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "text=" + text + "\n" + "items=" + items + "\n"
                + "}";
    }

}
