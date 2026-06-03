package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddPublicNetworkWhitelistRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 白名单IP地址，输入单个IPV4地址或CIDR地址段
    */
    private String ipAddr;

    /**
    * 白名单描述
    */
    private String description;

    public String getInstanceId() {
        return instanceId;
    }

    public AddPublicNetworkWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public AddPublicNetworkWhitelistRequest setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AddPublicNetworkWhitelistRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
