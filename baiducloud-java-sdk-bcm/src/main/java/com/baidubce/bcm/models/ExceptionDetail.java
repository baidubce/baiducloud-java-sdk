package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExceptionDetail {
    /**
     * 异常ID
     */
    private String id;

    /**
     * 异常堆栈
     */
    private String stacktrace;

    /**
     * 异常所属服务
     */
    private String service;

    public ExceptionDetail setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public ExceptionDetail setStacktrace(String stacktrace) {
        this.stacktrace = stacktrace;
        return this;
    }

    public String getStacktrace() {
        return this.stacktrace;
    }

    public ExceptionDetail setService(String service) {
        this.service = service;
        return this;
    }

    public String getService() {
        return this.service;
    }

    @Override
    public String toString() {
        return "ExceptionDetail{" + "id=" + id + "\n" + "stacktrace=" + stacktrace + "\n" + "service=" + service + "\n" + "}";
    }

}