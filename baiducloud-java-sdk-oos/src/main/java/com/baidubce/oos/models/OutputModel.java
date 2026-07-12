package com.baidubce.oos.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OutputModel {
    /**
     * 输出名称
     */
    private String name;

    /**
     * 输出类型
     */
    private String type;

    /**
     * 输出描述
     */
    private String description;

    public OutputModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public OutputModel setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public OutputModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "OutputModel{" + "name=" + name + "\n" + "type=" + type + "\n" + "description=" + description + "\n" + "}";
    }

}