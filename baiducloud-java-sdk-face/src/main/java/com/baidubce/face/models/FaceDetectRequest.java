package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceDetectRequest extends BaseBceRequest {

    /**
    * 图片信息（总数据大小应小于10M，分辨率应小于1920×1080），图片上传方式根据image_type来判断
    */
    private String image;

    /**
    * 图片类型
    */
    @JsonProperty("image_type")
    private String imageType;

    /**
    * 返回字段，可选：age,expression,face_shape,gender,glasses,landmark,landmark150,quality,eye_status,emotion,face_type,mask,spoofing，逗号分隔。<br/>默认只返回face_token、人脸框、概率和旋转角度
    */
    @JsonProperty("face_field")
    private String faceField;

    /**
    * 最多处理人脸的数目，默认值为1，根据人脸检测排序类型检测图片中排序第一的人脸（默认为人脸面积最大的人脸），最大值20
    */
    @JsonProperty("max_face_num")
    private Integer maxFaceNum;

    /**
    * 人脸类型
    */
    @JsonProperty("face_type")
    private String faceType;

    /**
    * 活体控制
    */
    @JsonProperty("liveness_control")
    private String livenessControl;

    /**
    * 人脸检测排序类型
    */
    @JsonProperty("face_sort_type")
    private Integer faceSortType;

    /**
    * 是否显示检测人脸的裁剪图base64值：0-不显示（默认）；1-显示（max_face_num上限按5计算）
    */
    @JsonProperty("display_corp_image")
    private Integer displayCorpImage;

    public String getImage() {
        return image;
    }

    public FaceDetectRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getImageType() {
        return imageType;
    }

    public FaceDetectRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    public String getFaceField() {
        return faceField;
    }

    public FaceDetectRequest setFaceField(String faceField) {
        this.faceField = faceField;
        return this;
    }

    public Integer getMaxFaceNum() {
        return maxFaceNum;
    }

    public FaceDetectRequest setMaxFaceNum(Integer maxFaceNum) {
        this.maxFaceNum = maxFaceNum;
        return this;
    }

    public String getFaceType() {
        return faceType;
    }

    public FaceDetectRequest setFaceType(String faceType) {
        this.faceType = faceType;
        return this;
    }

    public String getLivenessControl() {
        return livenessControl;
    }

    public FaceDetectRequest setLivenessControl(String livenessControl) {
        this.livenessControl = livenessControl;
        return this;
    }

    public Integer getFaceSortType() {
        return faceSortType;
    }

    public FaceDetectRequest setFaceSortType(Integer faceSortType) {
        this.faceSortType = faceSortType;
        return this;
    }

    public Integer getDisplayCorpImage() {
        return displayCorpImage;
    }

    public FaceDetectRequest setDisplayCorpImage(Integer displayCorpImage) {
        this.displayCorpImage = displayCorpImage;
        return this;
    }

}
