package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FourFactorsVerificationRequest extends BaseBceRequest {

    /**
    * 法人姓名
    */
    private String name;

    /**
    * 法人证件号码
    */
    private String idcard;

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

    public FourFactorsVerificationRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getIdcard() {
        return idcard;
    }

    public FourFactorsVerificationRequest setIdcard(String idcard) {
        this.idcard = idcard;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public FourFactorsVerificationRequest setCompany(String company) {
        this.company = company;
        return this;
    }

    public String getRegnum() {
        return regnum;
    }

    public FourFactorsVerificationRequest setRegnum(String regnum) {
        this.regnum = regnum;
        return this;
    }

}
