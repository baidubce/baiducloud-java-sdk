package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTLSCertificateUsingGETResponse extends BaseBceResponse {

    /**
    * caContent
    */
    private String caContent;

    public String getCaContent() {
        return caContent;
    }

    public GetTLSCertificateUsingGETResponse setCaContent(String caContent) {
        this.caContent = caContent;
        return this;
    }

    @Override
    public String toString() {
        return "GetTLSCertificateUsingGETResponse{" + "caContent=" + caContent + "\n" + "}";
    }

}
