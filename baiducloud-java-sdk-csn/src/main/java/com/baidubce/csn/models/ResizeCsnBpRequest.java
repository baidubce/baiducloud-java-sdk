package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResizeCsnBpRequest extends BaseBceRequest {

    /**
    * csnBpId
    */
    @JsonIgnore
    private String csnBpId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * 升降级的带宽值，最大值为10000
    */
    private Integer bandwidth;

    public String getCsnBpId() {
        return csnBpId;
    }

    public ResizeCsnBpRequest setCsnBpId(String csnBpId) {
        this.csnBpId = csnBpId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ResizeCsnBpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getAction() {
        return action;
    }

    public ResizeCsnBpRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public ResizeCsnBpRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

}
