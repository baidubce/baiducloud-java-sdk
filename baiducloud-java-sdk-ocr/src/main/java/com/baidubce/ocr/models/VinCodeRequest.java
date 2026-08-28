package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VinCodeRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过8M（为了保证输出稳定，建议大小实际控制在4M以内），最短边至少15px，最长边最大4096px, 支持jpg/jpeg/png/bmp格式
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过8M（为了保证输出稳定，建议大小实际控制在4M以内），最短边至少15px，最长边最大4096px, 支持jpg/jpeg/png/bmp格式，当image字段存在时url字段失效 <br/>请注意关闭URL防盗链
    */
    private String url;

    public String getImage() {
        return image;
    }

    public VinCodeRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public VinCodeRequest setUrl(String url) {
        this.url = url;
        return this;
    }

}
