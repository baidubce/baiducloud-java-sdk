package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MaterielImageSearchRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过4M，和url二选一，image优先级更高，注意要去掉图片头部，如（data:image/jpg;base64, ）；最短边至少50px，最长边最大4096px，长宽比在1：20-20：1之间。支持jpg/png/bmp格式
    */
    private String image;

    /**
    * 图片URL，和image二选一，image优先级更高，由于图床的差异性，抓图服务无法适配所有的图床，部分URL可能抓不到图，或者图片下载超时，遇到上述情况时请更换图片URL、或者将图片下载到本地转码后上传
    */
    private String url;

    /**
    * 分类维度信息，tag间以逗号分隔，最多可传入2个tag，tag间无层级关系，示例：\"100,11\"。可选值范围：1 - 65535范围内的整数
    */
    private String tags;

    /**
    * 检索时tag之间的逻辑关系
    */
    @JsonProperty("tag_logic")
    private Integer tagLogic;

    /**
    * 分页功能，起始位置，例：0，代表从第1个结果开始。未指定分页时，默认返回第1个结果；接口返回数量最大限制300个，例如：起始位置为90，截取条数100条，接口也只返回第91 - 100条的结果，共计10条。可选值范围：0 - 299范围内的整数
    */
    private Integer pn;

    /**
    * 分页功能，截取条数，例：10。可选值范围：1 - 300范围内的整数
    */
    private Integer rn;

    public String getImage() {
        return image;
    }

    public MaterielImageSearchRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public MaterielImageSearchRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getTags() {
        return tags;
    }

    public MaterielImageSearchRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }

    public Integer getTagLogic() {
        return tagLogic;
    }

    public MaterielImageSearchRequest setTagLogic(Integer tagLogic) {
        this.tagLogic = tagLogic;
        return this;
    }

    public Integer getPn() {
        return pn;
    }

    public MaterielImageSearchRequest setPn(Integer pn) {
        this.pn = pn;
        return this;
    }

    public Integer getRn() {
        return rn;
    }

    public MaterielImageSearchRequest setRn(Integer rn) {
        this.rn = rn;
        return this;
    }

}
