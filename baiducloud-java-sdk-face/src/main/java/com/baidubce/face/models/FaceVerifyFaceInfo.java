package com.baidubce.face.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceVerifyFaceInfo {
    /**
     * 人脸图片的唯一标识
     */
    @JsonProperty("face_token")
    private String faceToken;

    /**
     * location
     */
    private FaceVerifyLocation location;

    /**
     * 人脸置信度，范围【0~1】，代表这是一张人脸的概率，0最小、1最大
     */
    @JsonProperty("face_probability")
    private Double faceProbability;

    /**
     * angle
     */
    private FaceVerifyAngle angle;

    /**
     * 年龄，当face_field包含age时返回
     */
    private Double age;

    /**
     * expression
     */
    private FaceVerifyTypeProbability expression;

    /**
     * faceShape
     */
    @JsonProperty("face_shape")
    private FaceVerifyTypeProbability faceShape;

    /**
     * gender
     */
    private FaceVerifyTypeProbability gender;

    /**
     * glasses
     */
    private FaceVerifyTypeProbability glasses;

    /**
     * faceType
     */
    @JsonProperty("face_type")
    private FaceVerifyTypeProbability faceType;

    /**
     * 4个关键点位置，左眼中心、右眼中心、鼻尖、嘴中心。face_field包含landmark时返回
     */
    private List<FaceVerifyPoint> landmark;

    /**
     * 72个特征点位置，face_field包含landmark时返回
     */
    private List<FaceVerifyPoint> landmark72;

    /**
     * quality
     */
    private FaceVerifyQuality quality;

    /**
     * liveness
     */
    private FaceVerifyLiveness liveness;

    /**
     * 美丑打分，范围[0~100]，越大表示越美，face_field包含beauty时返回
     */
    private Double beauty;

    /**
     * 判断图片是合成图的概率，face_field包含spoofing时返回
     */
    private Double spoofing;

    /**
     * 判断图片不是合成图的概率
     */
    @JsonProperty("not_spoofing")
    private Double notSpoofing;

    public FaceVerifyFaceInfo setFaceToken(String faceToken) {
        this.faceToken = faceToken;
        return this;
    }

    public String getFaceToken() {
        return this.faceToken;
    }

    public FaceVerifyFaceInfo setLocation(FaceVerifyLocation location) {
        this.location = location;
        return this;
    }

    public FaceVerifyLocation getLocation() {
        return this.location;
    }

    public FaceVerifyFaceInfo setFaceProbability(Double faceProbability) {
        this.faceProbability = faceProbability;
        return this;
    }

    public Double getFaceProbability() {
        return this.faceProbability;
    }

    public FaceVerifyFaceInfo setAngle(FaceVerifyAngle angle) {
        this.angle = angle;
        return this;
    }

    public FaceVerifyAngle getAngle() {
        return this.angle;
    }

    public FaceVerifyFaceInfo setAge(Double age) {
        this.age = age;
        return this;
    }

    public Double getAge() {
        return this.age;
    }

    public FaceVerifyFaceInfo setExpression(FaceVerifyTypeProbability expression) {
        this.expression = expression;
        return this;
    }

    public FaceVerifyTypeProbability getExpression() {
        return this.expression;
    }

    public FaceVerifyFaceInfo setFaceShape(FaceVerifyTypeProbability faceShape) {
        this.faceShape = faceShape;
        return this;
    }

    public FaceVerifyTypeProbability getFaceShape() {
        return this.faceShape;
    }

    public FaceVerifyFaceInfo setGender(FaceVerifyTypeProbability gender) {
        this.gender = gender;
        return this;
    }

    public FaceVerifyTypeProbability getGender() {
        return this.gender;
    }

    public FaceVerifyFaceInfo setGlasses(FaceVerifyTypeProbability glasses) {
        this.glasses = glasses;
        return this;
    }

    public FaceVerifyTypeProbability getGlasses() {
        return this.glasses;
    }

    public FaceVerifyFaceInfo setFaceType(FaceVerifyTypeProbability faceType) {
        this.faceType = faceType;
        return this;
    }

    public FaceVerifyTypeProbability getFaceType() {
        return this.faceType;
    }

    public FaceVerifyFaceInfo setLandmark(List<FaceVerifyPoint> landmark) {
        this.landmark = landmark;
        return this;
    }

    public List<FaceVerifyPoint> getLandmark() {
        return this.landmark;
    }

    public FaceVerifyFaceInfo setLandmark72(List<FaceVerifyPoint> landmark72) {
        this.landmark72 = landmark72;
        return this;
    }

    public List<FaceVerifyPoint> getLandmark72() {
        return this.landmark72;
    }

    public FaceVerifyFaceInfo setQuality(FaceVerifyQuality quality) {
        this.quality = quality;
        return this;
    }

    public FaceVerifyQuality getQuality() {
        return this.quality;
    }

    public FaceVerifyFaceInfo setLiveness(FaceVerifyLiveness liveness) {
        this.liveness = liveness;
        return this;
    }

    public FaceVerifyLiveness getLiveness() {
        return this.liveness;
    }

    public FaceVerifyFaceInfo setBeauty(Double beauty) {
        this.beauty = beauty;
        return this;
    }

    public Double getBeauty() {
        return this.beauty;
    }

    public FaceVerifyFaceInfo setSpoofing(Double spoofing) {
        this.spoofing = spoofing;
        return this;
    }

    public Double getSpoofing() {
        return this.spoofing;
    }

    public FaceVerifyFaceInfo setNotSpoofing(Double notSpoofing) {
        this.notSpoofing = notSpoofing;
        return this;
    }

    public Double getNotSpoofing() {
        return this.notSpoofing;
    }

    @Override
    public String toString() {
        return "FaceVerifyFaceInfo{" + "faceToken=" + faceToken + "\n" + "location=" + location + "\n" + "faceProbability=" + faceProbability + "\n" + "angle=" + angle + "\n"
                + "age=" + age + "\n" + "expression=" + expression + "\n" + "faceShape=" + faceShape + "\n" + "gender=" + gender + "\n" + "glasses=" + glasses + "\n" + "faceType="
                + faceType + "\n" + "landmark=" + landmark + "\n" + "landmark72=" + landmark72 + "\n" + "quality=" + quality + "\n" + "liveness=" + liveness + "\n" + "beauty="
                + beauty + "\n" + "spoofing=" + spoofing + "\n" + "notSpoofing=" + notSpoofing + "\n" + "}";
    }

}