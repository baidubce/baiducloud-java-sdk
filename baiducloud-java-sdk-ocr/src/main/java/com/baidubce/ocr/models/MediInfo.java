package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediInfo {
    /**
     * 药品编码
     */
    @JsonProperty("medi_code")
    private String mediCode;

    /**
     * 药品名
     */
    @JsonProperty("medi_name")
    private String mediName;

    /**
     * 药品注册号
     */
    @JsonProperty("medi_register")
    private String mediRegister;

    /**
     * 医保类型
     */
    @JsonProperty("medi_type")
    private String mediType;

    /**
     * 医保目录的城市
     */
    @JsonProperty("medi_region")
    private String mediRegion;

    /**
     * 是否命中医保目录，1表示命中，0表示未命中
     */
    @JsonProperty("medi_check")
    private Integer mediCheck;

    public MediInfo setMediCode(String mediCode) {
        this.mediCode = mediCode;
        return this;
    }

    public String getMediCode() {
        return this.mediCode;
    }

    public MediInfo setMediName(String mediName) {
        this.mediName = mediName;
        return this;
    }

    public String getMediName() {
        return this.mediName;
    }

    public MediInfo setMediRegister(String mediRegister) {
        this.mediRegister = mediRegister;
        return this;
    }

    public String getMediRegister() {
        return this.mediRegister;
    }

    public MediInfo setMediType(String mediType) {
        this.mediType = mediType;
        return this;
    }

    public String getMediType() {
        return this.mediType;
    }

    public MediInfo setMediRegion(String mediRegion) {
        this.mediRegion = mediRegion;
        return this;
    }

    public String getMediRegion() {
        return this.mediRegion;
    }

    public MediInfo setMediCheck(Integer mediCheck) {
        this.mediCheck = mediCheck;
        return this;
    }

    public Integer getMediCheck() {
        return this.mediCheck;
    }

    @Override
    public String toString() {
        return "MediInfo{" + "mediCode=" + mediCode + "\n" + "mediName=" + mediName + "\n" + "mediRegister=" + mediRegister + "\n" + "mediType=" + mediType + "\n" + "mediRegion="
                + mediRegion + "\n" + "mediCheck=" + mediCheck + "\n" + "}";
    }

}