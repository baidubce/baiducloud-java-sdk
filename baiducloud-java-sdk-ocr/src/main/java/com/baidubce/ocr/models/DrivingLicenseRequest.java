package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DrivingLicenseRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式，当image字段存在时url字段失效，请注意关闭URL防盗链
    */
    private String url;

    /**
    * 是否检测朝向。<div/>- false：默认值，不检测朝向，朝向是指输入图像是正常方向、逆时针旋转90/180/270度 <br/>- true：检测朝向
    */
    @JsonProperty("detect_direction")
    private Boolean detectDirection;

    /**
    * 驾驶证正/副页识别。<div/>- front：默认值，识别驾驶证正页、电子驾驶证正页<br/>- back：识别驾驶证副页
    */
    @JsonProperty("driving_license_side")
    private String drivingLicenseSide;

    /**
    * 是否归一化格式输出。<div/>- false：默认值，不进行归一化处理<br/>- true：归一化格式输出，将驾驶证正页的「有效起始日期」+「有效期限」及「有效期限」+「至」，归一化为「有效起始日期」+「失效日期」格式输出
    */
    @JsonProperty("unified_valid_period")
    private Boolean unifiedValidPeriod;

    /**
    * 是否开启质量检测功能，仅在驾驶证正页识别时生效。<div/>- false：默认值，不输出质量告警信息<br/>- true：在warn_infos输出驾驶证遮挡、不完整、模糊质量告警信息，同时可在quality_propobility输出质量检测置信度信息
    */
    @JsonProperty("quality_warn")
    private Boolean qualityWarn;

    /**
    * 是否开启风险检测功能，仅在驾驶证正页识别时生效。<div/>- false：默认值，不输出风险告警信息<br/>- true：开启，输出驾驶证复印、翻拍、PS等告警信息
    */
    @JsonProperty("risk_warn")
    private Boolean riskWarn;

    public String getImage() {
        return image;
    }

    public DrivingLicenseRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public DrivingLicenseRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public Boolean getDetectDirection() {
        return detectDirection;
    }

    public DrivingLicenseRequest setDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
        return this;
    }

    public String getDrivingLicenseSide() {
        return drivingLicenseSide;
    }

    public DrivingLicenseRequest setDrivingLicenseSide(String drivingLicenseSide) {
        this.drivingLicenseSide = drivingLicenseSide;
        return this;
    }

    public Boolean getUnifiedValidPeriod() {
        return unifiedValidPeriod;
    }

    public DrivingLicenseRequest setUnifiedValidPeriod(Boolean unifiedValidPeriod) {
        this.unifiedValidPeriod = unifiedValidPeriod;
        return this;
    }

    public Boolean getQualityWarn() {
        return qualityWarn;
    }

    public DrivingLicenseRequest setQualityWarn(Boolean qualityWarn) {
        this.qualityWarn = qualityWarn;
        return this;
    }

    public Boolean getRiskWarn() {
        return riskWarn;
    }

    public DrivingLicenseRequest setRiskWarn(Boolean riskWarn) {
        this.riskWarn = riskWarn;
        return this;
    }

}
