package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinesslicenseVerificationDetailedRequest extends BaseBceRequest {

    /**
    * 查询关键字段（企业名称、注册号、统一社会信用代码）
    */
    private String verifynum;

    public String getVerifynum() {
        return verifynum;
    }

    public BusinesslicenseVerificationDetailedRequest setVerifynum(String verifynum) {
        this.verifynum = verifynum;
        return this;
    }

}
