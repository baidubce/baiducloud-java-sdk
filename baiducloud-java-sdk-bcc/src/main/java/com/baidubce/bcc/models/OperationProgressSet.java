package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OperationProgressSet {
    /**
     * 资源ID
     */
    private String resourceId;

    /**
     * 操作状态
     */
    private String operationStatus;

    /**
     * 响应码
     */
    private String code;

    /**
     * 错误信息
     */
    private String errorMessage;

    public OperationProgressSet setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public String getResourceId() {
        return this.resourceId;
    }

    public OperationProgressSet setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }

    public String getOperationStatus() {
        return this.operationStatus;
    }

    public OperationProgressSet setCode(String code) {
        this.code = code;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public OperationProgressSet setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Override
    public String toString() {
        return "OperationProgressSet{" + "resourceId=" + resourceId + "\n" + "operationStatus=" + operationStatus + "\n" + "code=" + code + "\n" + "errorMessage=" + errorMessage
                + "\n" + "}";
    }

}