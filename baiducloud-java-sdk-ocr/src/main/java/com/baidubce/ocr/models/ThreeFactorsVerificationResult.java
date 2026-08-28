package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ThreeFactorsVerificationResult {
    /**
     * 核验结果
     */
    private String verifyresult;

    /**
     * 法人姓名匹配结果
     */
    private String namematch;

    /**
     * 企业名称匹配结果
     */
    private String companymatch;

    /**
     * 统一社会信用代码匹配结果
     */
    private String regnummatch;

    public ThreeFactorsVerificationResult setVerifyresult(String verifyresult) {
        this.verifyresult = verifyresult;
        return this;
    }

    public String getVerifyresult() {
        return this.verifyresult;
    }

    public ThreeFactorsVerificationResult setNamematch(String namematch) {
        this.namematch = namematch;
        return this;
    }

    public String getNamematch() {
        return this.namematch;
    }

    public ThreeFactorsVerificationResult setCompanymatch(String companymatch) {
        this.companymatch = companymatch;
        return this;
    }

    public String getCompanymatch() {
        return this.companymatch;
    }

    public ThreeFactorsVerificationResult setRegnummatch(String regnummatch) {
        this.regnummatch = regnummatch;
        return this;
    }

    public String getRegnummatch() {
        return this.regnummatch;
    }

    @Override
    public String toString() {
        return "ThreeFactorsVerificationResult{" + "verifyresult=" + verifyresult + "\n" + "namematch=" + namematch + "\n" + "companymatch=" + companymatch + "\n" + "regnummatch="
                + regnummatch + "\n" + "}";
    }

}