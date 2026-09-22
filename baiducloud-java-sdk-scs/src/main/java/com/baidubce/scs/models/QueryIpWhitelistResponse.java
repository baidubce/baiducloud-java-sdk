package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryIpWhitelistResponse extends BaseBceResponse {

    /**
    * IP白名单列表, 包括常规地址: 如192\\.168\\.0\\.1，CIDR地址: 如192\\.168\\.1\\.0/24，0\\.0\\.0\\.0/0代表允许所有地址
    */
    private List<String> securityIps;

    public List<String> getSecurityIps() {
        return securityIps;
    }

    public QueryIpWhitelistResponse setSecurityIps(List<String> securityIps) {
        this.securityIps = securityIps;
        return this;
    }

    @Override
    public String toString() {
        return "QueryIpWhitelistResponse{" + "securityIps=" + securityIps + "\n" + "}";
    }

}
