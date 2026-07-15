package com.baidubce.cloudassistant.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchGetAgentResponse extends BaseBceResponse {

    /**
    * 请求id
    */
    private String requestId;

    /**
    * 响应状态，成功为success
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * 请求是否处理成功
    */
    private Boolean success;

    /**
    * 虚机bsm-agent状态
    */
    private List<Agent> result;

    public String getRequestId() {
        return requestId;
    }

    public BatchGetAgentResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getCode() {
        return code;
    }

    public BatchGetAgentResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public BatchGetAgentResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public Boolean getSuccess() {
        return success;
    }

    public BatchGetAgentResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public List<Agent> getResult() {
        return result;
    }

    public BatchGetAgentResponse setResult(List<Agent> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "BatchGetAgentResponse{" + "requestId=" + requestId + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "success=" + success + "\n" + "result=" + result
                + "\n" + "}";
    }

}
