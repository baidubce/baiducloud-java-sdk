package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObtainSslEncryptionInformationResponse extends BaseBceResponse {

    /**
    * sslState
    */
    private SslState sslState;

    public SslState getSslState() {
        return sslState;
    }

    public ObtainSslEncryptionInformationResponse setSslState(SslState sslState) {
        this.sslState = sslState;
        return this;
    }

    @Override
    public String toString() {
        return "ObtainSslEncryptionInformationResponse{" + "sslState=" + sslState + "\n" + "}";
    }

}
