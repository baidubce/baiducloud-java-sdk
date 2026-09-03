package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SelfieAnimeRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后大小不超过10M(参考：原图大约为8M以内），最短边至少10px，最长边最大5000px，长宽比4：1以内。注意：图片的base64编码是不包含图片头的，如（data:image/jpg;base64, ）
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过10M(参考：原图大约为8M以内），最短边至少10px，最长边最大5000px，长宽比4：1以内，支持jpg/png/bmp格式，当image字段存在时url字段失效。
    */
    private String url;

    /**
    * anime或者anime_mask。前者生成二次元动漫图，后者生成戴口罩的二次元动漫人像
    */
    private String type;

    /**
    * 在type参数填入anime_mask时生效，1～8之间的整数，用于指定所使用的口罩编码。type参数没有填入anime_mask，或mask_id 为空时，生成不戴口罩的二次元动漫图。
    */
    @JsonProperty("mask_id")
    private String maskId;

    public String getImage() {
        return image;
    }

    public SelfieAnimeRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public SelfieAnimeRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getType() {
        return type;
    }

    public SelfieAnimeRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getMaskId() {
        return maskId;
    }

    public SelfieAnimeRequest setMaskId(String maskId) {
        this.maskId = maskId;
        return this;
    }

}
