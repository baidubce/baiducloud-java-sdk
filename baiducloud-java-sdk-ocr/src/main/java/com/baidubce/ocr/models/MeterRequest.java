package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MeterRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过4M，最短边至少15px，最长边最大4096px。支持jpg/jpeg/png/bmp格式。注意：图片的base64编码是不包含图片头的，如（data:image/jpg;base64, ）
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，url对应的图片base64编码后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式，当image字段存在时url字段失效。 请注意关闭URL防盗链
    */
    private String url;

    /**
    * 是否返回每行识别结果的置信度，默认为false
    */
    private Boolean probability;

    /**
    * 位置信息返回形式，默认：false false：只给出识别结果所在长方形位置信息 true：除了默认的识别文字所在长方形的位置信息，还会给出文字所在区域的最小外接旋转矩形的4个点坐标信息
    */
    @JsonProperty("poly_location")
    private Boolean polyLocation;

    public String getImage() {
        return image;
    }

    public MeterRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public MeterRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public Boolean getProbability() {
        return probability;
    }

    public MeterRequest setProbability(Boolean probability) {
        this.probability = probability;
        return this;
    }

    public Boolean getPolyLocation() {
        return polyLocation;
    }

    public MeterRequest setPolyLocation(Boolean polyLocation) {
        this.polyLocation = polyLocation;
        return this;
    }

}
