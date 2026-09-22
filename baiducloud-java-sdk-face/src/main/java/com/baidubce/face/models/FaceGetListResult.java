package com.baidubce.face.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceGetListResult {
    /**
     * 人脸列表
     */
    @JsonProperty("face_list")
    private List<FaceGetListFaceInfo> faceList;

    public FaceGetListResult setFaceList(List<FaceGetListFaceInfo> faceList) {
        this.faceList = faceList;
        return this;
    }

    public List<FaceGetListFaceInfo> getFaceList() {
        return this.faceList;
    }

    @Override
    public String toString() {
        return "FaceGetListResult{" + "faceList=" + faceList + "\n" + "}";
    }

}