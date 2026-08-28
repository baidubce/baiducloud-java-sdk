package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SealRecogResult {
    /**
     * location
     */
    private DocAnaysisOfficeLocation location;

    /**
     * 每一个印章的置信度值
     */
    private Double probability;

    /**
     * 印章的类别，circle（圆章），ellipse（椭圆章），rectangle（方章）
     */
    private String type;

    /**
     * major
     */
    private SealField major;

    /**
     * 印章内其他字段信息
     */
    private List<SealField> minor;

    public SealRecogResult setLocation(DocAnaysisOfficeLocation location) {
        this.location = location;
        return this;
    }

    public DocAnaysisOfficeLocation getLocation() {
        return this.location;
    }

    public SealRecogResult setProbability(Double probability) {
        this.probability = probability;
        return this;
    }

    public Double getProbability() {
        return this.probability;
    }

    public SealRecogResult setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public SealRecogResult setMajor(SealField major) {
        this.major = major;
        return this;
    }

    public SealField getMajor() {
        return this.major;
    }

    public SealRecogResult setMinor(List<SealField> minor) {
        this.minor = minor;
        return this;
    }

    public List<SealField> getMinor() {
        return this.minor;
    }

    @Override
    public String toString() {
        return "SealRecogResult{" + "location=" + location + "\n" + "probability=" + probability + "\n" + "type=" + type + "\n" + "major=" + major + "\n" + "minor=" + minor + "\n"
                + "}";
    }

}