package com.baidubce.face.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceMarkResult {
    /**
     * 图片中的人脸数量
     */
    @JsonProperty("face_num")
    private Integer faceNum;

    /**
     * 人脸信息列表
     */
    @JsonProperty("face_list")
    private List<FaceMarkFaceInfo> faceList;

    public FaceMarkResult setFaceNum(Integer faceNum) {
        this.faceNum = faceNum;
        return this;
    }

    public Integer getFaceNum() {
        return this.faceNum;
    }

    public FaceMarkResult setFaceList(List<FaceMarkFaceInfo> faceList) {
        this.faceList = faceList;
        return this;
    }

    public List<FaceMarkFaceInfo> getFaceList() {
        return this.faceList;
    }

    @Override
    public String toString() {
        return "FaceMarkResult{" + "faceNum=" + faceNum + "\n" + "faceList=" + faceList + "\n" + "}";
    }

}