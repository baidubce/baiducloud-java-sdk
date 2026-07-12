package com.baidubce.oos.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Option {
    /**
     * 选项显示名称
     */
    private String label;

    /**
     * 选项取值
     */
    private Object value;

    public Option setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getLabel() {
        return this.label;
    }

    public Option setValue(Object value) {
        this.value = value;
        return this;
    }

    public Object getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Option{" + "label=" + label + "\n" + "value=" + value + "\n" + "}";
    }

}