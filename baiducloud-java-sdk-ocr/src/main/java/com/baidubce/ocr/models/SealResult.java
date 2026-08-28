package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SealResult {
    /**
     * 印章颜色，如 black
     */
    private String color;

    /**
     * 印章切图的 base64 编码，return_image=true 时返回
     */
    @JsonProperty("seal_image")
    private String sealImage;

    /**
     * location
     */
    private SealLocation location;

    /**
     * 每一个识别结果的置信度值
     */
    private Double probability;

    /**
     * 印章的类别，共有circle（圆章），ellipse（椭圆章），rectangle（方章），perforation（骑缝章）四种
     */
    private String type;

    /**
     * major
     */
    private SealRegField major;

    /**
     * 其他字段内容，即除主字段外的文字识别内容均放置于该参数中返回，数字编码也在该字段返回。若章内不存在其他字段文字，则该参数为空
     */
    private List<SealRegField> minor;

    public SealResult setColor(String color) {
        this.color = color;
        return this;
    }

    public String getColor() {
        return this.color;
    }

    public SealResult setSealImage(String sealImage) {
        this.sealImage = sealImage;
        return this;
    }

    public String getSealImage() {
        return this.sealImage;
    }

    public SealResult setLocation(SealLocation location) {
        this.location = location;
        return this;
    }

    public SealLocation getLocation() {
        return this.location;
    }

    public SealResult setProbability(Double probability) {
        this.probability = probability;
        return this;
    }

    public Double getProbability() {
        return this.probability;
    }

    public SealResult setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public SealResult setMajor(SealRegField major) {
        this.major = major;
        return this;
    }

    public SealRegField getMajor() {
        return this.major;
    }

    public SealResult setMinor(List<SealRegField> minor) {
        this.minor = minor;
        return this;
    }

    public List<SealRegField> getMinor() {
        return this.minor;
    }

    @Override
    public String toString() {
        return "SealResult{" + "color=" + color + "\n" + "sealImage=" + sealImage + "\n" + "location=" + location + "\n" + "probability=" + probability + "\n" + "type=" + type
                + "\n" + "major=" + major + "\n" + "minor=" + minor + "\n" + "}";
    }

}