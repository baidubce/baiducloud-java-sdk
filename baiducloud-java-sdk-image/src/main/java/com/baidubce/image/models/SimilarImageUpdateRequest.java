package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SimilarImageUpdateRequest extends BaseBceRequest {

    /**
    * 图片数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过4M，和url、cont_sign三选一，优先级：image > url > cont_sign，注意要去掉图片头部，如（data:image/jpg;base64,
    * ），最短边至少50px，最长边最大4096px，支持jpg/png/bmp格式
    */
    private String image;

    /**
    * 图片URL，和image、cont_sign三选一，优先级：image > url > cont_sign，由于图床的差异性，抓图服务无法适配所有的图床，部分URL可能抓不到图，或者图片下载超时，遇到上述情况时请更换图片URL、或者将图片下载到本地转码后上传
    */
    private String url;

    /**
    * 图片签名，和image、url三选一，优先级：image > url > cont_sign；不支持批量传入签名，样例：\"932301884,10680062193\"
    */
    @JsonProperty("cont_sign")
    private String contSign;

    /**
    * 更新的摘要信息，最长256B。样例：{\"name\":\"周杰伦\", \"id\":\"666\"}
    */
    private String brief;

    /**
    * 更新的分类信息，tag间以逗号分隔，最多2个tag。样例：\"100,11\"。可选值范围：1 - 65535范围内的整数
    */
    private String tags;

    public String getImage() {
        return image;
    }

    public SimilarImageUpdateRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public SimilarImageUpdateRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getContSign() {
        return contSign;
    }

    public SimilarImageUpdateRequest setContSign(String contSign) {
        this.contSign = contSign;
        return this;
    }

    public String getBrief() {
        return brief;
    }

    public SimilarImageUpdateRequest setBrief(String brief) {
        this.brief = brief;
        return this;
    }

    public String getTags() {
        return tags;
    }

    public SimilarImageUpdateRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }

}
