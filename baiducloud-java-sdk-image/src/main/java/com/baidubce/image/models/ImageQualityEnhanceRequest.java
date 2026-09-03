package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageQualityEnhanceRequest extends BaseBceRequest {

    /**
    * base64编码后大小不超过4M，长宽乘积不超过2000p x 2000px。注意：图片的base64编码是不包含图片头的，如（data:image/jpg;base64, ）
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过4M，长宽乘积不超过2000p x 2000px，支持jpg/png/bmp格式，当image字段存在时url字段失效。
    */
    private String url;

    public String getImage() {
        return image;
    }

    public ImageQualityEnhanceRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public ImageQualityEnhanceRequest setUrl(String url) {
        this.url = url;
        return this;
    }

}
