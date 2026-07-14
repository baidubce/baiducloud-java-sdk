package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EipGroupDecrease {
    /**
     * 是否开启
     */
    private Boolean enabled;

    public EipGroupDecrease setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    @Override
    public String toString() {
        return "EipGroupDecrease{" + "enabled=" + enabled + "\n" + "}";
    }

}