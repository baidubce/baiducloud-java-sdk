package com.baidubce.csn.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCsnBpResponse extends BaseBceResponse {

    /**
    * 带宽包的ID
    */
    private String csnBpId;

    public String getCsnBpId() {
        return csnBpId;
    }

    public CreateCsnBpResponse setCsnBpId(String csnBpId) {
        this.csnBpId = csnBpId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateCsnBpResponse{" + "csnBpId=" + csnBpId + "\n" + "}";
    }

}
