package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogoRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码，要求base64编码后大小不超过4M，最短边至少15px，最长边最大4096px, 支持jpg/png/bmp格式。<br/>注意：图片需要base64编码、去掉编码头后再进行urlencode。
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过4M，最短边至少15px，最长边最大4096px, 支持jpg/png/bmp格式，当image字段存在时url字段失效。
    */
    private String url;

    /**
    * 是否只检索用户子库，true则只检索用户子库，false(默认)为检索底库+用户子库
    */
    @JsonProperty("custom_lib")
    private Boolean customLib;

    public String getImage() {
        return image;
    }

    public LogoRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public LogoRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public Boolean getCustomLib() {
        return customLib;
    }

    public LogoRequest setCustomLib(Boolean customLib) {
        this.customLib = customLib;
        return this;
    }

}
