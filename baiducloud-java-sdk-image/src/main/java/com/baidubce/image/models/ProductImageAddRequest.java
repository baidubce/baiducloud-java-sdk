package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductImageAddRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过4M。和url二选一，image优先级更高，注意要去掉图片头部，如（data:image/jpg;base64, ），最短边至少300px，最长边最大4096px，支持jpg/png/bmp格式。重复添加会返回错误。
    */
    private String image;

    /**
    * 图片URL，和image二选一，image优先级更高，由于图床的差异性，抓图服务无法适配所有的图床，部分URL可能抓不到图，或者图片下载超时，遇到上述情况时请更换图片URL、或者将图片下载到本地转码后上传
    */
    private String url;

    /**
    * 检索时原样带回，最长256B。样例{\"name\":\"周杰伦\", \"id\":\"666\"}。请注意，检索接口不返回原图，仅返回当前填写的brief信息，所以调用入库接口时，brief信息请尽量填写可关联至本地图库的图片id或者图片url、图片名称等信息，且不要重复
    */
    private String brief;

    /**
    * 商品分类维度1，检索时可圈定该分类维度进行检索；只传入class_id1，则检索结果中包含class_id1内容的都会被检索到；同时传入class_id1与class_id2，则检索结果中同时包含class_id1和class_id2内容的才会被检索到。 取值范围：1-65535范围内的整数
    */
    @JsonProperty("class_id1")
    private Integer classId1;

    /**
    * 商品分类维度2，检索时可圈定该分类维度进行检索，class_id1和class_id2无层级关系，检索时支持逻辑运算。  取值范围：1-65535范围内的整数
    */
    @JsonProperty("class_id2")
    private Integer classId2;

    public String getImage() {
        return image;
    }

    public ProductImageAddRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public ProductImageAddRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getBrief() {
        return brief;
    }

    public ProductImageAddRequest setBrief(String brief) {
        this.brief = brief;
        return this;
    }

    public Integer getClassId1() {
        return classId1;
    }

    public ProductImageAddRequest setClassId1(Integer classId1) {
        this.classId1 = classId1;
        return this;
    }

    public Integer getClassId2() {
        return classId2;
    }

    public ProductImageAddRequest setClassId2(Integer classId2) {
        this.classId2 = classId2;
        return this;
    }

}
