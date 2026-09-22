package com.baidubce.scs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ZoneNames {
    /**
     * 可用区列表
     */
    private List<String> zoneNames;

    public ZoneNames setZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
        return this;
    }

    public List<String> getZoneNames() {
        return this.zoneNames;
    }

    @Override
    public String toString() {
        return "ZoneNames{" + "zoneNames=" + zoneNames + "\n" + "}";
    }

}