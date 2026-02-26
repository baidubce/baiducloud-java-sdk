package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddTbspIpWhitelistRequest extends BaseBceRequest {

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
    * DDoS增强防护包防护对象IP地址
    */
    private String ip;

    /**
    * IP白名单网段列表 (完整IP地址格式或IP网段格式)
    */
    private List<String> ipCidrList;


    public String getId() {
        return id;
    }

    public AddTbspIpWhitelistRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public AddTbspIpWhitelistRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public AddTbspIpWhitelistRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public List<String> getIpCidrList() {
        return ipCidrList;
    }

    public AddTbspIpWhitelistRequest setIpCidrList(List<String> ipCidrList) {
        this.ipCidrList = ipCidrList;
        return this;
    }


}
