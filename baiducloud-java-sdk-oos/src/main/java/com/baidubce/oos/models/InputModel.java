package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InputModel {
    /**
     * 参数名称
     */
    private String name;

    /**
     * 是否必填
     */
    private Boolean required;

    /**
     * 参数类型
     */
    private String type;

    /**
     * 参数描述
     */
    private String description;

    /**
     * 可选值列表
     */
    private List<Object> options;

    /**
     * 默认值
     */
    @JsonProperty("default")
    private Object oosDefault;

    public InputModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public InputModel setRequired(Boolean required) {
        this.required = required;
        return this;
    }

    public Boolean getRequired() {
        return this.required;
    }

    public InputModel setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public InputModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public InputModel setOptions(List<Object> options) {
        this.options = options;
        return this;
    }

    public List<Object> getOptions() {
        return this.options;
    }

    public InputModel setDefault(Object oosDefault) {
        this.oosDefault = oosDefault;
        return this;
    }

    public Object getDefault() {
        return this.oosDefault;
    }

    @Override
    public String toString() {
        return "InputModel{" + "name=" + name + "\n" + "required=" + required + "\n" + "type=" + type + "\n" + "description=" + description + "\n" + "options=" + options + "\n"
                + "oosDefault=" + oosDefault + "\n" + "}";
    }

}