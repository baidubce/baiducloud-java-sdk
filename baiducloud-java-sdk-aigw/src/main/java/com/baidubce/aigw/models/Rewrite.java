package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Rewrite {
    /**
     * 是否启用普通路径重写
     */
    private Boolean enabled;

    /**
     * 重写后的路径，enabled 为 true 时必需
     */
    private String path;

    public Rewrite setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public Rewrite setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPath() {
        return this.path;
    }

    @Override
    public String toString() {
        return "Rewrite{" + "enabled=" + enabled + "\n" + "path=" + path + "\n" + "}";
    }

}