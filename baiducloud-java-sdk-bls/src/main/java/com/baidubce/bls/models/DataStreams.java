package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataStreams {
    /**
     * 项目和日志集名称  default项目只显示名称了，非default项目为 项目名$日志集名称 的格式
     */
    private String name;

    /**
     * 目前和name一样，只有单个元素
     */
    private List<String> backingIndices;

    /**
     * 时间字段, 取值为：@timestamp
     */
    private String timestampField;

    public DataStreams setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public DataStreams setBackingIndices(List<String> backingIndices) {
        this.backingIndices = backingIndices;
        return this;
    }

    public List<String> getBackingIndices() {
        return this.backingIndices;
    }

    public DataStreams setTimestampField(String timestampField) {
        this.timestampField = timestampField;
        return this;
    }

    public String getTimestampField() {
        return this.timestampField;
    }

    @Override
    public String toString() {
        return "DataStreams{" + "name=" + name + "\n" + "backingIndices=" + backingIndices + "\n" + "timestampField=" + timestampField + "\n" + "}";
    }

}