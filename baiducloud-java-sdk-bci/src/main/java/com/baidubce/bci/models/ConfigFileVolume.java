package com.baidubce.bci.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConfigFileVolume {
    /**
     * ConfigFileVolume名称
     */
    private String name;

    /**
     * 默认权限
     */
    private Integer defaultMode;

    /**
     * ConfigFile数据卷信息
     */
    private List<ConfigFileDetail> configFiles;

    public ConfigFileVolume setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ConfigFileVolume setDefaultMode(Integer defaultMode) {
        this.defaultMode = defaultMode;
        return this;
    }

    public Integer getDefaultMode() {
        return this.defaultMode;
    }

    public ConfigFileVolume setConfigFiles(List<ConfigFileDetail> configFiles) {
        this.configFiles = configFiles;
        return this;
    }

    public List<ConfigFileDetail> getConfigFiles() {
        return this.configFiles;
    }

    @Override
    public String toString() {
        return "ConfigFileVolume{" + "name=" + name + "\n" + "defaultMode=" + defaultMode + "\n" + "configFiles=" + configFiles + "\n" + "}";
    }

}