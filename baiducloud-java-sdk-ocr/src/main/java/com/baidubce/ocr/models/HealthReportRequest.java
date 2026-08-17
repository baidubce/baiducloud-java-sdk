package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HealthReportRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式
    */
    private String image;

    /**
    * 图片完整url，url长度不超过1024字节，url对应的图片base64编码后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式，当image字段存在时url字段失效。请注意关闭URL防盗链
    */
    private String url;

    /**
    * 是否返回字段的位置信息，默认为false。<br/>false：不返回字段位置信息；true：返回字段的位置信息，包括上边距（top）、左边距（left）、宽度（width）、高度（height）
    */
    private Boolean location;

    /**
    * 是否返回字段识别结果的置信度，默认为false。<br/>false：不返回字段识别结果的置信度；true：返回字段识别结果的置信度，包括字段识别结果中各字符置信度的平均值（average）和最小值（min）
    */
    private Boolean probability;

    public String getImage() {
        return image;
    }

    public HealthReportRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public HealthReportRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public Boolean getLocation() {
        return location;
    }

    public HealthReportRequest setLocation(Boolean location) {
        this.location = location;
        return this;
    }

    public Boolean getProbability() {
        return probability;
    }

    public HealthReportRequest setProbability(Boolean probability) {
        this.probability = probability;
        return this;
    }

}
