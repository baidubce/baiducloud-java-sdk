package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogoDeleteRequest extends BaseBceRequest {

    /**
    * base64编码后的图片数据（和cont_sign二选一）。要求base64编码后大小不超过4M，最短边至少15px，最长边最大4096px, 支持jpg/png/bmp格式。<br/> 注意：图片需要base64编码、去掉编码头后再进行urlencode。
    */
    private String image;

    /**
    * 图片签名（和image二选一，image优先级更高）
    */
    @JsonProperty("cont_sign")
    private String contSign;

    public String getImage() {
        return image;
    }

    public LogoDeleteRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getContSign() {
        return contSign;
    }

    public LogoDeleteRequest setContSign(String contSign) {
        this.contSign = contSign;
        return this;
    }

}
