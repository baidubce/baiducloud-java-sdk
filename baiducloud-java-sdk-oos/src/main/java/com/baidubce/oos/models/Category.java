package com.baidubce.oos.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Category {
    /**
     * 分类名
     */
    private String name;

    /**
     * 排序序号
     */
    private Integer sequence;

    public Category setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Category setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    public Integer getSequence() {
        return this.sequence;
    }

    @Override
    public String toString() {
        return "Category{" + "name=" + name + "\n" + "sequence=" + sequence + "\n" + "}";
    }

}