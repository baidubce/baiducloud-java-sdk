package com.baidubce.bci.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VolumeMount {
    /**
     * 数据卷名称
     */
    private String name;

    /**
     * 数据卷类型
     */
    private String type;

    /**
     * 容器挂载数据卷目录
     */
    private String mountPath;

    /**
     * 是否只读，默认false
     */
    private Boolean readOnly;

    public VolumeMount setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public VolumeMount setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public VolumeMount setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    public String getMountPath() {
        return this.mountPath;
    }

    public VolumeMount setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    @Override
    public String toString() {
        return "VolumeMount{" + "name=" + name + "\n" + "type=" + type + "\n" + "mountPath=" + mountPath + "\n" + "readOnly=" + readOnly + "\n" + "}";
    }

}