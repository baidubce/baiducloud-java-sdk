package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentTagResponse extends BaseBceResponse {

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
    * 评论观点抽取结果列表
    */
    private List<CommentTagItem> items;

    public Integer getErrorCode() {
        return errorCode;
    }

    public CommentTagResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public CommentTagResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public CommentTagResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public List<CommentTagItem> getItems() {
        return items;
    }

    public CommentTagResponse setItems(List<CommentTagItem> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "CommentTagResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "items=" + items + "\n" + "}";
    }

}
