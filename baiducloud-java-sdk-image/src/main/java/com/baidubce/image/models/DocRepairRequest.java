package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocRepairRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码字符串，大小不超过4M，最短边至少50px，最长边最大4096px，支持jpg/bmp/png格式。<br/>优先级：image > url
    */
    private String image;

    /**
    * 图片完整url，url长度不超过1024字节，url对应的图片base64编码后大小不超过4M，最短边至少50px，最长边最大4096px，支持jpg/bmp/png格式。<br/>优先级：image > url，当image字段存在时，url字段失效
    */
    private String url;

    public String getImage() {
        return image;
    }

    public DocRepairRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public DocRepairRequest setUrl(String url) {
        this.url = url;
        return this;
    }

}
