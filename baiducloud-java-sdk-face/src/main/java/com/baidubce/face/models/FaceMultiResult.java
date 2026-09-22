package com.baidubce.face.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceMultiResult {
    /**
     * 图片中的人脸数量
     */
    @JsonProperty("face_num")
    private Integer faceNum;

    /**
     * 人脸信息列表
     */
    @JsonProperty("face_list")
    private List<FaceMultiFaceInfo> faceList;

    public FaceMultiResult setFaceNum(Integer faceNum) {
        this.faceNum = faceNum;
        return this;
    }

    public Integer getFaceNum() {
        return this.faceNum;
    }

    public FaceMultiResult setFaceList(List<FaceMultiFaceInfo> faceList) {
        this.faceList = faceList;
        return this;
    }

    public List<FaceMultiFaceInfo> getFaceList() {
        return this.faceList;
    }

    @Override
    public String toString() {
        return "FaceMultiResult{" + "faceNum=" + faceNum + "\n" + "faceList=" + faceList + "\n" + "}";
    }

}