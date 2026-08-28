package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WordsResultItem {
    /**
     * 证件类型，vehicle_front、vehicle_back、driving_front和driving_back，分别对应行驶证正、副页，驾驶证正、副页
     */
    @JsonProperty("card_type")
    private String cardType;

    /**
     * 图像方向，当图像旋转时，返回该参数。-1：未定义，0：正向，1：逆时针90度，2：逆时针180度，3：逆时针270度
     */
    private Integer direction;

    /**
     * 检测到证件的置信度
     */
    private Float probability;

    /**
     * location
     */
    private MixedMultiVehicleLocation location;

    /**
     * 识别结果信息，key为字段名，value为识别内容
     */
    @JsonProperty("license_info")
    private List<LicenseInfoItem> licenseInfo;

    public WordsResultItem setCardType(String cardType) {
        this.cardType = cardType;
        return this;
    }

    public String getCardType() {
        return this.cardType;
    }

    public WordsResultItem setDirection(Integer direction) {
        this.direction = direction;
        return this;
    }

    public Integer getDirection() {
        return this.direction;
    }

    public WordsResultItem setProbability(Float probability) {
        this.probability = probability;
        return this;
    }

    public Float getProbability() {
        return this.probability;
    }

    public WordsResultItem setLocation(MixedMultiVehicleLocation location) {
        this.location = location;
        return this;
    }

    public MixedMultiVehicleLocation getLocation() {
        return this.location;
    }

    public WordsResultItem setLicenseInfo(List<LicenseInfoItem> licenseInfo) {
        this.licenseInfo = licenseInfo;
        return this;
    }

    public List<LicenseInfoItem> getLicenseInfo() {
        return this.licenseInfo;
    }

    @Override
    public String toString() {
        return "WordsResultItem{" + "cardType=" + cardType + "\n" + "direction=" + direction + "\n" + "probability=" + probability + "\n" + "location=" + location + "\n"
                + "licenseInfo=" + licenseInfo + "\n" + "}";
    }

}