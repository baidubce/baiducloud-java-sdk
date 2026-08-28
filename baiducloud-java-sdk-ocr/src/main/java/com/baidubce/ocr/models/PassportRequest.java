package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PassportRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，需去掉编码头（即：data:image/jpeg;base64, ），要求base64编码和urlencode后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式，当image字段存在时url字段失效，请注意关闭URL防盗链
    */
    private String url;

    public String getImage() {
        return image;
    }

    public PassportRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public PassportRequest setUrl(String url) {
        this.url = url;
        return this;
    }

}
