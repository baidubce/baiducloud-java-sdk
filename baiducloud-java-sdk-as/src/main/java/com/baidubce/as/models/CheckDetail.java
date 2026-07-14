package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckDetail {
    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 详细信息
     */
    private String detail;

    /**
     * 系统建议
     */
    private String advice;

    public CheckDetail setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public String getResourceId() {
        return this.resourceId;
    }

    public CheckDetail setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    public String getDetail() {
        return this.detail;
    }

    public CheckDetail setAdvice(String advice) {
        this.advice = advice;
        return this;
    }

    public String getAdvice() {
        return this.advice;
    }

    @Override
    public String toString() {
        return "CheckDetail{" + "resourceId=" + resourceId + "\n" + "detail=" + detail + "\n" + "advice=" + advice + "\n" + "}";
    }

}