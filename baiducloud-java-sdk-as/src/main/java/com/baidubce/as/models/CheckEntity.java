package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckEntity {
    /**
     * 标签
     */
    private String label;

    /**
     * 检查状态
     */
    private Object status;

    /**
     * result
     */
    private CheckDetail result;

    public CheckEntity setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getLabel() {
        return this.label;
    }

    public CheckEntity setStatus(Object status) {
        this.status = status;
        return this;
    }

    public Object getStatus() {
        return this.status;
    }

    public CheckEntity setResult(CheckDetail result) {
        this.result = result;
        return this;
    }

    public CheckDetail getResult() {
        return this.result;
    }

    @Override
    public String toString() {
        return "CheckEntity{" + "label=" + label + "\n" + "status=" + status + "\n" + "result=" + result + "\n" + "}";
    }

}