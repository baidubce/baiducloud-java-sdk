package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleLicenseRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式，当image字段存在时url字段失效
    */
    private String url;

    /**
    * 是否进行图像方向自动矫正 <div/>- false：默认值，不进行图像方向自动矫正 <br/>- true：开启图像方向自动矫正功能，可对旋转90/180/270度的图片进行自动矫正并识别
    */
    @JsonProperty("detect_direction")
    private Boolean detectDirection;

    /**
    * 行驶证正/副页识别 <div/>- front：默认值，识别行驶证主页、电子行驶证主页 <br/>- back：识别行驶证副页、电子行驶证副页
    */
    @JsonProperty("vehicle_license_side")
    private String vehicleLicenseSide;

    /**
    * 是否进行归一化处理 <div/> - false：默认值，不进行归一化处理 <br/>- true：对输出字段进行归一化处理，将新/老版行驶证的\"注册登记日期/注册日期\"统一为\"注册日期\"进行输出
    */
    private Boolean unified;

    /**
    * 是否开启质量检测功能，仅在行驶证正页识别时生效 <div/>- false：默认值，不输出质量告警信息 <br/>- true：在warn_infos输出行驶证遮挡、不完整、模糊质量告警信息
    */
    @JsonProperty("quality_warn")
    private Boolean qualityWarn;

    /**
    * 是否开启风险检测功能，仅在行驶证正页识别时生效 <div/>- false：默认值，不输出风险告警信息 <br/>- true：开启，输出行驶证复印、翻拍、PS等告警信息
    */
    @JsonProperty("risk_warn")
    private Boolean riskWarn;

    public String getImage() {
        return image;
    }

    public VehicleLicenseRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public VehicleLicenseRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public Boolean getDetectDirection() {
        return detectDirection;
    }

    public VehicleLicenseRequest setDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
        return this;
    }

    public String getVehicleLicenseSide() {
        return vehicleLicenseSide;
    }

    public VehicleLicenseRequest setVehicleLicenseSide(String vehicleLicenseSide) {
        this.vehicleLicenseSide = vehicleLicenseSide;
        return this;
    }

    public Boolean getUnified() {
        return unified;
    }

    public VehicleLicenseRequest setUnified(Boolean unified) {
        this.unified = unified;
        return this;
    }

    public Boolean getQualityWarn() {
        return qualityWarn;
    }

    public VehicleLicenseRequest setQualityWarn(Boolean qualityWarn) {
        this.qualityWarn = qualityWarn;
        return this;
    }

    public Boolean getRiskWarn() {
        return riskWarn;
    }

    public VehicleLicenseRequest setRiskWarn(Boolean riskWarn) {
        this.riskWarn = riskWarn;
        return this;
    }

}
