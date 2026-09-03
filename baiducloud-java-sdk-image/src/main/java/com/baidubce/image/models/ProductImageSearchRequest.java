package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductImageSearchRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过4M。和url二选一，image优先级更高，注意要去掉图片头部，如（data:image/jpg;base64, ），最短边至少300px，最长边最大4096px，支持jpg/png/bmp格式。
    */
    private String image;

    /**
    * 图片URL，和image二选一，image优先级更高，由于图床的差异性，抓图服务无法适配所有的图床，部分URL可能抓不到图，或者图片下载超时，遇到上述情况时请更换图片URL、或者将图片下载到本地转码后上传
    */
    private String url;

    /**
    * 商品分类维度1，支持1-65535范围内的整数
    */
    @JsonProperty("class_id1")
    private Integer classId1;

    /**
    * 商品分类维度2，支持1-65535范围内的整数
    */
    @JsonProperty("class_id2")
    private Integer classId2;

    /**
    * 检索时tag之间的逻辑，0：逻辑and，1：逻辑or
    */
    @JsonProperty("tag_logic")
    private Integer tagLogic;

    /**
    * 分页功能，起始位置，例：0。取值范围0-999。未指定分页时，默认返回前300个结果；接口返回数量最大限制1000条，例如：起始位置为900，截取条数500条，接口也只返回第900-1000条的结果，共计100条
    */
    private Integer pn;

    /**
    * 分页功能，截取条数，例：250。取值范围1-1000
    */
    private Integer rn;

    public String getImage() {
        return image;
    }

    public ProductImageSearchRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public ProductImageSearchRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getClassId1() {
        return classId1;
    }

    public ProductImageSearchRequest setClassId1(Integer classId1) {
        this.classId1 = classId1;
        return this;
    }

    public Integer getClassId2() {
        return classId2;
    }

    public ProductImageSearchRequest setClassId2(Integer classId2) {
        this.classId2 = classId2;
        return this;
    }

    public Integer getTagLogic() {
        return tagLogic;
    }

    public ProductImageSearchRequest setTagLogic(Integer tagLogic) {
        this.tagLogic = tagLogic;
        return this;
    }

    public Integer getPn() {
        return pn;
    }

    public ProductImageSearchRequest setPn(Integer pn) {
        this.pn = pn;
        return this;
    }

    public Integer getRn() {
        return rn;
    }

    public ProductImageSearchRequest setRn(Integer rn) {
        this.rn = rn;
        return this;
    }

}
