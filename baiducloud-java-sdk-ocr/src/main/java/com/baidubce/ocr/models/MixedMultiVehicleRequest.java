package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MixedMultiVehicleRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式，当image字段存在时url字段失效，请注意关闭URL防盗链
    */
    private String url;

    /**
    * 是否检测图像朝向。<div/>- false：默认值，不进行图像方向自动矫正 <br/>- true：开启图像方向自动矫正功能，可对旋转90/180/270度的图片进行自动矫正并识别
    */
    @JsonProperty("detect_direction")
    private Boolean detectDirection;

    /**
    * 是否进行归一化处理。<div/>- false：默认值，不进行归一化处理 <br/>- true：对输出字段进行归一化处理，将新/老版行驶证的\"注册登记日期/注册日期\"统一为\"注册日期\"进行输出
    */
    private Boolean unified;

    public String getImage() {
        return image;
    }

    public MixedMultiVehicleRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public MixedMultiVehicleRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public Boolean getDetectDirection() {
        return detectDirection;
    }

    public MixedMultiVehicleRequest setDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
        return this;
    }

    public Boolean getUnified() {
        return unified;
    }

    public MixedMultiVehicleRequest setUnified(Boolean unified) {
        this.unified = unified;
        return this;
    }

}
