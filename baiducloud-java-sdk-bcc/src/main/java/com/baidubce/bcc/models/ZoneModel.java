package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ZoneModel {
    /**
     * 可用区名称
     */
    private String zoneName;

    public ZoneModel setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    @Override
    public String toString() {
        return "ZoneModel{" + "zoneName=" + zoneName + "\n" + "}";
    }

}