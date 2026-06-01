package com.baidubce.apm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLLMTracesResponse extends BaseBceResponse {

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
    * Trace列表
    */
    private List<LLMTraceItem> traces;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeLLMTracesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeLLMTracesResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeLLMTracesResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<LLMTraceItem> getTraces() {
        return traces;
    }

    public DescribeLLMTracesResponse setTraces(List<LLMTraceItem> traces) {
        this.traces = traces;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeLLMTracesResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "traces=" + traces + "\n" + "}";
    }

}
