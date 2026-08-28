package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessLicenseQuality {
    /**
     * 是否清晰：0-不清晰，1-清晰
     */
    @JsonProperty("is_clear")
    private Integer isClear;

    /**
     * 清晰概率，值在0-1之间，值越大表示图像质量越好
     */
    @JsonProperty("is_clear_propobility")
    private Double isClearPropobility;

    /**
     * 是否边框/四角完整：0-不完整，1-完整
     */
    @JsonProperty("is_complete")
    private Integer isComplete;

    /**
     * 边框/四角完整概率，值在0-1之间，值越大表示图像质量越好
     */
    @JsonProperty("is_complete_propobility")
    private Double isCompletePropobility;

    public BusinessLicenseQuality setIsClear(Integer isClear) {
        this.isClear = isClear;
        return this;
    }

    public Integer getIsClear() {
        return this.isClear;
    }

    public BusinessLicenseQuality setIsClearPropobility(Double isClearPropobility) {
        this.isClearPropobility = isClearPropobility;
        return this;
    }

    public Double getIsClearPropobility() {
        return this.isClearPropobility;
    }

    public BusinessLicenseQuality setIsComplete(Integer isComplete) {
        this.isComplete = isComplete;
        return this;
    }

    public Integer getIsComplete() {
        return this.isComplete;
    }

    public BusinessLicenseQuality setIsCompletePropobility(Double isCompletePropobility) {
        this.isCompletePropobility = isCompletePropobility;
        return this;
    }

    public Double getIsCompletePropobility() {
        return this.isCompletePropobility;
    }

    @Override
    public String toString() {
        return "BusinessLicenseQuality{" + "isClear=" + isClear + "\n" + "isClearPropobility=" + isClearPropobility + "\n" + "isComplete=" + isComplete + "\n"
                + "isCompletePropobility=" + isCompletePropobility + "\n" + "}";
    }

}