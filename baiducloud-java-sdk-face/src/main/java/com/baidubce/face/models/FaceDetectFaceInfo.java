package com.baidubce.face.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceDetectFaceInfo {
    /**
     * location
     */
    private FaceDetectLocation location;

    /**
     * angle
     */
    private FaceDetectAngle angle;

    /**
     * 年龄，face_field包含age时返回
     */
    private Double age;

    /**
     * expression
     */
    private FaceDetectTypeProbability expression;

    /**
     * gender
     */
    private FaceDetectTypeProbability gender;

    /**
     * glasses
     */
    private FaceDetectTypeProbability glasses;

    /**
     * emotion
     */
    private FaceDetectTypeProbability emotion;

    /**
     * mask
     */
    private MaskInfo mask;

    /**
     * 4个关键点位置，face_field包含landmark时返回
     */
    private List<FaceDetectPoint> landmark;

    /**
     * 72个特征点位置，face_field包含landmark时返回
     */
    private List<FaceDetectPoint> landmark72;

    /**
     * 150个特征点位置，face_field包含landmark150时返回
     */
    private Object landmark150;

    /**
     * quality
     */
    private FaceDetectQuality quality;

    /**
     * liveness
     */
    private FaceDetectLiveness liveness;

    /**
     * 判断图片是合成图的概率
     */
    private Double spoofing;

    /**
     * 人脸图片的唯一标识，有效期60min
     */
    @JsonProperty("face_token")
    private String faceToken;

    /**
     * 人脸置信度，范围0~1
     */
    @JsonProperty("face_probability")
    private Double faceProbability;

    /**
     * faceShape
     */
    @JsonProperty("face_shape")
    private FaceDetectTypeProbability faceShape;

    /**
     * eyeStatus
     */
    @JsonProperty("eye_status")
    private EyeStatus eyeStatus;

    /**
     * faceType
     */
    @JsonProperty("face_type")
    private FaceDetectTypeProbability faceType;

    /**
     * 判断图片不是合成图的概率
     */
    @JsonProperty("not_spoofing")
    private Double notSpoofing;

    public FaceDetectFaceInfo setLocation(FaceDetectLocation location) {
        this.location = location;
        return this;
    }

    public FaceDetectLocation getLocation() {
        return this.location;
    }

    public FaceDetectFaceInfo setAngle(FaceDetectAngle angle) {
        this.angle = angle;
        return this;
    }

    public FaceDetectAngle getAngle() {
        return this.angle;
    }

    public FaceDetectFaceInfo setAge(Double age) {
        this.age = age;
        return this;
    }

    public Double getAge() {
        return this.age;
    }

    public FaceDetectFaceInfo setExpression(FaceDetectTypeProbability expression) {
        this.expression = expression;
        return this;
    }

    public FaceDetectTypeProbability getExpression() {
        return this.expression;
    }

    public FaceDetectFaceInfo setGender(FaceDetectTypeProbability gender) {
        this.gender = gender;
        return this;
    }

    public FaceDetectTypeProbability getGender() {
        return this.gender;
    }

    public FaceDetectFaceInfo setGlasses(FaceDetectTypeProbability glasses) {
        this.glasses = glasses;
        return this;
    }

    public FaceDetectTypeProbability getGlasses() {
        return this.glasses;
    }

    public FaceDetectFaceInfo setEmotion(FaceDetectTypeProbability emotion) {
        this.emotion = emotion;
        return this;
    }

    public FaceDetectTypeProbability getEmotion() {
        return this.emotion;
    }

    public FaceDetectFaceInfo setMask(MaskInfo mask) {
        this.mask = mask;
        return this;
    }

    public MaskInfo getMask() {
        return this.mask;
    }

    public FaceDetectFaceInfo setLandmark(List<FaceDetectPoint> landmark) {
        this.landmark = landmark;
        return this;
    }

    public List<FaceDetectPoint> getLandmark() {
        return this.landmark;
    }

    public FaceDetectFaceInfo setLandmark72(List<FaceDetectPoint> landmark72) {
        this.landmark72 = landmark72;
        return this;
    }

    public List<FaceDetectPoint> getLandmark72() {
        return this.landmark72;
    }

    public FaceDetectFaceInfo setLandmark150(Object landmark150) {
        this.landmark150 = landmark150;
        return this;
    }

    public Object getLandmark150() {
        return this.landmark150;
    }

    public FaceDetectFaceInfo setQuality(FaceDetectQuality quality) {
        this.quality = quality;
        return this;
    }

    public FaceDetectQuality getQuality() {
        return this.quality;
    }

    public FaceDetectFaceInfo setLiveness(FaceDetectLiveness liveness) {
        this.liveness = liveness;
        return this;
    }

    public FaceDetectLiveness getLiveness() {
        return this.liveness;
    }

    public FaceDetectFaceInfo setSpoofing(Double spoofing) {
        this.spoofing = spoofing;
        return this;
    }

    public Double getSpoofing() {
        return this.spoofing;
    }

    public FaceDetectFaceInfo setFaceToken(String faceToken) {
        this.faceToken = faceToken;
        return this;
    }

    public String getFaceToken() {
        return this.faceToken;
    }

    public FaceDetectFaceInfo setFaceProbability(Double faceProbability) {
        this.faceProbability = faceProbability;
        return this;
    }

    public Double getFaceProbability() {
        return this.faceProbability;
    }

    public FaceDetectFaceInfo setFaceShape(FaceDetectTypeProbability faceShape) {
        this.faceShape = faceShape;
        return this;
    }

    public FaceDetectTypeProbability getFaceShape() {
        return this.faceShape;
    }

    public FaceDetectFaceInfo setEyeStatus(EyeStatus eyeStatus) {
        this.eyeStatus = eyeStatus;
        return this;
    }

    public EyeStatus getEyeStatus() {
        return this.eyeStatus;
    }

    public FaceDetectFaceInfo setFaceType(FaceDetectTypeProbability faceType) {
        this.faceType = faceType;
        return this;
    }

    public FaceDetectTypeProbability getFaceType() {
        return this.faceType;
    }

    public FaceDetectFaceInfo setNotSpoofing(Double notSpoofing) {
        this.notSpoofing = notSpoofing;
        return this;
    }

    public Double getNotSpoofing() {
        return this.notSpoofing;
    }

    @Override
    public String toString() {
        return "FaceDetectFaceInfo{" + "location=" + location + "\n" + "angle=" + angle + "\n" + "age=" + age + "\n" + "expression=" + expression + "\n" + "gender=" + gender
                + "\n" + "glasses=" + glasses + "\n" + "emotion=" + emotion + "\n" + "mask=" + mask + "\n" + "landmark=" + landmark + "\n" + "landmark72=" + landmark72 + "\n"
                + "landmark150=" + landmark150 + "\n" + "quality=" + quality + "\n" + "liveness=" + liveness + "\n" + "spoofing=" + spoofing + "\n" + "faceToken=" + faceToken
                + "\n" + "faceProbability=" + faceProbability + "\n" + "faceShape=" + faceShape + "\n" + "eyeStatus=" + eyeStatus + "\n" + "faceType=" + faceType + "\n"
                + "notSpoofing=" + notSpoofing + "\n" + "}";
    }

}