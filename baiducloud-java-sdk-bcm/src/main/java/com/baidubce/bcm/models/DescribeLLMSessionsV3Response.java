package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLLMSessionsV3Response extends BaseBceResponse {

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

    public DescribeLLMSessionsV3Response setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeLLMSessionsV3Response setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeLLMSessionsV3Response setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<LLMSessionItem> getSessions() {
        return sessions;
    }

    public DescribeLLMSessionsV3Response setSessions(List<LLMSessionItem> sessions) {
        this.sessions = sessions;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeLLMSessionsV3Response{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "sessions=" + sessions + "\n" + "}";
    }

}
