package com.baidubce.face.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceMarkFaceInfo {
    /**
     * location
     */
    private FaceMarkLocation location;

    /**
     * angle
     */
    private FaceMarkAngle angle;

    /**
     * 年龄，face_field包含age时返回
     */
    private Double age;

    /**
     * gender
     */
    private Gender gender;

    /**
     * 72个特征点位置，face_field包含landmark72时返回
     */
    private List<FaceMarkPoint> landmark72;

    /**
     * 150个特征点位置，face_field包含landmark150时返回
     */
    private Object landmark150;

    /**
     * 201个特征点位置，face_field包含landmark201时返回
     */
    private Object landmark201;

    /**
     * 人脸标志
     */
    @JsonProperty("face_token")
    private String faceToken;

    /**
     * 人脸置信度，范围0-1
     */
    @JsonProperty("face_probability")
    private Double faceProbability;

    public FaceMarkFaceInfo setLocation(FaceMarkLocation location) {
        this.location = location;
        return this;
    }

    public FaceMarkLocation getLocation() {
        return this.location;
    }

    public FaceMarkFaceInfo setAngle(FaceMarkAngle angle) {
        this.angle = angle;
        return this;
    }

    public FaceMarkAngle getAngle() {
        return this.angle;
    }

    public FaceMarkFaceInfo setAge(Double age) {
        this.age = age;
        return this;
    }

    public Double getAge() {
        return this.age;
    }

    public FaceMarkFaceInfo setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public Gender getGender() {
        return this.gender;
    }

    public FaceMarkFaceInfo setLandmark72(List<FaceMarkPoint> landmark72) {
        this.landmark72 = landmark72;
        return this;
    }

    public List<FaceMarkPoint> getLandmark72() {
        return this.landmark72;
    }

    public FaceMarkFaceInfo setLandmark150(Object landmark150) {
        this.landmark150 = landmark150;
        return this;
    }

    public Object getLandmark150() {
        return this.landmark150;
    }

    public FaceMarkFaceInfo setLandmark201(Object landmark201) {
        this.landmark201 = landmark201;
        return this;
    }

    public Object getLandmark201() {
        return this.landmark201;
    }

    public FaceMarkFaceInfo setFaceToken(String faceToken) {
        this.faceToken = faceToken;
        return this;
    }

    public String getFaceToken() {
        return this.faceToken;
    }

    public FaceMarkFaceInfo setFaceProbability(Double faceProbability) {
        this.faceProbability = faceProbability;
        return this;
    }

    public Double getFaceProbability() {
        return this.faceProbability;
    }

    @Override
    public String toString() {
        return "FaceMarkFaceInfo{" + "location=" + location + "\n" + "angle=" + angle + "\n" + "age=" + age + "\n" + "gender=" + gender + "\n" + "landmark72=" + landmark72 + "\n"
                + "landmark150=" + landmark150 + "\n" + "landmark201=" + landmark201 + "\n" + "faceToken=" + faceToken + "\n" + "faceProbability=" + faceProbability + "\n" + "}";
    }

}