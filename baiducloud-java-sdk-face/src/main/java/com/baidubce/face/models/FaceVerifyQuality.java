package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceVerifyQuality {
    /**
     * occlusion
     */
    private FaceVerifyOcclusion occlusion;

    /**
     * 人脸模糊程度，范围[0~1]，0表示清晰，1表示模糊
     */
    private Double blur;

    /**
     * 取值范围在[0~255]，表示脸部区域的光照程度，越大表示光照越好
     */
    private Double illumination;

    /**
     * 人脸完整度，0或1，0为人脸溢出图像边界，1为人脸都在图像边界内
     */
    private Long completeness;

    public FaceVerifyQuality setOcclusion(FaceVerifyOcclusion occlusion) {
        this.occlusion = occlusion;
        return this;
    }

    public FaceVerifyOcclusion getOcclusion() {
        return this.occlusion;
    }

    public FaceVerifyQuality setBlur(Double blur) {
        this.blur = blur;
        return this;
    }

    public Double getBlur() {
        return this.blur;
    }

    public FaceVerifyQuality setIllumination(Double illumination) {
        this.illumination = illumination;
        return this;
    }

    public Double getIllumination() {
        return this.illumination;
    }

    public FaceVerifyQuality setCompleteness(Long completeness) {
        this.completeness = completeness;
        return this;
    }

    public Long getCompleteness() {
        return this.completeness;
    }

    @Override
    public String toString() {
        return "FaceVerifyQuality{" + "occlusion=" + occlusion + "\n" + "blur=" + blur + "\n" + "illumination=" + illumination + "\n" + "completeness=" + completeness + "\n"
                + "}";
    }

}