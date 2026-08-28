package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WaybillRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式
    */
    private String image;

    /**
    * 图片完整url，url长度不超过1024字节，url对应的图片base64编码后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式，当image字段存在时url字段失效。请注意关闭URL防盗链
    */
    private String url;

    /**
    * 是否需要识别隐私面单。<div/>- true：需要识别隐私面单，会增加返回隐私面单的3个字段<br/>- false：不识别隐私面单
    */
    @JsonProperty("is_identify_virtual_waybill")
    private Boolean isIdentifyVirtualWaybill;

    public String getImage() {
        return image;
    }

    public WaybillRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public WaybillRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public Boolean getIsIdentifyVirtualWaybill() {
        return isIdentifyVirtualWaybill;
    }

    public WaybillRequest setIsIdentifyVirtualWaybill(Boolean isIdentifyVirtualWaybill) {
        this.isIdentifyVirtualWaybill = isIdentifyVirtualWaybill;
        return this;
    }

}
