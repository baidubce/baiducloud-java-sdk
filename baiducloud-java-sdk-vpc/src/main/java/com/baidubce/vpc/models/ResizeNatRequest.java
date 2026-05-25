package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResizeNatRequest extends BaseBceRequest {

    /**
    * natId
    */
    @JsonIgnore
    private String natId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * NAT网关变配的CU数量，取值1~100
    */
    private Integer cuNum;

    public String getNatId() {
        return natId;
    }

    public ResizeNatRequest setNatId(String natId) {
        this.natId = natId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ResizeNatRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getCuNum() {
        return cuNum;
    }

    public ResizeNatRequest setCuNum(Integer cuNum) {
        this.cuNum = cuNum;
        return this;
    }

}
