package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessLicenseRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求两者大小均不超过10M，最短边至少15px，最长边最大8192px，支持jpg/jpeg/png/bmp格式
    */
    private String image;

    /**
    * 图片完整URL，长度不超过1024字节，URL对应的图片base64编码和urlencode后大小不超过10M，最短边至少15px，最长边最大8192px，支持jpg/jpeg/png/bmp格式。 当image字段存在时url字段失效，请注意关闭URL防盗链
    */
    private String url;

    /**
    * 识别精度
    */
    private String accuracy;

    /**
    * 是否开启风险类型功能，默认不开启。 - false：不开启 - true：开启
    */
    @JsonProperty("risk_warn")
    private Boolean riskWarn;

    /**
    * 是否开启质量类型（清晰模糊、边框/四角不完整）检测功能，默认不开启。 - false：不开启  - true：开启，结果请查看返回参数card_quality
    */
    @JsonProperty("detect_quality")
    private Boolean detectQuality;

    /**
    * 是否开启全角符号转换，默认不开启。 - false：不开启，单位名称、类型、经营范围字段内括号以半角输出 - true：开启，单位名称、类型、经营范围字段内括号以全角输出
    */
    @JsonProperty("fullwidth_shift")
    private Boolean fullwidthShift;

    public String getImage() {
        return image;
    }

    public BusinessLicenseRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public BusinessLicenseRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public BusinessLicenseRequest setAccuracy(String accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    public Boolean getRiskWarn() {
        return riskWarn;
    }

    public BusinessLicenseRequest setRiskWarn(Boolean riskWarn) {
        this.riskWarn = riskWarn;
        return this;
    }

    public Boolean getDetectQuality() {
        return detectQuality;
    }

    public BusinessLicenseRequest setDetectQuality(Boolean detectQuality) {
        this.detectQuality = detectQuality;
        return this;
    }

    public Boolean getFullwidthShift() {
        return fullwidthShift;
    }

    public BusinessLicenseRequest setFullwidthShift(Boolean fullwidthShift) {
        this.fullwidthShift = fullwidthShift;
        return this;
    }

}
