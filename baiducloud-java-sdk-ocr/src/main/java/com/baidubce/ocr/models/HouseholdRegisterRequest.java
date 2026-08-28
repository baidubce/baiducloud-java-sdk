package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HouseholdRegisterRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过4M，最短边至少15px，最长边最大4096px, 支持jpg/jpeg/png/bmp格式
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过4M，最短边至少15px，最长边最大4096px, 支持jpg/jpeg/png/bmp格式，当image字段存在时url字段失效 请注意关闭URL防盗链
    */
    private String url;

    /**
    * 户口本类型页面： - subpage：默认值，常住人口登记卡（成员页） - homepage：户主页
    */
    @JsonProperty("household_register_side")
    private String householdRegisterSide;

    public String getImage() {
        return image;
    }

    public HouseholdRegisterRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public HouseholdRegisterRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getHouseholdRegisterSide() {
        return householdRegisterSide;
    }

    public HouseholdRegisterRequest setHouseholdRegisterSide(String householdRegisterSide) {
        this.householdRegisterSide = householdRegisterSide;
        return this;
    }

}
