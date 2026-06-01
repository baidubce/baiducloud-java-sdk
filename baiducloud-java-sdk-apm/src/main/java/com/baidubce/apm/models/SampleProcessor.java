package com.baidubce.apm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SampleProcessor {
    /**
     * 采样器名称，用户自定义
     */
    private String name;

    /**
     * 是否启用当前采样器
     */
    private Boolean enabled;

    /**
     * 采样条件列表，多个采样条件之间是且关系
     */
    private List<SampleFilter> filters;

    /**
     * 采样率，取值范围：[0, 1]
     */
    private Float sampleRate;

    public SampleProcessor setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public SampleProcessor setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public SampleProcessor setFilters(List<SampleFilter> filters) {
        this.filters = filters;
        return this;
    }

    public List<SampleFilter> getFilters() {
        return this.filters;
    }

    public SampleProcessor setSampleRate(Float sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }

    public Float getSampleRate() {
        return this.sampleRate;
    }

    @Override
    public String toString() {
        return "SampleProcessor{" + "name=" + name + "\n" + "enabled=" + enabled + "\n" + "filters=" + filters + "\n" + "sampleRate=" + sampleRate + "\n" + "}";
    }

}