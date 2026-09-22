package com.baidubce.face.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceDetectResult {
    /**
     * 检测到的图片中的人脸数量
     */
    @JsonProperty("face_num")
    private Integer faceNum;

    /**
     * 人脸信息列表
     */
    @JsonProperty("face_list")
    private List<FaceDetectFaceInfo> faceList;

    /**
     * 检测人脸框的人脸图片base64值
     */
    @JsonProperty("corp_image_base64")
    private String corpImageBase64;

    public FaceDetectResult setFaceNum(Integer faceNum) {
        this.faceNum = faceNum;
        return this;
    }

    public Integer getFaceNum() {
        return this.faceNum;
    }

    public FaceDetectResult setFaceList(List<FaceDetectFaceInfo> faceList) {
        this.faceList = faceList;
        return this;
    }

    public List<FaceDetectFaceInfo> getFaceList() {
        return this.faceList;
    }

    public FaceDetectResult setCorpImageBase64(String corpImageBase64) {
        this.corpImageBase64 = corpImageBase64;
        return this;
    }

    public String getCorpImageBase64() {
        return this.corpImageBase64;
    }

    @Override
    public String toString() {
        return "FaceDetectResult{" + "faceNum=" + faceNum + "\n" + "faceList=" + faceList + "\n" + "corpImageBase64=" + corpImageBase64 + "\n" + "}";
    }

}