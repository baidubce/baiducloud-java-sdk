package com.baidubce.rapidfs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Filter {
    /**
     * 需要过滤的字段，多组 filter 之间为条件与关系。例如 zone
     */
    private String name;

    /**
     * 字段的过滤值，多个 values 之间为逻辑或关系。例如：["zoneA", "zoneB"]
     */
    private List<String> values;

    public Filter setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Filter setValues(List<String> values) {
        this.values = values;
        return this;
    }

    public List<String> getValues() {
        return this.values;
    }

    @Override
    public String toString() {
        return "Filter{" + "name=" + name + "\n" + "values=" + values + "\n" + "}";
    }

}