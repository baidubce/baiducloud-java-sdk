package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiIdcardRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式，当image字段存在时url字段失效。请注意关闭URL防盗链
    */
    private String url;

    /**
    * 是否开启身份证风险类型(身份证复印件/扫描件、临时身份证、身份证翻拍、修改过的身份证)功能，默认不开启，即：false。<div/>- true：开启，请查看返回参数risk_type <div/>- false：不开启
    */
    @JsonProperty("detect_risk")
    private Boolean detectRisk;

    /**
    * 是否开启身份证质量类型(边框/四角不完整、头像或关键字段被遮挡/马赛克)检测功能，默认不开启，即：false。<div/>- true：开启，请查看返回参数card_quality <div/>- false：不开启
    */
    @JsonProperty("detect_quality")
    private Boolean detectQuality;

    /**
    * 是否检测头像内容，默认不检测，即：false。<div/>- true：检测头像并返回头像的 base64 编码及位置信息 <div/>- false：不检测
    */
    @JsonProperty("detect_photo")
    private Boolean detectPhoto;

    /**
    * 是否检测身份证进行裁剪，默认不检测，默认不检测，即：false。<div/>- true：检测身份证并返回证照的 base64 编码及位置信息 <div/>- false：不检测
    */
    @JsonProperty("detect_card")
    private Boolean detectCard;

    /**
    * 是否细分输出截屏风险类型，当 detect_risk =true 时，该参数才生效。默认不开启，即：false。<div/>- true：开启，risk_type 将细分输出 screenshot 截屏类型 <div/>- false：不开启，risk_type 将合并 screenshot 截屏到 screen 翻拍类型输出
    */
    @JsonProperty("detect_screenshot")
    private Boolean detectScreenshot;

    public String getImage() {
        return image;
    }

    public MultiIdcardRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public MultiIdcardRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public Boolean getDetectRisk() {
        return detectRisk;
    }

    public MultiIdcardRequest setDetectRisk(Boolean detectRisk) {
        this.detectRisk = detectRisk;
        return this;
    }

    public Boolean getDetectQuality() {
        return detectQuality;
    }

    public MultiIdcardRequest setDetectQuality(Boolean detectQuality) {
        this.detectQuality = detectQuality;
        return this;
    }

    public Boolean getDetectPhoto() {
        return detectPhoto;
    }

    public MultiIdcardRequest setDetectPhoto(Boolean detectPhoto) {
        this.detectPhoto = detectPhoto;
        return this;
    }

    public Boolean getDetectCard() {
        return detectCard;
    }

    public MultiIdcardRequest setDetectCard(Boolean detectCard) {
        this.detectCard = detectCard;
        return this;
    }

    public Boolean getDetectScreenshot() {
        return detectScreenshot;
    }

    public MultiIdcardRequest setDetectScreenshot(Boolean detectScreenshot) {
        this.detectScreenshot = detectScreenshot;
        return this;
    }

}
