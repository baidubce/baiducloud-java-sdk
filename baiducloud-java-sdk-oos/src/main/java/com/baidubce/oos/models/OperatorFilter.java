package com.baidubce.oos.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OperatorFilter {
    /**
     * 系统操作符名称过滤关键字
     */
    private String name;

    public OperatorFilter setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "OperatorFilter{" + "name=" + name + "\n" + "}";
    }

}