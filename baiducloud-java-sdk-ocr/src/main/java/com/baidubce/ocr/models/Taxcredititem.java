package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Taxcredititem {
    /**
     * 纳税人识别号
     */
    private String taxpayerno;

    /**
     * 纳税人名称
     */
    private String taxpayername;

    /**
     * 评价年度
     */
    private String year;

    /**
     * 信用等级
     */
    private String level;

    public Taxcredititem setTaxpayerno(String taxpayerno) {
        this.taxpayerno = taxpayerno;
        return this;
    }

    public String getTaxpayerno() {
        return this.taxpayerno;
    }

    public Taxcredititem setTaxpayername(String taxpayername) {
        this.taxpayername = taxpayername;
        return this;
    }

    public String getTaxpayername() {
        return this.taxpayername;
    }

    public Taxcredititem setYear(String year) {
        this.year = year;
        return this;
    }

    public String getYear() {
        return this.year;
    }

    public Taxcredititem setLevel(String level) {
        this.level = level;
        return this;
    }

    public String getLevel() {
        return this.level;
    }

    @Override
    public String toString() {
        return "Taxcredititem{" + "taxpayerno=" + taxpayerno + "\n" + "taxpayername=" + taxpayername + "\n" + "year=" + year + "\n" + "level=" + level + "\n" + "}";
    }

}