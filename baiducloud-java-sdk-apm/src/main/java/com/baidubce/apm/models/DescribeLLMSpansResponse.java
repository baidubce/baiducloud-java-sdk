package com.baidubce.apm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLLMSpansResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 状态码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * Span列表
    */
    private List<LLMSpan> spans;

    /**
    * 翻页游标，用于填充下一页请求中的marker参数
    */
    private String nextMarker;

    /**
    * 是否还有下一页，true表示还有下一页，false表示已是最后一页
    */
    private Boolean isTruncated;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeLLMSpansResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeLLMSpansResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeLLMSpansResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<LLMSpan> getSpans() {
        return spans;
    }

    public DescribeLLMSpansResponse setSpans(List<LLMSpan> spans) {
        this.spans = spans;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public DescribeLLMSpansResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public DescribeLLMSpansResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeLLMSpansResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "spans=" + spans + "\n" + "nextMarker="
                + nextMarker + "\n" + "isTruncated=" + isTruncated + "\n" + "}";
    }

}
