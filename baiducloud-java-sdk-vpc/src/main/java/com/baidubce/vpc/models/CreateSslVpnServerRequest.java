package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSslVpnServerRequest extends BaseBceRequest {

    /**
    * vpnId
    */
    @JsonIgnore
    private String vpnId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * SSL-VPN服务端实例名称，大小写字母、数字以及-_/.特殊字符，必须以字母开头，长度1-65
    */
    private String sslVpnServerName;

    /**
    * SSL-VPN服务端接口类型。取值[tap, tun]，默认为“tap”
    */
    private String interfaceType;

    /**
    * 本端网络CIDR列表
    */
    private List<String> localSubnets;

    /**
    * 客户端网络CIDR
    */
    private String remoteSubnet;

    /**
    * 客户端的DNS地址
    */
    private String clientDns;

    public String getVpnId() {
        return vpnId;
    }

    public CreateSslVpnServerRequest setVpnId(String vpnId) {
        this.vpnId = vpnId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateSslVpnServerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getSslVpnServerName() {
        return sslVpnServerName;
    }

    public CreateSslVpnServerRequest setSslVpnServerName(String sslVpnServerName) {
        this.sslVpnServerName = sslVpnServerName;
        return this;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public CreateSslVpnServerRequest setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
        return this;
    }

    public List<String> getLocalSubnets() {
        return localSubnets;
    }

    public CreateSslVpnServerRequest setLocalSubnets(List<String> localSubnets) {
        this.localSubnets = localSubnets;
        return this;
    }

    public String getRemoteSubnet() {
        return remoteSubnet;
    }

    public CreateSslVpnServerRequest setRemoteSubnet(String remoteSubnet) {
        this.remoteSubnet = remoteSubnet;
        return this;
    }

    public String getClientDns() {
        return clientDns;
    }

    public CreateSslVpnServerRequest setClientDns(String clientDns) {
        this.clientDns = clientDns;
        return this;
    }

}
