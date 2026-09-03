package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlantRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码，要求base64编码后大小不超过4M，最短边至少15px，最长边最大4096px, 支持jpg/png/bmp格式。注意：图片需要base64编码、去掉编码头后再进行urlencode。
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过4M，最短边至少15px，最长边最大4096px, 支持jpg/png/bmp格式，当image字段存在时url字段失效。
    */
    private String url;

    /**
    * 用于控制返回结果是否带有百科信息，若不输入此参数，则默认不返回百科结果；若输入此参数，会根据输入的整数返回相应个数的百科信息。
    */
    @JsonProperty("baike_num")
    private Integer baikeNum;

    public String getImage() {
        return image;
    }

    public PlantRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public PlantRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getBaikeNum() {
        return baikeNum;
    }

    public PlantRequest setBaikeNum(Integer baikeNum) {
        this.baikeNum = baikeNum;
        return this;
    }

}
