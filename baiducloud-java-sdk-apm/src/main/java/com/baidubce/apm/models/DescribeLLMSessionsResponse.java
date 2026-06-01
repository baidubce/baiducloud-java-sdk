package com.baidubce.apm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLLMSessionsResponse extends BaseBceResponse {

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
    * 会话列表
    */
    private List<LLMSessionItem> sessions;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeLLMSessionsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeLLMSessionsResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeLLMSessionsResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<LLMSessionItem> getSessions() {
        return sessions;
    }

    public DescribeLLMSessionsResponse setSessions(List<LLMSessionItem> sessions) {
        this.sessions = sessions;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeLLMSessionsResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "sessions=" + sessions + "\n" + "}";
    }

}
