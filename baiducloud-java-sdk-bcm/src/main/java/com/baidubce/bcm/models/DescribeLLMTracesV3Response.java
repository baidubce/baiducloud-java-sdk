package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLLMTracesV3Response extends BaseBceResponse {

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

    public DescribeLLMTracesV3Response setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeLLMTracesV3Response setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeLLMTracesV3Response setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<LLMTraceItem> getTraces() {
        return traces;
    }

    public DescribeLLMTracesV3Response setTraces(List<LLMTraceItem> traces) {
        this.traces = traces;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeLLMTracesV3Response{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "traces=" + traces + "\n" + "}";
    }

}
