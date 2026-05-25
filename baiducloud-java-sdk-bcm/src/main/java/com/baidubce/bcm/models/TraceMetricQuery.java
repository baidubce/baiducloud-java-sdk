package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TraceMetricQuery {
    /**
     * 
     */
    private String name;

    public TraceMetricQuery setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "TraceMetricQuery{" + "name=" + name + "\n" + "}";
    }

}