package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeywordResponse extends BaseBceResponse {

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
    * 分析结果数组
    */
    private List<KeywordItem> items;

    public Integer getErrorCode() {
        return errorCode;
    }

    public KeywordResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public KeywordResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public KeywordResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public List<KeywordItem> getItems() {
        return items;
    }

    public KeywordResponse setItems(List<KeywordItem> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "KeywordResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "items=" + items + "\n" + "}";
    }

}
