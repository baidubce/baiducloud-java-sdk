package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IdCardQuality {
    /**
     * 是否清晰：0-不清晰，1-清晰
     */
    @JsonProperty("IsClear")
    private Integer isClear;

    /**
     * 清晰概率，值在0-1之间，值越大表示图像质量越好
     */
    @JsonProperty("IsClear_propobility")
    private Double isClearPropobility;

    /**
     * 是否边框/四角完整：0-不完整，1-完整
     */
    @JsonProperty("IsComplete")
    private Integer isComplete;

    /**
     * 边框/四角完整概率，值在0-1之间，值越大表示图像质量越好
     */
    @JsonProperty("IsComplete_propobility")
    private Double isCompletePropobility;

    /**
     * 是否头像、关键字段无遮挡/马赛克：0-有遮挡，1-无遮挡
     */
    @JsonProperty("IsNoCover")
    private Integer isNoCover;

    /**
     * 无遮挡概率，值在0-1之间，值越大表示图像质量越好
     */
    @JsonProperty("IsNoCover_propobility")
    private Double isNoCoverPropobility;

    public IdCardQuality setIsClear(Integer isClear) {
        this.isClear = isClear;
        return this;
    }

    public Integer getIsClear() {
        return this.isClear;
    }

    public IdCardQuality setIsClearPropobility(Double isClearPropobility) {
        this.isClearPropobility = isClearPropobility;
        return this;
    }

    public Double getIsClearPropobility() {
        return this.isClearPropobility;
    }

    public IdCardQuality setIsComplete(Integer isComplete) {
        this.isComplete = isComplete;
        return this;
    }

    public Integer getIsComplete() {
        return this.isComplete;
    }

    public IdCardQuality setIsCompletePropobility(Double isCompletePropobility) {
        this.isCompletePropobility = isCompletePropobility;
        return this;
    }

    public Double getIsCompletePropobility() {
        return this.isCompletePropobility;
    }

    public IdCardQuality setIsNoCover(Integer isNoCover) {
        this.isNoCover = isNoCover;
        return this;
    }

    public Integer getIsNoCover() {
        return this.isNoCover;
    }

    public IdCardQuality setIsNoCoverPropobility(Double isNoCoverPropobility) {
        this.isNoCoverPropobility = isNoCoverPropobility;
        return this;
    }

    public Double getIsNoCoverPropobility() {
        return this.isNoCoverPropobility;
    }

    @Override
    public String toString() {
        return "IdCardQuality{" + "isClear=" + isClear + "\n" + "isClearPropobility=" + isClearPropobility + "\n" + "isComplete=" + isComplete + "\n" + "isCompletePropobility="
                + isCompletePropobility + "\n" + "isNoCover=" + isNoCover + "\n" + "isNoCoverPropobility=" + isNoCoverPropobility + "\n" + "}";
    }

}