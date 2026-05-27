package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchDeleteEniIpRequest extends BaseBceRequest {

    /**
    * eniId
    */
    @JsonIgnore
    private String eniId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 指定的内网IP信息，可指定IPv4或IPv6地址，单次最多指定10个
    */
    private List<String> privateIpAddresses;

    public String getEniId() {
        return eniId;
    }

    public BatchDeleteEniIpRequest setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public BatchDeleteEniIpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getPrivateIpAddresses() {
        return privateIpAddresses;
    }

    public BatchDeleteEniIpRequest setPrivateIpAddresses(List<String> privateIpAddresses) {
        this.privateIpAddresses = privateIpAddresses;
        return this;
    }

}
