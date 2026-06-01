package com.baidubce.et.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnableDedicatedChannelIpv6Request extends BaseBceRequest {

    /**
    * etId
    */
    @JsonIgnore
    private String etId;

    /**
    * etChannelId
    */
    @JsonIgnore
    private String etChannelId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 云端网络侧IPv6互联地址
    */
    private String baiduIpv6Address;

    /**
    * IDC侧IPv6互联地址
    */
    private String customerIpv6Address;

    /**
    * IPv6路由参数，通道路由类型为静态路由时必填
    */
    private List<String> ipv6Networks;

    public String getEtId() {
        return etId;
    }

    public EnableDedicatedChannelIpv6Request setEtId(String etId) {
        this.etId = etId;
        return this;
    }

    public String getEtChannelId() {
        return etChannelId;
    }

    public EnableDedicatedChannelIpv6Request setEtChannelId(String etChannelId) {
        this.etChannelId = etChannelId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public EnableDedicatedChannelIpv6Request setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getBaiduIpv6Address() {
        return baiduIpv6Address;
    }

    public EnableDedicatedChannelIpv6Request setBaiduIpv6Address(String baiduIpv6Address) {
        this.baiduIpv6Address = baiduIpv6Address;
        return this;
    }

    public String getCustomerIpv6Address() {
        return customerIpv6Address;
    }

    public EnableDedicatedChannelIpv6Request setCustomerIpv6Address(String customerIpv6Address) {
        this.customerIpv6Address = customerIpv6Address;
        return this;
    }

    public List<String> getIpv6Networks() {
        return ipv6Networks;
    }

    public EnableDedicatedChannelIpv6Request setIpv6Networks(List<String> ipv6Networks) {
        this.ipv6Networks = ipv6Networks;
        return this;
    }

}
