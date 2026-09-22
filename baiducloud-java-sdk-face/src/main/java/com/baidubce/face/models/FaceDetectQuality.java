package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceDetectQuality {
    /**
     * occlusion
     */
    private FaceDetectOcclusion occlusion;

    /**
     * 人脸模糊程度，[0~1]，0清晰，1模糊
     */
    private Double blur;

    /**
     * 脸部光照程度，[0~255]，越大光照越好
     */
    private Double illumination;

    /**
     * 人脸完整度，0-溢出图像边界，1-在边界内
     */
    private Long completeness;

    public FaceDetectQuality setOcclusion(FaceDetectOcclusion occlusion) {
        this.occlusion = occlusion;
        return this;
    }

    public FaceDetectOcclusion getOcclusion() {
        return this.occlusion;
    }

    public FaceDetectQuality setBlur(Double blur) {
        this.blur = blur;
        return this;
    }

    public Double getBlur() {
        return this.blur;
    }

    public FaceDetectQuality setIllumination(Double illumination) {
        this.illumination = illumination;
        return this;
    }

    public Double getIllumination() {
        return this.illumination;
    }

    public FaceDetectQuality setCompleteness(Long completeness) {
        this.completeness = completeness;
        return this;
    }

    public Long getCompleteness() {
        return this.completeness;
    }

    @Override
    public String toString() {
        return "FaceDetectQuality{" + "occlusion=" + occlusion + "\n" + "blur=" + blur + "\n" + "illumination=" + illumination + "\n" + "completeness=" + completeness + "\n"
                + "}";
    }

}