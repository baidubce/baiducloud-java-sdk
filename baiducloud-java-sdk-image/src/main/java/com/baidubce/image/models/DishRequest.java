package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DishRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码，要求base64编码后大小不超过4M，最短边至少15px，最长边最大4096px,支持jpg/png/bmp格式。<br/>注意：图片需要base64编码、去掉编码头（data:image/jpg;base64, ）后，再进行urlencode。
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过4M，最短边至少15px，最长边最大4096px,支持jpg/png/bmp格式，当image字段存在时url字段失效。
    */
    private String url;

    /**
    * 返回预测得分top n结果，默认5
    */
    @JsonProperty("top_num")
    private Integer topNum;

    /**
    * 默认0.95，可以通过该参数调节识别效果，降低非菜识别率。
    */
    @JsonProperty("filter_threshold")
    private Float filterThreshold;

    /**
    * 用于控制返回结果是否带有百科信息，若不输入此参数，则默认不返回百科结果；若输入此参数，会根据输入的整数返回相应个数的百科信息。
    */
    @JsonProperty("baike_num")
    private Integer baikeNum;

    public String getImage() {
        return image;
    }

    public DishRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public DishRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getTopNum() {
        return topNum;
    }

    public DishRequest setTopNum(Integer topNum) {
        this.topNum = topNum;
        return this;
    }

    public Float getFilterThreshold() {
        return filterThreshold;
    }

    public DishRequest setFilterThreshold(Float filterThreshold) {
        this.filterThreshold = filterThreshold;
        return this;
    }

    public Integer getBaikeNum() {
        return baikeNum;
    }

    public DishRequest setBaikeNum(Integer baikeNum) {
        this.baikeNum = baikeNum;
        return this;
    }

}
