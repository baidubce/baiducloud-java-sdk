package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InspectionConfig {
    /**
     * 必填。是否开启自动巡检
     */
    private Boolean isInspectionEnabled;

    /**
     * 必填。自动巡检频率
     */
    private String inspectionFrequency;

    public InspectionConfig setIsInspectionEnabled(Boolean isInspectionEnabled) {
        this.isInspectionEnabled = isInspectionEnabled;
        return this;
    }

    public Boolean getIsInspectionEnabled() {
        return this.isInspectionEnabled;
    }

    public InspectionConfig setInspectionFrequency(String inspectionFrequency) {
        this.inspectionFrequency = inspectionFrequency;
        return this;
    }

    public String getInspectionFrequency() {
        return this.inspectionFrequency;
    }

    @Override
    public String toString() {
        return "InspectionConfig{" + "isInspectionEnabled=" + isInspectionEnabled + "\n" + "inspectionFrequency=" + inspectionFrequency + "\n" + "}";
    }

}