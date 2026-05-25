package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateNatResponse extends BaseBceResponse {

    /**
    * 创建的NAT的ID
    */
    private String natId;

    public String getNatId() {
        return natId;
    }

    public CreateNatResponse setNatId(String natId) {
        this.natId = natId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateNatResponse{" + "natId=" + natId + "\n" + "}";
    }

}
