package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NatUnBindEipRequest extends BaseBceRequest {

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
    * 解绑的EIP列表
    */
    private List<String> bindEips;

    public String getNatId() {
        return natId;
    }

    public NatUnBindEipRequest setNatId(String natId) {
        this.natId = natId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public NatUnBindEipRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getBindEips() {
        return bindEips;
    }

    public NatUnBindEipRequest setBindEips(List<String> bindEips) {
        this.bindEips = bindEips;
        return this;
    }

}
