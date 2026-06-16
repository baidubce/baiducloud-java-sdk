package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PassInstanceModel {
    /**
     * 应用名称
     */
    private String application;

    /**
     * 实例数量
     */
    private Integer instanceCount;

    public PassInstanceModel setApplication(String application) {
        this.application = application;
        return this;
    }

    public String getApplication() {
        return this.application;
    }

    public PassInstanceModel setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    @Override
    public String toString() {
        return "PassInstanceModel{" + "application=" + application + "\n" + "instanceCount=" + instanceCount + "\n" + "}";
    }

}