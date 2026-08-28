package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FourFactorsVerificationResult {
    /**
     * 核验结果：返回值为: 1（四要素完全匹配） 0（四要素不完全匹配）
     */
    private String verifyresult;

    /**
     * 法人姓名匹配结果，1：匹配 0：不匹配 2：无法验证
     */
    private String namematch;

    /**
     * 注册证件号匹配结果，1：匹配 0：不匹配 2：无法验证
     */
    private String idnummatch;

    /**
     * 企业名称匹配结果，1：匹配 0：不匹配 2：无法验证
     */
    private String companymatch;

    /**
     * 统一社会信用代码匹配结果，1：匹配 0：不匹配 2：无法验证
     */
    private String regnummatch;

    public FourFactorsVerificationResult setVerifyresult(String verifyresult) {
        this.verifyresult = verifyresult;
        return this;
    }

    public String getVerifyresult() {
        return this.verifyresult;
    }

    public FourFactorsVerificationResult setNamematch(String namematch) {
        this.namematch = namematch;
        return this;
    }

    public String getNamematch() {
        return this.namematch;
    }

    public FourFactorsVerificationResult setIdnummatch(String idnummatch) {
        this.idnummatch = idnummatch;
        return this;
    }

    public String getIdnummatch() {
        return this.idnummatch;
    }

    public FourFactorsVerificationResult setCompanymatch(String companymatch) {
        this.companymatch = companymatch;
        return this;
    }

    public String getCompanymatch() {
        return this.companymatch;
    }

    public FourFactorsVerificationResult setRegnummatch(String regnummatch) {
        this.regnummatch = regnummatch;
        return this;
    }

    public String getRegnummatch() {
        return this.regnummatch;
    }

    @Override
    public String toString() {
        return "FourFactorsVerificationResult{" + "verifyresult=" + verifyresult + "\n" + "namematch=" + namematch + "\n" + "idnummatch=" + idnummatch + "\n" + "companymatch="
                + companymatch + "\n" + "regnummatch=" + regnummatch + "\n" + "}";
    }

}