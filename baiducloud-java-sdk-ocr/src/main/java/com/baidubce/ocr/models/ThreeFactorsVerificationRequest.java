package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ThreeFactorsVerificationRequest extends BaseBceRequest {

    /**
    * 法人姓名
    */
    private String name;

    /**
    * 企业名称
    */
    private String company;

    /**
    * 社会统一信用代码
    */
    private String regnum;

    public String getName() {
        return name;
    }

    public ThreeFactorsVerificationRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public ThreeFactorsVerificationRequest setCompany(String company) {
        this.company = company;
        return this;
    }

    public String getRegnum() {
        return regnum;
    }

    public ThreeFactorsVerificationRequest setRegnum(String regnum) {
        this.regnum = regnum;
        return this;
    }

}
