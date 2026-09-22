package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceDetectOcclusion {
    /**
     * 鼻子遮挡比例，[0-1]，1表示完全遮挡
     */
    private Double nose;

    /**
     * 嘴巴遮挡比例，[0-1]，1表示完全遮挡
     */
    private Double mouth;

    /**
     * 左眼遮挡比例，[0-1]，1表示完全遮挡
     */
    @JsonProperty("left_eye")
    private Double leftEye;

    /**
     * 右眼遮挡比例，[0-1]，1表示完全遮挡
     */
    @JsonProperty("right_eye")
    private Double rightEye;

    /**
     * 左脸颊遮挡比例，[0-1]，1表示完全遮挡
     */
    @JsonProperty("left_cheek")
    private Double leftCheek;

    /**
     * 右脸颊遮挡比例，[0-1]，1表示完全遮挡
     */
    @JsonProperty("right_cheek")
    private Double rightCheek;

    /**
     * 下巴遮挡比例，[0-1]，1表示完全遮挡
     */
    @JsonProperty("chin_contour")
    private Double chinContour;

    public FaceDetectOcclusion setNose(Double nose) {
        this.nose = nose;
        return this;
    }

    public Double getNose() {
        return this.nose;
    }

    public FaceDetectOcclusion setMouth(Double mouth) {
        this.mouth = mouth;
        return this;
    }

    public Double getMouth() {
        return this.mouth;
    }

    public FaceDetectOcclusion setLeftEye(Double leftEye) {
        this.leftEye = leftEye;
        return this;
    }

    public Double getLeftEye() {
        return this.leftEye;
    }

    public FaceDetectOcclusion setRightEye(Double rightEye) {
        this.rightEye = rightEye;
        return this;
    }

    public Double getRightEye() {
        return this.rightEye;
    }

    public FaceDetectOcclusion setLeftCheek(Double leftCheek) {
        this.leftCheek = leftCheek;
        return this;
    }

    public Double getLeftCheek() {
        return this.leftCheek;
    }

    public FaceDetectOcclusion setRightCheek(Double rightCheek) {
        this.rightCheek = rightCheek;
        return this;
    }

    public Double getRightCheek() {
        return this.rightCheek;
    }

    public FaceDetectOcclusion setChinContour(Double chinContour) {
        this.chinContour = chinContour;
        return this;
    }

    public Double getChinContour() {
        return this.chinContour;
    }

    @Override
    public String toString() {
        return "FaceDetectOcclusion{" + "nose=" + nose + "\n" + "mouth=" + mouth + "\n" + "leftEye=" + leftEye + "\n" + "rightEye=" + rightEye + "\n" + "leftCheek=" + leftCheek
                + "\n" + "rightCheek=" + rightCheek + "\n" + "chinContour=" + chinContour + "\n" + "}";
    }

}