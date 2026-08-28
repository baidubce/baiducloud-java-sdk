package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TwoFactorsVerificationRequest extends BaseBceRequest {

    /**
    * 企业名称
    */
    private String company;

    /**
    * 社会统一信用代码
    */
    private String regnum;

    public String getCompany() {
        return company;
    }

    public TwoFactorsVerificationRequest setCompany(String company) {
        this.company = company;
        return this;
    }

    public String getRegnum() {
        return regnum;
    }

    public TwoFactorsVerificationRequest setRegnum(String regnum) {
        this.regnum = regnum;
        return this;
    }

}
