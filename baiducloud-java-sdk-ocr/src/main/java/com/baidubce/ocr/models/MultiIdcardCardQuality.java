package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiIdcardCardQuality {
    /**
     * 是否清晰
     */
    @JsonProperty("IsClear")
    private Integer isClear;

    /**
     * 是否边框/四角完整
     */
    @JsonProperty("IsComplete")
    private Integer isComplete;

    /**
     * 是否头像、关键字段无遮挡/马赛克
     */
    @JsonProperty("IsNoCover")
    private Integer isNoCover;

    /**
     * 是否清晰的概率，值在0-1之间，值越大表示图像质量越好
     */
    @JsonProperty("IsClear_propobility")
    private Float isClearPropobility;

    /**
     * 是否边框/四角完整的概率，值在0-1之间，值越大表示图像质量越好
     */
    @JsonProperty("IsComplete_propobility")
    private Float isCompletePropobility;

    /**
     * 是否头像、关键字段无遮挡/马赛克的概率，值在0-1之间，值越大表示图像质量越好
     */
    @JsonProperty("IsNoCover_propobility")
    private Float isNoCoverPropobility;

    public MultiIdcardCardQuality setIsClear(Integer isClear) {
        this.isClear = isClear;
        return this;
    }

    public Integer getIsClear() {
        return this.isClear;
    }

    public MultiIdcardCardQuality setIsComplete(Integer isComplete) {
        this.isComplete = isComplete;
        return this;
    }

    public Integer getIsComplete() {
        return this.isComplete;
    }

    public MultiIdcardCardQuality setIsNoCover(Integer isNoCover) {
        this.isNoCover = isNoCover;
        return this;
    }

    public Integer getIsNoCover() {
        return this.isNoCover;
    }

    public MultiIdcardCardQuality setIsClearPropobility(Float isClearPropobility) {
        this.isClearPropobility = isClearPropobility;
        return this;
    }

    public Float getIsClearPropobility() {
        return this.isClearPropobility;
    }

    public MultiIdcardCardQuality setIsCompletePropobility(Float isCompletePropobility) {
        this.isCompletePropobility = isCompletePropobility;
        return this;
    }

    public Float getIsCompletePropobility() {
        return this.isCompletePropobility;
    }

    public MultiIdcardCardQuality setIsNoCoverPropobility(Float isNoCoverPropobility) {
        this.isNoCoverPropobility = isNoCoverPropobility;
        return this;
    }

    public Float getIsNoCoverPropobility() {
        return this.isNoCoverPropobility;
    }

    @Override
    public String toString() {
        return "MultiIdcardCardQuality{" + "isClear=" + isClear + "\n" + "isComplete=" + isComplete + "\n" + "isNoCover=" + isNoCover + "\n" + "isClearPropobility="
                + isClearPropobility + "\n" + "isCompletePropobility=" + isCompletePropobility + "\n" + "isNoCoverPropobility=" + isNoCoverPropobility + "\n" + "}";
    }

}