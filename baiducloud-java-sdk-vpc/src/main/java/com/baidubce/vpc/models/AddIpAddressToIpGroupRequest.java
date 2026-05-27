package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddIpAddressToIpGroupRequest extends BaseBceRequest {

    /**
    * ipSetId
    */
    @JsonIgnore
    private String ipSetId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 添加的IP地址信息，其ipVersion需与指定的IP地址组保持一致，单次最多指定10个
    */
    private List<TemplateIpAddressInfo> ipAddressInfo;

    public String getIpSetId() {
        return ipSetId;
    }

    public AddIpAddressToIpGroupRequest setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public AddIpAddressToIpGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<TemplateIpAddressInfo> getIpAddressInfo() {
        return ipAddressInfo;
    }

    public AddIpAddressToIpGroupRequest setIpAddressInfo(List<TemplateIpAddressInfo> ipAddressInfo) {
        this.ipAddressInfo = ipAddressInfo;
        return this;
    }

}
