package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPublicNetworkConfigResponse extends BaseBceResponse {

    /**
    * 公网访问域名
    */
    private String domain;

    /**
    * 公网访问入口状态，取值包含：opened、opening、closing、closed
    */
    private String status;

    /**
    * 白名单列表
    */
    private List<Whitelist> whitelist;

    public String getDomain() {
        return domain;
    }

    public GetPublicNetworkConfigResponse setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GetPublicNetworkConfigResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public List<Whitelist> getWhitelist() {
        return whitelist;
    }

    public GetPublicNetworkConfigResponse setWhitelist(List<Whitelist> whitelist) {
        this.whitelist = whitelist;
        return this;
    }

    @Override
    public String toString() {
        return "GetPublicNetworkConfigResponse{" + "domain=" + domain + "\n" + "status=" + status + "\n" + "whitelist=" + whitelist + "\n" + "}";
    }

}
