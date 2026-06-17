package com.baidubce.sts.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSessionTokenResponse extends BaseBceResponse {

    /**
    * 生成的临时身份凭证
    */
    private String credential;

    public String getCredential() {
        return credential;
    }

    public GetSessionTokenResponse setCredential(String credential) {
        this.credential = credential;
        return this;
    }

    @Override
    public String toString() {
        return "GetSessionTokenResponse{" + "credential=" + credential + "\n" + "}";
    }

}
