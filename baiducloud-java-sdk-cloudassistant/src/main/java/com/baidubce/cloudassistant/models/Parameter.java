package com.baidubce.cloudassistant.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Parameter {
    /**
     * 参数名称
     */
    private String name;

    /**
     * 参数描述
     */
    private String desc;

    /**
     * 是否必填
     */
    private Boolean required;

    /**
     * 默认值
     */
    private String defaultValue;

    public Parameter setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Parameter setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public Parameter setRequired(Boolean required) {
        this.required = required;
        return this;
    }

    public Boolean getRequired() {
        return this.required;
    }

    public Parameter setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    @Override
    public String toString() {
        return "Parameter{" + "name=" + name + "\n" + "desc=" + desc + "\n" + "required=" + required + "\n" + "defaultValue=" + defaultValue + "\n" + "}";
    }

}