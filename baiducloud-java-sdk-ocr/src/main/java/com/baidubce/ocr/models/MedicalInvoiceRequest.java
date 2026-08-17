package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalInvoiceRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式，当image字段存在时url字段失效。请注意关闭URL防盗链
    */
    private String url;

    /**
    * 是否返回字段的位置信息，默认为false。<br/>false：不返回字段位置信息；true：返回字段的位置信息，包括上边距（top）、左边距（left）、宽度（width）、高度（height）
    */
    private Boolean location;

    /**
    * 是否返回字段识别结果的置信度，默认为false。<br/>false：不返回字段识别结果的置信度；true：返回字段识别结果的置信度，包括字段识别结果中各字符置信度的平均值（average）和最小值（min）
    */
    private Boolean probability;

    /**
    * 医保三目录查询，可选值为对应城市代码，可缺省，当此参数的输入值不为对应城市编码时，即进行全量查询，默认进行全量查询，如不需要进行医保三目录查询，无需添加此参数。100000→北京；200000→上海；510000→广州；518000→深圳；519000→珠海；410000→长沙；400000→重庆；710000→西安；300000→天津；
    * 528000→佛山；523000→东莞；310000→杭州；450000→郑州；550000→贵阳；116000→大连；215000→苏州；210000→南京；430000→武汉；230000→合肥；610000→成都；50000→石家庄
    */
    @JsonProperty("medi_query")
    private String mediQuery;

    public String getImage() {
        return image;
    }

    public MedicalInvoiceRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public MedicalInvoiceRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public Boolean getLocation() {
        return location;
    }

    public MedicalInvoiceRequest setLocation(Boolean location) {
        this.location = location;
        return this;
    }

    public Boolean getProbability() {
        return probability;
    }

    public MedicalInvoiceRequest setProbability(Boolean probability) {
        this.probability = probability;
        return this;
    }

    public String getMediQuery() {
        return mediQuery;
    }

    public MedicalInvoiceRequest setMediQuery(String mediQuery) {
        this.mediQuery = mediQuery;
        return this;
    }

}
