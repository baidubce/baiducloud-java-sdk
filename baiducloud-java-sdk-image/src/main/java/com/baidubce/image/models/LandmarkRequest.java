package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LandmarkRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码，要求base64编码后大小不超过4M，最短边至少15px，最长边最大4096px, 支持jpg/png/bmp格式。<br/>注意：图片需要base64编码、去掉编码头（data:image/jpg;base64, ）后，再进行urlencode。
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过4M，最短边至少15px，最长边最大4096px, 支持jpg/png/bmp格式，当image字段存在时url字段失效。
    */
    private String url;

    public String getImage() {
        return image;
    }

    public LandmarkRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public LandmarkRequest setUrl(String url) {
        this.url = url;
        return this;
    }

}
