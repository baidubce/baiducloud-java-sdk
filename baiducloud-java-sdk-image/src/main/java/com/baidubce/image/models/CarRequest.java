package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码，要求base64编码后大小不超过4M，最短边至少50px，最长边最大4096px，支持jpg/png/bmp格式。<br/>注意：图片需要base64编码、去掉编码头后再进行urlencode。
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过4M，最短边至少50px，最长边最大4096px，支持jpg/png/bmp格式，当image字段存在时url字段失效。
    */
    private String url;

    /**
    * 返回预测得分top n结果，默认5
    */
    @JsonProperty("top_num")
    private Integer topNum;

    /**
    * 返回百科信息的结果数，默认不返回
    */
    @JsonProperty("baike_num")
    private Integer baikeNum;

    /**
    * 是否返回车辆的品牌信息，默认不返回，可选值包括： - true：返回品牌 - false：不返回品牌
    */
    @JsonProperty("output_brand")
    private Boolean outputBrand;

    public String getImage() {
        return image;
    }

    public CarRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public CarRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getTopNum() {
        return topNum;
    }

    public CarRequest setTopNum(Integer topNum) {
        this.topNum = topNum;
        return this;
    }

    public Integer getBaikeNum() {
        return baikeNum;
    }

    public CarRequest setBaikeNum(Integer baikeNum) {
        this.baikeNum = baikeNum;
        return this;
    }

    public Boolean getOutputBrand() {
        return outputBrand;
    }

    public CarRequest setOutputBrand(Boolean outputBrand) {
        this.outputBrand = outputBrand;
        return this;
    }

}
