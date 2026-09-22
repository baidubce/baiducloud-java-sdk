package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteIpWhitelistRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * IP白名单分组下的IP列表。包括常规地址: 如192\.168\.0\.1，CIDR地址: 如192\.168\.1\.0/24，0\.0\.0\.0/0代表允许所有地址
    */
    private List<String> securityIps;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteIpWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<String> getSecurityIps() {
        return securityIps;
    }

    public DeleteIpWhitelistRequest setSecurityIps(List<String> securityIps) {
        this.securityIps = securityIps;
        return this;
    }

}
