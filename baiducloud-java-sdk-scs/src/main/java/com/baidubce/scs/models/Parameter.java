package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Parameter {
    /**
     * 参数默认值
     */
    @JsonProperty("default")
    private String scsDefault;

    /**
     * 是否需要重启生效：1（重启生效,当前需要提交工单重启）0（无需重启，提交后即生效）
     */
    private Integer forceRestart;

    /**
     * 参数名称
     */
    private String name;

    /**
     * 设置参数值
     */
    private String value;

    public Parameter setDefault(String scsDefault) {
        this.scsDefault = scsDefault;
        return this;
    }

    public String getDefault() {
        return this.scsDefault;
    }

    public Parameter setForceRestart(Integer forceRestart) {
        this.forceRestart = forceRestart;
        return this;
    }

    public Integer getForceRestart() {
        return this.forceRestart;
    }

    public Parameter setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Parameter setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Parameter{" + "scsDefault=" + scsDefault + "\n" + "forceRestart=" + forceRestart + "\n" + "name=" + name + "\n" + "value=" + value + "\n" + "}";
    }

}