package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConfigItem {
    /**
     * cpu个数
     */
    private Integer cpu;

    /**
     * 内存大小
     */
    private Integer memory;

    /**
     * 实例类型，具体可选类型参见InstanceType
     */
    private String type;

    /**
     * 实例规格类型
     */
    private String specId;

    /**
     * 实例规格
     */
    private String spec;

    /**
     * 可用区名称
     */
    private String zoneName;

    public ConfigItem setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    public Integer getCpu() {
        return this.cpu;
    }

    public ConfigItem setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    public Integer getMemory() {
        return this.memory;
    }

    public ConfigItem setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public ConfigItem setSpecId(String specId) {
        this.specId = specId;
        return this;
    }

    public String getSpecId() {
        return this.specId;
    }

    public ConfigItem setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getSpec() {
        return this.spec;
    }

    public ConfigItem setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    @Override
    public String toString() {
        return "ConfigItem{" + "cpu=" + cpu + "\n" + "memory=" + memory + "\n" + "type=" + type + "\n" + "specId=" + specId + "\n" + "spec=" + spec + "\n" + "zoneName=" + zoneName
                + "\n" + "}";
    }

}