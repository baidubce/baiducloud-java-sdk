package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleInfo {
    /**
     * location
     */
    private VehicleDetectLocation location;

    /**
     * 车辆类型
     */
    private String type;

    /**
     * 置信度，0-1
     */
    private Float probability;

    public VehicleInfo setLocation(VehicleDetectLocation location) {
        this.location = location;
        return this;
    }

    public VehicleDetectLocation getLocation() {
        return this.location;
    }

    public VehicleInfo setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public VehicleInfo setProbability(Float probability) {
        this.probability = probability;
        return this;
    }

    public Float getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "VehicleInfo{" + "location=" + location + "\n" + "type=" + type + "\n" + "probability=" + probability + "\n" + "}";
    }

}