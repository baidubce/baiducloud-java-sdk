package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinesslicenseStandardRequest extends BaseBceRequest {

    /**
    * 查询关键字段（企业名称、注册号、社会统一信用代码，可任意输入其中一种）
    */
    private String verifynum;

    public String getVerifynum() {
        return verifynum;
    }

    public BusinesslicenseStandardRequest setVerifynum(String verifynum) {
        this.verifynum = verifynum;
        return this;
    }

}
