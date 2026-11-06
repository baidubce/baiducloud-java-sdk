package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObtainSslEncryptionCertificateResponse extends BaseBceResponse {

    /**
    * ca证书内容
    */
    private String caContent;

    public String getCaContent() {
        return caContent;
    }

    public ObtainSslEncryptionCertificateResponse setCaContent(String caContent) {
        this.caContent = caContent;
        return this;
    }

    @Override
    public String toString() {
        return "ObtainSslEncryptionCertificateResponse{" + "caContent=" + caContent + "\n" + "}";
    }

}
