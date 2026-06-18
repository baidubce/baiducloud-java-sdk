package com.baidubce.iam.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateSubUserIdpStatusResponse extends BaseBceResponse {

    /**
    * idp
    */
    private Idp idp;

    public Idp getIdp() {
        return idp;
    }

    public UpdateSubUserIdpStatusResponse setIdp(Idp idp) {
        this.idp = idp;
        return this;
    }

    @Override
    public String toString() {
        return "UpdateSubUserIdpStatusResponse{" + "idp=" + idp + "\n" + "}";
    }

}
