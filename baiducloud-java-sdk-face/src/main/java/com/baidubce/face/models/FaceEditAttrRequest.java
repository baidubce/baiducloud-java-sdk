package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceEditAttrRequest extends BaseBceRequest {

    /**
    * 原始图片信息，BASE64或FACE_TOKEN。图片分辨率要求256×256以上、4096×4096以下，大小在4M以下，人脸区域要求64×64以上
    */
    private String image;

    /**
    * 图片类型
    */
    @JsonProperty("image_type")
    private String imageType;

    /**
    * 人脸编辑方式
    */
    @JsonProperty("action_type")
    private String actionType;

    /**
    * 仅在action_type为V2_AGE或V2_GENDER时生效。V2_GENDER：0（转为男性）或1（转为女性）；V2_AGE：1-85（目标年龄）
    */
    private Integer target;

    /**
    * 质量控制
    */
    @JsonProperty("quality_control")
    private String qualityControl;

    /**
    * 当图片中有多张人脸时，指定需要编辑的人脸框位置。格式：{"left":111.4,"top":96.56,"width":98,"height":98,"rotation":3}。image_type为FACE_TOKEN时此参数无效
    */
    @JsonProperty("face_location")
    private String faceLocation;

    public String getImage() {
        return image;
    }

    public FaceEditAttrRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getImageType() {
        return imageType;
    }

    public FaceEditAttrRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    public String getActionType() {
        return actionType;
    }

    public FaceEditAttrRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    public Integer getTarget() {
        return target;
    }

    public FaceEditAttrRequest setTarget(Integer target) {
        this.target = target;
        return this;
    }

    public String getQualityControl() {
        return qualityControl;
    }

    public FaceEditAttrRequest setQualityControl(String qualityControl) {
        this.qualityControl = qualityControl;
        return this;
    }

    public String getFaceLocation() {
        return faceLocation;
    }

    public FaceEditAttrRequest setFaceLocation(String faceLocation) {
        this.faceLocation = faceLocation;
        return this;
    }

}
