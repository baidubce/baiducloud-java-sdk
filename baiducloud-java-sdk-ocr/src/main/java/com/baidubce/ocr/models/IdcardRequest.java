package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IdcardRequest extends BaseBceRequest {

    /**
    * 自动检测身份证正反面，如果传参指定方向与图片相反，支持正常识别，返回参数image_status字段为\"reversed_side\" <div/>-front：身份证含照片的一面 <br/>-back：身份证带国徽的一面
    */
    @JsonProperty("id_card_side")
    private String idCardSide;

    /**
    * 图像数据，base64编码后进行urlencode，需去掉编码头（data:image/jpeg;base64, ）<br/>要求base64编码和urlencode后大小不超过8M，最短边至少15px，最长边最大8192px，支持jpg/jpeg/png/bmp格式
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过8M，最短边至少15px，最长边最大8192px，支持jpg/jpeg/png/bmp格式，当image字段存在时url字段失效 <br/>请注意关闭URL防盗链
    */
    private String url;

    /**
    * 是否检测PS，默认不检测，即：false <div/>- true：检测 <br/>- false：不检测
    */
    @JsonProperty("detect_ps")
    private Boolean detectPs;

    /**
    * 是否开启身份证风险类型（身份证复印件/扫描件、临时身份证、身份证翻拍/截屏、修改过的身份证）检测功能，默认不开启，即：false。<div/>- true：开启，请查看返回参数risk_type <br/>- false：不开启
    */
    @JsonProperty("detect_risk")
    private Boolean detectRisk;

    /**
    * 是否开启身份证质量类型（清晰模糊、边框/四角不完整、头像或关键字段被遮挡/马赛克）检测功能，默认不开启，即：false。<div/>- true：开启，请查看返回参数card_quality <br/>- false：不开启
    */
    @JsonProperty("detect_quality")
    private Boolean detectQuality;

    /**
    * 是否检测头像内容，默认不检测，即：false。<div/>- true：检测头像并返回头像的 base64 编码及位置信息 <br/>- false：不检测
    */
    @JsonProperty("detect_photo")
    private Boolean detectPhoto;

    /**
    * 是否检测身份证进行裁剪，默认不检测，即：false。<div/>- true：检测身份证并返回证照的 base64 编码及位置信息；<br/>- false：不检测
    */
    @JsonProperty("detect_card")
    private Boolean detectCard;

    /**
    * 是否检测身份证图片方向，默认不检测，即：false。<div/>- true：检测 <br/>- false：不检测
    */
    @JsonProperty("detect_direction")
    private Boolean detectDirection;

    /**
    * 是否细分输出截屏风险类型，当 detect_risk =ture 时，该参数才生效。默认不开启，即：false。- true：开启，将在 risk_type 细分输出 screenshot 截屏类型 <br/>- false：不开启，risk_type 将合并 screenshot 截屏到 screen 翻拍类型输出
    */
    @JsonProperty("detect_screenshot")
    private Boolean detectScreenshot;

    public String getIdCardSide() {
        return idCardSide;
    }

    public IdcardRequest setIdCardSide(String idCardSide) {
        this.idCardSide = idCardSide;
        return this;
    }

    public String getImage() {
        return image;
    }

    public IdcardRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public IdcardRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public Boolean getDetectPs() {
        return detectPs;
    }

    public IdcardRequest setDetectPs(Boolean detectPs) {
        this.detectPs = detectPs;
        return this;
    }

    public Boolean getDetectRisk() {
        return detectRisk;
    }

    public IdcardRequest setDetectRisk(Boolean detectRisk) {
        this.detectRisk = detectRisk;
        return this;
    }

    public Boolean getDetectQuality() {
        return detectQuality;
    }

    public IdcardRequest setDetectQuality(Boolean detectQuality) {
        this.detectQuality = detectQuality;
        return this;
    }

    public Boolean getDetectPhoto() {
        return detectPhoto;
    }

    public IdcardRequest setDetectPhoto(Boolean detectPhoto) {
        this.detectPhoto = detectPhoto;
        return this;
    }

    public Boolean getDetectCard() {
        return detectCard;
    }

    public IdcardRequest setDetectCard(Boolean detectCard) {
        this.detectCard = detectCard;
        return this;
    }

    public Boolean getDetectDirection() {
        return detectDirection;
    }

    public IdcardRequest setDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
        return this;
    }

    public Boolean getDetectScreenshot() {
        return detectScreenshot;
    }

    public IdcardRequest setDetectScreenshot(Boolean detectScreenshot) {
        this.detectScreenshot = detectScreenshot;
        return this;
    }

}
