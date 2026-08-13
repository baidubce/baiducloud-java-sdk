package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FallbackConfig {
    /**
     * 是否启用 AI Fallback
     */
    private Boolean enabled;

    /**
     * Fallback 服务名称
     */
    private String serviceName;

    /**
     * 模型名称模式：passthrough、specify
     */
    private String modelNameMode;

    /**
     * modelNameMode 为 specify 时使用的固定模型名称
     */
    private String specifiedModelName;

    public FallbackConfig setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public FallbackConfig setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public FallbackConfig setModelNameMode(String modelNameMode) {
        this.modelNameMode = modelNameMode;
        return this;
    }

    public String getModelNameMode() {
        return this.modelNameMode;
    }

    public FallbackConfig setSpecifiedModelName(String specifiedModelName) {
        this.specifiedModelName = specifiedModelName;
        return this;
    }

    public String getSpecifiedModelName() {
        return this.specifiedModelName;
    }

    @Override
    public String toString() {
        return "FallbackConfig{" + "enabled=" + enabled + "\n" + "serviceName=" + serviceName + "\n" + "modelNameMode=" + modelNameMode + "\n" + "specifiedModelName="
                + specifiedModelName + "\n" + "}";
    }

}