package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObjectDetectRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码，要求base64编码后大小不超过4M，最短边至少15px，最长边最大4096px, 支持jpg/png/bmp格式 。注意：图片需要base64编码、去掉编码头后再进行urlencode。
    */
    private String image;

    /**
    * 如果检测主体是人，主体区域是否带上人脸部分，0-不带人脸区域，其他-带人脸区域，裁剪类需求推荐带人脸，检索/识别类需求推荐不带人脸。默认取1，带人脸。
    */
    @JsonProperty("with_face")
    private Integer withFace;

    public String getImage() {
        return image;
    }

    public ObjectDetectRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public Integer getWithFace() {
        return withFace;
    }

    public ObjectDetectRequest setWithFace(Integer withFace) {
        this.withFace = withFace;
        return this;
    }

}
