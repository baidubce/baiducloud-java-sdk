package com.baidubce.csn.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCsnResponse extends BaseBceResponse {

    /**
    * 云智能网的ID
    */
    private String csnId;

    public String getCsnId() {
        return csnId;
    }

    public CreateCsnResponse setCsnId(String csnId) {
        this.csnId = csnId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateCsnResponse{" + "csnId=" + csnId + "\n" + "}";
    }

}
