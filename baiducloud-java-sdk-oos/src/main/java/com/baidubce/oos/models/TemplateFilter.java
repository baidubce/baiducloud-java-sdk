package com.baidubce.oos.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TemplateFilter {
    /**
     * 按单个模版名称过滤
     */
    private String name;

    public TemplateFilter setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "TemplateFilter{" + "name=" + name + "\n" + "}";
    }

}