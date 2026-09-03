package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PicturebookImageAddRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过4M，和url二选一，image优先级更高，注意要去掉图片头部，如（data:image/jpg;base64,
    * ）；最短边至少50px，最长边最大4096px，长宽比在1：20-20：1之间。支持jpg/png/bmp格式。重复添加完全相同的图片会返回错误，提示不能重复入库
    */
    private String image;

    /**
    * 图片URL，和image二选一，image优先级更高，url长度不超过1024字节，url对应图片base64编码之后大小不超过4M，最短边至少50px，最长边最大4096px，长宽比在1：20-20：1之间。支持jpg/png/bmp格式。由于图床的差异性，抓图服务无法适配所有的图床，部分URL可能抓不到图，或者图片下载超时，
    * 遇到上述情况时请更换图片URL、或者将图片下载到本地转码后上传
    */
    private String url;

    /**
    * 检索时原样带回，最长256B。样例：{\"name\":\"周杰伦\", \"id\":\"666\"}。检索接口不返回原图，仅返回入库时填写的brief信息，所以调用入库接口时，brief信息请尽量填写可关联至本地图库的图片id或者图片url、图片名称等信息，且不要重复
    */
    private String brief;

    /**
    * tag间以逗号分隔，最多2个tag，2个tag无层级关系，检索时支持逻辑运算。样例：\"100,11\"；检索时可圈定分类维度进行检索。可选值范围：1 - 65535范围内的整数
    */
    private String tags;

    public String getImage() {
        return image;
    }

    public PicturebookImageAddRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public PicturebookImageAddRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getBrief() {
        return brief;
    }

    public PicturebookImageAddRequest setBrief(String brief) {
        this.brief = brief;
        return this;
    }

    public String getTags() {
        return tags;
    }

    public PicturebookImageAddRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }

}
