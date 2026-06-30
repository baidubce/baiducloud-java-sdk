package com.baidubce.bci.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConfigFileDetail {
    /**
     * ConfigFile文件路径
     */
    private String path;

    /**
     * ConfigFile文件名
     */
    @JsonProperty("file")
    private String bciFile;

    public ConfigFileDetail setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPath() {
        return this.path;
    }

    public ConfigFileDetail setFile(String bciFile) {
        this.bciFile = bciFile;
        return this;
    }

    public String getFile() {
        return this.bciFile;
    }

    @Override
    public String toString() {
        return "ConfigFileDetail{" + "path=" + path + "\n" + "bciFile=" + bciFile + "\n" + "}";
    }

}