package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RewriteConfig {
    /**
     * 是否启用
     */
    private Boolean enabled;

    /**
     * 重写路径
     */
    private String path;

    public RewriteConfig setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public RewriteConfig setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPath() {
        return this.path;
    }

    @Override
    public String toString() {
        return "RewriteConfig{" + "enabled=" + enabled + "\n" + "path=" + path + "\n" + "}";
    }

}