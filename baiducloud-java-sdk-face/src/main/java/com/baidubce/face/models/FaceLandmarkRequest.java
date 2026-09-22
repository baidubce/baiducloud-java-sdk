package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceLandmarkRequest extends BaseBceRequest {

    /**
    * 图片信息，数据大小应小于10M，分辨率应小于1920×1080
    */
    private String image;

    /**
    * 图片类型
    */
    @JsonProperty("image_type")
    private String imageType;

    /**
    * 最多处理人脸的数目，默认值为1（仅检测面积最大的人脸），最大值10
    */
    @JsonProperty("max_face_num")
    private Integer maxFaceNum;

    /**
    * 返回字段，可选：age,gender,landmark4,landmark72,landmark150,landmark201，逗号分隔。默认只返回face_token、人脸框、概率和旋转角度
    */
    @JsonProperty("face_field")
    private String faceField;

    public String getImage() {
        return image;
    }

    public FaceLandmarkRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getImageType() {
        return imageType;
    }

    public FaceLandmarkRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    public Integer getMaxFaceNum() {
        return maxFaceNum;
    }

    public FaceLandmarkRequest setMaxFaceNum(Integer maxFaceNum) {
        this.maxFaceNum = maxFaceNum;
        return this;
    }

    public String getFaceField() {
        return faceField;
    }

    public FaceLandmarkRequest setFaceField(String faceField) {
        this.faceField = faceField;
        return this;
    }

}
