package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FacadeRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，base64编码去除编码头（data:image/jpeg;base64），要求base64编码和urlencode后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式
    */
    private String image;

    public String getImage() {
        return image;
    }

    public FacadeRequest setImage(String image) {
        this.image = image;
        return this;
    }

}
