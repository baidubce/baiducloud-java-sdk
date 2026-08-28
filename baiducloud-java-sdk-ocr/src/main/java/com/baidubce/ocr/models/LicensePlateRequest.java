package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LicensePlateRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过8M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过8M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式，当image字段存在时url字段失效
    */
    private String url;

    /**
    * 是否检测多张车牌 <div/>- false：默认值，仅检测最清晰的车牌 <br/>- true：检测多张车牌
    */
    @JsonProperty("multi_detect")
    private Boolean multiDetect;

    /**
    * 在高拍等车牌较小的场景下可开启 <div/>- false：默认值；<br/>- true：能够提高对较小车牌的检测和识别（提示：当前新版车牌识别能力无需开启此参数，此参数已无效，即将下线）
    */
    @JsonProperty("multi_scale")
    private Boolean multiScale;

    /**
    * 是否开启车牌遮挡检测功能 <div/> - false：默认值,不开启 <br/>- true：开启遮挡检测
    */
    @JsonProperty("detect_complete")
    private Boolean detectComplete;

    /**
    * 是否开启车牌PS检测功能 <div/>- false：默认值，不开启 <br/>- true：开启PS检测
    */
    @JsonProperty("detect_risk")
    private Boolean detectRisk;

    public String getImage() {
        return image;
    }

    public LicensePlateRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public LicensePlateRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public Boolean getMultiDetect() {
        return multiDetect;
    }

    public LicensePlateRequest setMultiDetect(Boolean multiDetect) {
        this.multiDetect = multiDetect;
        return this;
    }

    public Boolean getMultiScale() {
        return multiScale;
    }

    public LicensePlateRequest setMultiScale(Boolean multiScale) {
        this.multiScale = multiScale;
        return this;
    }

    public Boolean getDetectComplete() {
        return detectComplete;
    }

    public LicensePlateRequest setDetectComplete(Boolean detectComplete) {
        this.detectComplete = detectComplete;
        return this;
    }

    public Boolean getDetectRisk() {
        return detectRisk;
    }

    public LicensePlateRequest setDetectRisk(Boolean detectRisk) {
        this.detectRisk = detectRisk;
        return this;
    }

}
