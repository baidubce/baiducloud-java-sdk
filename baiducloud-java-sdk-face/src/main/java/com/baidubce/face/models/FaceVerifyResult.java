package com.baidubce.face.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceVerifyResult {
    /**
     * 所有图片的总体活体最高得分，范围【0~1】
     */
    @JsonProperty("face_liveness")
    private Float faceLiveness;

    /**
     * thresholds
     */
    private Thresholds thresholds;

    /**
     * 每张图片的详细信息描述，如果只上传一张图片，则只返回一个结果
     */
    @JsonProperty("face_list")
    private List<FaceVerifyFaceInfo> faceList;

    public FaceVerifyResult setFaceLiveness(Float faceLiveness) {
        this.faceLiveness = faceLiveness;
        return this;
    }

    public Float getFaceLiveness() {
        return this.faceLiveness;
    }

    public FaceVerifyResult setThresholds(Thresholds thresholds) {
        this.thresholds = thresholds;
        return this;
    }

    public Thresholds getThresholds() {
        return this.thresholds;
    }

    public FaceVerifyResult setFaceList(List<FaceVerifyFaceInfo> faceList) {
        this.faceList = faceList;
        return this;
    }

    public List<FaceVerifyFaceInfo> getFaceList() {
        return this.faceList;
    }

    @Override
    public String toString() {
        return "FaceVerifyResult{" + "faceLiveness=" + faceLiveness + "\n" + "thresholds=" + thresholds + "\n" + "faceList=" + faceList + "\n" + "}";
    }

}