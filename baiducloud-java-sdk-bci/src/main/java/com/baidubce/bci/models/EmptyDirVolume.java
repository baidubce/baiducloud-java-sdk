package com.baidubce.bci.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmptyDirVolume {
    /**
     * EmptyDirVolume名称
     */
    private String name;

    /**
     * 存储媒介，默认空（node文件系统），支持memory
     */
    private String medium;

    /**
     * 大小（GiB）
     */
    private Float sizeLimit;

    public EmptyDirVolume setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public EmptyDirVolume setMedium(String medium) {
        this.medium = medium;
        return this;
    }

    public String getMedium() {
        return this.medium;
    }

    public EmptyDirVolume setSizeLimit(Float sizeLimit) {
        this.sizeLimit = sizeLimit;
        return this;
    }

    public Float getSizeLimit() {
        return this.sizeLimit;
    }

    @Override
    public String toString() {
        return "EmptyDirVolume{" + "name=" + name + "\n" + "medium=" + medium + "\n" + "sizeLimit=" + sizeLimit + "\n" + "}";
    }

}