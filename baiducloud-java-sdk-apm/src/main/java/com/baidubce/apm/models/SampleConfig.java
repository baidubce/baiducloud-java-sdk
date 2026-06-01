package com.baidubce.apm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SampleConfig {
    /**
     * 是否开启采样
     */
    private Boolean enabled;

    /**
     * 采样器列表
     */
    private List<SampleProcessor> processors;

    public SampleConfig setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public SampleConfig setProcessors(List<SampleProcessor> processors) {
        this.processors = processors;
        return this;
    }

    public List<SampleProcessor> getProcessors() {
        return this.processors;
    }

    @Override
    public String toString() {
        return "SampleConfig{" + "enabled=" + enabled + "\n" + "processors=" + processors + "\n" + "}";
    }

}