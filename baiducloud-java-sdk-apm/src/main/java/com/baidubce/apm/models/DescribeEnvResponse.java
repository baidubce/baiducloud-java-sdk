package com.baidubce.apm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeEnvResponse extends BaseBceResponse {

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
    * env列表
    */
    private List<String> env;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeEnvResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeEnvResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeEnvResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<String> getEnv() {
        return env;
    }

    public DescribeEnvResponse setEnv(List<String> env) {
        this.env = env;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeEnvResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "env=" + env + "\n" + "}";
    }

}
