package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageUnderstandingRequestRequest extends BaseBceRequest {

    /**
    * 图片数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过10M，最短边至少64px，最长边最大8192px，支持JPG/JPEG/PNG/BMP/WEBP格式。优先级：image >
    * url，当image字段存在时，url字段失效。注意：超过4096px的图片将被自动等比例压缩至4096px进行处理
    */
    private String image;

    /**
    * 图片完整url，url长度不超过1024字节，要求base64编码和urlencode后大小不超过10M，最短边至少64px，最长边最大8192px，支持JPG/JPEG/PNG/BMP/WEBP格式。优先级：image >
    * url，当image字段存在时，url字段失效。注意：超过4096px的图片将被自动等比例压缩至4096px进行处理，请注意关闭URL防盗链
    */
    private String url;

    /**
    * 提问信息，如'这张图片里有什么？'、'图中的人物是谁，并进行简单介绍'，限制100个字符之内
    */
    private String question;

    public String getImage() {
        return image;
    }

    public ImageUnderstandingRequestRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public ImageUnderstandingRequestRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getQuestion() {
        return question;
    }

    public ImageUnderstandingRequestRequest setQuestion(String question) {
        this.question = question;
        return this;
    }

}
