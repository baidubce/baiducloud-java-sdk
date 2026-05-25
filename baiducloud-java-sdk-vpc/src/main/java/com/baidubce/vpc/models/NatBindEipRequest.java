package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NatBindEipRequest extends BaseBceRequest {

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
    * 绑定NAT网关的EIP列表；支持绑定多个EIP，多个EIP需在同一共享带宽内或者均不在任何共享带宽内。
    */
    private List<String> bindEips;

    public String getNatId() {
        return natId;
    }

    public NatBindEipRequest setNatId(String natId) {
        this.natId = natId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public NatBindEipRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getBindEips() {
        return bindEips;
    }

    public NatBindEipRequest setBindEips(List<String> bindEips) {
        this.bindEips = bindEips;
        return this;
    }

}
