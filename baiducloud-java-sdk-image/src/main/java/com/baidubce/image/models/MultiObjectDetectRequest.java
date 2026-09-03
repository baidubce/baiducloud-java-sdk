package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiObjectDetectRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过4M，最短边至少64px，最长边最大4096px，长宽比3：1以内，支持jpg/png/bmp格式。注意：图片的base64编码是不包含图片头的，如（data:image/jpg;base64, ）去掉编码头后再进行urlencode。
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过4M，最短边至少64px，最长边最大4096px，长宽比3：1以内，支持jpg/png/bmp格式，当image字段存在时url字段失效。
    */
    private String url;

    public String getImage() {
        return image;
    }

    public MultiObjectDetectRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public MultiObjectDetectRequest setUrl(String url) {
        this.url = url;
        return this;
    }

}
