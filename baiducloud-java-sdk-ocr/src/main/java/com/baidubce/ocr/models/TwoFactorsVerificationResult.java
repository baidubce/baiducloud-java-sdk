package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TwoFactorsVerificationResult {
    /**
     * 核验结果
     */
    private String verifyresult;

    /**
     * 企业名称匹配结果
     */
    private String companymatch;

    /**
     * 统一社会信用代码匹配结果
     */
    private String regnummatch;

    public TwoFactorsVerificationResult setVerifyresult(String verifyresult) {
        this.verifyresult = verifyresult;
        return this;
    }

    public String getVerifyresult() {
        return this.verifyresult;
    }

    public TwoFactorsVerificationResult setCompanymatch(String companymatch) {
        this.companymatch = companymatch;
        return this;
    }

    public String getCompanymatch() {
        return this.companymatch;
    }

    public TwoFactorsVerificationResult setRegnummatch(String regnummatch) {
        this.regnummatch = regnummatch;
        return this;
    }

    public String getRegnummatch() {
        return this.regnummatch;
    }

    @Override
    public String toString() {
        return "TwoFactorsVerificationResult{" + "verifyresult=" + verifyresult + "\n" + "companymatch=" + companymatch + "\n" + "regnummatch=" + regnummatch + "\n" + "}";
    }

}