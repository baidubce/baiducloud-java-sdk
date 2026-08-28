package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CorrectEduCreateTaskRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过10M，最短边至少512px，最长边最大8192px，支持jpg/jpeg/png/bmp格式。优先级：image > url，当image字段存在时，url字段失效
    */
    private String image;

    /**
    * 图片完整url，url长度不超过1024字节，url对应的图片base64编码后大小不超过10M，最短边至少512px，最长边最大8192px，支持jpg/jpeg/png/bmp格式。优先级：image > url，当image字段存在时，url字段失效。请注意关闭URL防盗链
    */
    private String url;

    /**
    * 是否仅进行题目切分，默认false。true：开启（同步返回，扣切题额度）；false：不开启（端到端批改）
    */
    @JsonProperty("only_split")
    private Boolean onlySplit;

    /**
    * 是否关闭图片矫正，默认false。true：关闭矫正；false：开启矫正
    */
    @JsonProperty("disable_preprocess")
    private Boolean disablePreprocess;

    public String getImage() {
        return image;
    }

    public CorrectEduCreateTaskRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public CorrectEduCreateTaskRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public Boolean getOnlySplit() {
        return onlySplit;
    }

    public CorrectEduCreateTaskRequest setOnlySplit(Boolean onlySplit) {
        this.onlySplit = onlySplit;
        return this;
    }

    public Boolean getDisablePreprocess() {
        return disablePreprocess;
    }

    public CorrectEduCreateTaskRequest setDisablePreprocess(Boolean disablePreprocess) {
        this.disablePreprocess = disablePreprocess;
        return this;
    }

}
