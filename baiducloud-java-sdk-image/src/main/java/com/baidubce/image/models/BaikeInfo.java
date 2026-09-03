package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaikeInfo {
    /**
     * 百科页面链接
     */
    @JsonProperty("baike_url")
    private String baikeUrl;

    /**
     * 百科图片链接
     */
    @JsonProperty("image_url")
    private String imageUrl;

    /**
     * 百科内容描述
     */
    private String description;

    public BaikeInfo setBaikeUrl(String baikeUrl) {
        this.baikeUrl = baikeUrl;
        return this;
    }

    public String getBaikeUrl() {
        return this.baikeUrl;
    }

    public BaikeInfo setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public BaikeInfo setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "BaikeInfo{" + "baikeUrl=" + baikeUrl + "\n" + "imageUrl=" + imageUrl + "\n" + "description=" + description + "\n" + "}";
    }

}