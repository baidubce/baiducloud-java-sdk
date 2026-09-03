package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogoAddRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码，要求base64编码后大小不超过4M，最短边至少15px，最长边最大4096px, 支持jpg/png/bmp格式。<br/>注意：图片需要base64编码、去掉编码头后再进行urlencode。
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过4M，最短边至少15px，最长边最大4096px, 支持jpg/png/bmp格式，当image字段存在时url字段失效。
    */
    private String url;

    /**
    * 此处需要传对应的品牌名称name字段，必须为json格式，检索时带回。name长度小于100B，示例{\"name\": \"abc\"} 。brief需要进行urlencode。
    */
    private String brief;

    public String getImage() {
        return image;
    }

    public LogoAddRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public LogoAddRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getBrief() {
        return brief;
    }

    public LogoAddRequest setBrief(String brief) {
        this.brief = brief;
        return this;
    }

}
