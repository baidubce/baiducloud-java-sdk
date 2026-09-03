package com.baidubce.image.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IColorParams {
    /**
     * 阴影
     */
    private Double shadow;

    /**
     * 智能去薄雾
     */
    @JsonProperty("smart_remove_fog")
    private Double smartRemoveFog;

    /**
     * 色调
     */
    private Double tint;

    /**
     * 肤色优化
     */
    @JsonProperty("skin_color_refresh")
    private Integer skinColorRefresh;

    /**
     * AI 调色总开关，0 关闭，1 开启
     */
    @JsonProperty("ai_color")
    private Integer aiColor;

    /**
     * 智能曝光
     */
    @JsonProperty("smart_exposure")
    private Double smartExposure;

    /**
     * 饱和度
     */
    private Double saturation;

    /**
     * 高光
     */
    private Double highlight;

    /**
     * 背景增强
     */
    @JsonProperty("bg_enhance")
    private Double bgEnhance;

    /**
     * 白色
     */
    private Double white;

    /**
     * 细节数量
     */
    @JsonProperty("sharpen_amount")
    private Double sharpenAmount;

    /**
     * 色温
     */
    private Double temperature;

    /**
     * LUT 滤镜程度值
     */
    @JsonProperty("lut_value")
    private Double lutValue;

    /**
     * 智能白平衡
     */
    @JsonProperty("auto_whitebalance")
    private Double autoWhitebalance;

    /**
     * 细节半径
     */
    @JsonProperty("sharpen_radius")
    private Double sharpenRadius;

    /**
     * 黑色
     */
    private Double black;

    /**
     * HSL 参数数组
     */
    @JsonProperty("hsl_params")
    private List<HslParams> hslParams;

    /**
     * 智能曝光
     */
    @JsonProperty("auto_exposure")
    private Double autoExposure;

    /**
     * 亮度
     */
    private Double brightness;

    /**
     * 曝光
     */
    private Double exposure;

    /**
     * 对比度
     */
    private Double contrast;

    /**
     * 自然饱和度
     */
    private Double vibrance;

    /**
     * 智能白平衡
     */
    @JsonProperty("smart_whitebalance")
    private Double smartWhitebalance;

    /**
     * 去薄雾
     */
    @JsonProperty("remove_fog")
    private Double removeFog;

    /**
     * LUT 滤镜 ID
     */
    @JsonProperty("lut_id")
    private String lutId;

    public IColorParams setShadow(Double shadow) {
        this.shadow = shadow;
        return this;
    }

    public Double getShadow() {
        return this.shadow;
    }

    public IColorParams setSmartRemoveFog(Double smartRemoveFog) {
        this.smartRemoveFog = smartRemoveFog;
        return this;
    }

    public Double getSmartRemoveFog() {
        return this.smartRemoveFog;
    }

    public IColorParams setTint(Double tint) {
        this.tint = tint;
        return this;
    }

    public Double getTint() {
        return this.tint;
    }

    public IColorParams setSkinColorRefresh(Integer skinColorRefresh) {
        this.skinColorRefresh = skinColorRefresh;
        return this;
    }

    public Integer getSkinColorRefresh() {
        return this.skinColorRefresh;
    }

    public IColorParams setAiColor(Integer aiColor) {
        this.aiColor = aiColor;
        return this;
    }

    public Integer getAiColor() {
        return this.aiColor;
    }

    public IColorParams setSmartExposure(Double smartExposure) {
        this.smartExposure = smartExposure;
        return this;
    }

    public Double getSmartExposure() {
        return this.smartExposure;
    }

    public IColorParams setSaturation(Double saturation) {
        this.saturation = saturation;
        return this;
    }

    public Double getSaturation() {
        return this.saturation;
    }

    public IColorParams setHighlight(Double highlight) {
        this.highlight = highlight;
        return this;
    }

    public Double getHighlight() {
        return this.highlight;
    }

    public IColorParams setBgEnhance(Double bgEnhance) {
        this.bgEnhance = bgEnhance;
        return this;
    }

    public Double getBgEnhance() {
        return this.bgEnhance;
    }

    public IColorParams setWhite(Double white) {
        this.white = white;
        return this;
    }

    public Double getWhite() {
        return this.white;
    }

    public IColorParams setSharpenAmount(Double sharpenAmount) {
        this.sharpenAmount = sharpenAmount;
        return this;
    }

    public Double getSharpenAmount() {
        return this.sharpenAmount;
    }

    public IColorParams setTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }

    public Double getTemperature() {
        return this.temperature;
    }

    public IColorParams setLutValue(Double lutValue) {
        this.lutValue = lutValue;
        return this;
    }

    public Double getLutValue() {
        return this.lutValue;
    }

    public IColorParams setAutoWhitebalance(Double autoWhitebalance) {
        this.autoWhitebalance = autoWhitebalance;
        return this;
    }

    public Double getAutoWhitebalance() {
        return this.autoWhitebalance;
    }

    public IColorParams setSharpenRadius(Double sharpenRadius) {
        this.sharpenRadius = sharpenRadius;
        return this;
    }

    public Double getSharpenRadius() {
        return this.sharpenRadius;
    }

    public IColorParams setBlack(Double black) {
        this.black = black;
        return this;
    }

    public Double getBlack() {
        return this.black;
    }

    public IColorParams setHslParams(List<HslParams> hslParams) {
        this.hslParams = hslParams;
        return this;
    }

    public List<HslParams> getHslParams() {
        return this.hslParams;
    }

    public IColorParams setAutoExposure(Double autoExposure) {
        this.autoExposure = autoExposure;
        return this;
    }

    public Double getAutoExposure() {
        return this.autoExposure;
    }

    public IColorParams setBrightness(Double brightness) {
        this.brightness = brightness;
        return this;
    }

    public Double getBrightness() {
        return this.brightness;
    }

    public IColorParams setExposure(Double exposure) {
        this.exposure = exposure;
        return this;
    }

    public Double getExposure() {
        return this.exposure;
    }

    public IColorParams setContrast(Double contrast) {
        this.contrast = contrast;
        return this;
    }

    public Double getContrast() {
        return this.contrast;
    }

    public IColorParams setVibrance(Double vibrance) {
        this.vibrance = vibrance;
        return this;
    }

    public Double getVibrance() {
        return this.vibrance;
    }

    public IColorParams setSmartWhitebalance(Double smartWhitebalance) {
        this.smartWhitebalance = smartWhitebalance;
        return this;
    }

    public Double getSmartWhitebalance() {
        return this.smartWhitebalance;
    }

    public IColorParams setRemoveFog(Double removeFog) {
        this.removeFog = removeFog;
        return this;
    }

    public Double getRemoveFog() {
        return this.removeFog;
    }

    public IColorParams setLutId(String lutId) {
        this.lutId = lutId;
        return this;
    }

    public String getLutId() {
        return this.lutId;
    }

    @Override
    public String toString() {
        return "IColorParams{" + "shadow=" + shadow + "\n" + "smartRemoveFog=" + smartRemoveFog + "\n" + "tint=" + tint + "\n" + "skinColorRefresh=" + skinColorRefresh + "\n"
                + "aiColor=" + aiColor + "\n" + "smartExposure=" + smartExposure + "\n" + "saturation=" + saturation + "\n" + "highlight=" + highlight + "\n" + "bgEnhance="
                + bgEnhance + "\n" + "white=" + white + "\n" + "sharpenAmount=" + sharpenAmount + "\n" + "temperature=" + temperature + "\n" + "lutValue=" + lutValue + "\n"
                + "autoWhitebalance=" + autoWhitebalance + "\n" + "sharpenRadius=" + sharpenRadius + "\n" + "black=" + black + "\n" + "hslParams=" + hslParams + "\n"
                + "autoExposure=" + autoExposure + "\n" + "brightness=" + brightness + "\n" + "exposure=" + exposure + "\n" + "contrast=" + contrast + "\n" + "vibrance="
                + vibrance + "\n" + "smartWhitebalance=" + smartWhitebalance + "\n" + "removeFog=" + removeFog + "\n" + "lutId=" + lutId + "\n" + "}";
    }

}