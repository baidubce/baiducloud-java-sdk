package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ForgeryDetectionRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过10M，最短边至少512px，最长边最大8192px，支持jpg/jpeg/png/bmp格式
    */
    private String image;

    /**
    * 图片完整url，url长度不超过1024字节，url对应的图片base64编码后大小不超过10M，最短边至少512px，最长边最大8192px，支持jpg/jpeg/png/bmp格式。<br/>优先级：image > url，当image字段存在时，url字段失效。请注意关闭URL防盗链
    */
    private String url;

    /**
    * 是否返回图片篡改置信度，默认不返回，即：false。<br/>- true：返回图片篡改置信度；- false：不返回
    */
    @JsonProperty("detect_proportion")
    private Boolean detectProportion;

    /**
    * 图片篡改检出阈值，范围0.0001～1，默认为0.9887，对返回的detection_result字段生效，即：当图片篡改置信度≥检出阈值时，篡改检测结果返回'有篡改'，反之返回'无篡改'
    */
    @JsonProperty("detect_threshold")
    private Double detectThreshold;

    /**
    * 是否返回伪造区域热力图，默认不返回，即：false。<br/>- true：返回伪造区域热力图的 base64 编码；- false：不返回
    */
    @JsonProperty("return_heatmap")
    private Boolean returnHeatmap;

    /**
    * 返回伪造区域坐标的阈值，范围0.1～1，默认为0.8。<br/>- 当伪造区域坐标置信度分数≥阈值时，tampered_location返回符合阈值的坐标信息，反之不返回
    */
    @JsonProperty("restrict_probability")
    private Double restrictProbability;

    public String getImage() {
        return image;
    }

    public ForgeryDetectionRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public ForgeryDetectionRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public Boolean getDetectProportion() {
        return detectProportion;
    }

    public ForgeryDetectionRequest setDetectProportion(Boolean detectProportion) {
        this.detectProportion = detectProportion;
        return this;
    }

    public Double getDetectThreshold() {
        return detectThreshold;
    }

    public ForgeryDetectionRequest setDetectThreshold(Double detectThreshold) {
        this.detectThreshold = detectThreshold;
        return this;
    }

    public Boolean getReturnHeatmap() {
        return returnHeatmap;
    }

    public ForgeryDetectionRequest setReturnHeatmap(Boolean returnHeatmap) {
        this.returnHeatmap = returnHeatmap;
        return this;
    }

    public Double getRestrictProbability() {
        return restrictProbability;
    }

    public ForgeryDetectionRequest setRestrictProbability(Double restrictProbability) {
        this.restrictProbability = restrictProbability;
        return this;
    }

}
