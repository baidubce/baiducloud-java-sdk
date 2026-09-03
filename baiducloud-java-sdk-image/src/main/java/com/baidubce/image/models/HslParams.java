package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HslParams {
    /**
     * 
     */
    @JsonProperty("hsl_brightness")
    private Double hslBrightness;

    /**
     * 
     */
    @JsonProperty("hsl_saturation")
    private Double hslSaturation;

    /**
     * 色域选择：0-红、1-橙、2-黄、3-绿、4-青、5-蓝、6-紫、7-洋红
     */
    @JsonProperty("hsl_gamut")
    private Integer hslGamut;

    /**
     * 
     */
    @JsonProperty("hsl_hue")
    private Double hslHue;

    public HslParams setHslBrightness(Double hslBrightness) {
        this.hslBrightness = hslBrightness;
        return this;
    }

    public Double getHslBrightness() {
        return this.hslBrightness;
    }

    public HslParams setHslSaturation(Double hslSaturation) {
        this.hslSaturation = hslSaturation;
        return this;
    }

    public Double getHslSaturation() {
        return this.hslSaturation;
    }

    public HslParams setHslGamut(Integer hslGamut) {
        this.hslGamut = hslGamut;
        return this;
    }

    public Integer getHslGamut() {
        return this.hslGamut;
    }

    public HslParams setHslHue(Double hslHue) {
        this.hslHue = hslHue;
        return this;
    }

    public Double getHslHue() {
        return this.hslHue;
    }

    @Override
    public String toString() {
        return "HslParams{" + "hslBrightness=" + hslBrightness + "\n" + "hslSaturation=" + hslSaturation + "\n" + "hslGamut=" + hslGamut + "\n" + "hslHue=" + hslHue + "\n" + "}";
    }

}