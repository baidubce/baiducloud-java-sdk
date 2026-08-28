package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DrivingLicenseQualityPropobility {
    /**
     * 
     */
    @JsonProperty("is_clear_propobility")
    private Float isClearPropobility;

    /**
     * 
     */
    @JsonProperty("is_complete_propobility")
    private Float isCompletePropobility;

    /**
     * 是否被遮挡质量类型对应的概率，0代表图像被遮挡，1代表图像没有被遮挡
     */
    @JsonProperty("is_noshield_propobility")
    private String isNoshieldPropobility;

    public DrivingLicenseQualityPropobility setIsClearPropobility(Float isClearPropobility) {
        this.isClearPropobility = isClearPropobility;
        return this;
    }

    public Float getIsClearPropobility() {
        return this.isClearPropobility;
    }

    public DrivingLicenseQualityPropobility setIsCompletePropobility(Float isCompletePropobility) {
        this.isCompletePropobility = isCompletePropobility;
        return this;
    }

    public Float getIsCompletePropobility() {
        return this.isCompletePropobility;
    }

    public DrivingLicenseQualityPropobility setIsNoshieldPropobility(String isNoshieldPropobility) {
        this.isNoshieldPropobility = isNoshieldPropobility;
        return this;
    }

    public String getIsNoshieldPropobility() {
        return this.isNoshieldPropobility;
    }

    @Override
    public String toString() {
        return "DrivingLicenseQualityPropobility{" + "isClearPropobility=" + isClearPropobility + "\n" + "isCompletePropobility=" + isCompletePropobility + "\n"
                + "isNoshieldPropobility=" + isNoshieldPropobility + "\n" + "}";
    }

}