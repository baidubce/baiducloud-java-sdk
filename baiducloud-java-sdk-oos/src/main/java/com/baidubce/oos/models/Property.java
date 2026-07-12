package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Property {
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
     * 参数显示名称
     */
    private String label;

    /**
     * 参数描述
     */
    private String description;

    /**
     * 可选项列表是否允许多选
     */
    private Boolean multiple;

    /**
     * 可选项列表
     */
    private List<Object> options;

    /**
     * 新版可选项列表，目前仅系统操作符使用
     */
    private List<Option> selectOptions;

    /**
     * 默认取值
     */
    private Object defaultValue;

    public Property setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Property setRequired(Boolean required) {
        this.required = required;
        return this;
    }

    public Boolean getRequired() {
        return this.required;
    }

    public Property setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Property setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getLabel() {
        return this.label;
    }

    public Property setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Property setMultiple(Boolean multiple) {
        this.multiple = multiple;
        return this;
    }

    public Boolean getMultiple() {
        return this.multiple;
    }

    public Property setOptions(List<Object> options) {
        this.options = options;
        return this;
    }

    public List<Object> getOptions() {
        return this.options;
    }

    public Property setSelectOptions(List<Option> selectOptions) {
        this.selectOptions = selectOptions;
        return this;
    }

    public List<Option> getSelectOptions() {
        return this.selectOptions;
    }

    public Property setDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    public Object getDefaultValue() {
        return this.defaultValue;
    }

    @Override
    public String toString() {
        return "Property{" + "name=" + name + "\n" + "required=" + required + "\n" + "type=" + type + "\n" + "label=" + label + "\n" + "description=" + description + "\n"
                + "multiple=" + multiple + "\n" + "options=" + options + "\n" + "selectOptions=" + selectOptions + "\n" + "defaultValue=" + defaultValue + "\n" + "}";
    }

}