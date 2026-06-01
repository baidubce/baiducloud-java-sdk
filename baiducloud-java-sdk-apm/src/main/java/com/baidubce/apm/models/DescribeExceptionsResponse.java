package com.baidubce.apm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeExceptionsResponse extends BaseBceResponse {

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
    * 异常列表，每项包含id(异常ID)、stacktrace(异常堆栈)、service(异常所属服务)
    */
    private List<ExceptionDetail> exceptions;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeExceptionsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeExceptionsResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeExceptionsResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<ExceptionDetail> getExceptions() {
        return exceptions;
    }

    public DescribeExceptionsResponse setExceptions(List<ExceptionDetail> exceptions) {
        this.exceptions = exceptions;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeExceptionsResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "exceptions=" + exceptions + "\n" + "}";
    }

}
