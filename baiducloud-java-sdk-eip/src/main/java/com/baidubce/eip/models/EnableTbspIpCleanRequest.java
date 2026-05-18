package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnableTbspIpCleanRequest extends BaseBceRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * ip
    */
    @JsonIgnore
    private String ip;

    public String getId() {
        return id;
    }

    public EnableTbspIpCleanRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public EnableTbspIpCleanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public EnableTbspIpCleanRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }

}
