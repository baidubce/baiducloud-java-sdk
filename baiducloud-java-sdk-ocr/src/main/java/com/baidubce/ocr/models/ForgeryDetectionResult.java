package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ForgeryDetectionResult {
    /**
     * 篡改检测结果
     */
    @JsonProperty("detection_result")
    private String detectionResult;

    /**
     * 图片篡改置信度（当请求参数 detect_proportion = true 时返回）
     */
    @JsonProperty("tampered_proportion")
    private Float tamperedProportion;

    /**
     * 伪造区域的坐标信息（当 probability ≥ restrict_probability 阈值时返回坐标信息）
     */
    @JsonProperty("tampered_location")
    private List<TamperedLocation> tamperedLocation;

    /**
     * 篡改区域热力图（当请求参数 return_heatmap = true 时返回）
     */
    private String heatmap;

    public ForgeryDetectionResult setDetectionResult(String detectionResult) {
        this.detectionResult = detectionResult;
        return this;
    }

    public String getDetectionResult() {
        return this.detectionResult;
    }

    public ForgeryDetectionResult setTamperedProportion(Float tamperedProportion) {
        this.tamperedProportion = tamperedProportion;
        return this;
    }

    public Float getTamperedProportion() {
        return this.tamperedProportion;
    }

    public ForgeryDetectionResult setTamperedLocation(List<TamperedLocation> tamperedLocation) {
        this.tamperedLocation = tamperedLocation;
        return this;
    }

    public List<TamperedLocation> getTamperedLocation() {
        return this.tamperedLocation;
    }

    public ForgeryDetectionResult setHeatmap(String heatmap) {
        this.heatmap = heatmap;
        return this;
    }

    public String getHeatmap() {
        return this.heatmap;
    }

    @Override
    public String toString() {
        return "ForgeryDetectionResult{" + "detectionResult=" + detectionResult + "\n" + "tamperedProportion=" + tamperedProportion + "\n" + "tamperedLocation=" + tamperedLocation
                + "\n" + "heatmap=" + heatmap + "\n" + "}";
    }

}