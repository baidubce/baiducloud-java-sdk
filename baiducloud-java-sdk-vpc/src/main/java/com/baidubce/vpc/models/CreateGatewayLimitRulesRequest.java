package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateGatewayLimitRulesRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * IP协议版本,当前取值4
    */
    private String ipVersion;

    /**
    * 规则名称,需满足名称规则。支持大小写字母、数字以及-_ /.特殊字符，必须以字母开头，长度1-65
    */
    private String name;

    /**
    * 描述信息。长度0-200
    */
    private String description;

    /**
    * 服务类型(peerconn,et,csn)<br/>peerconn-对等连接<br/>et-专线网关<br/>csn-云智能网
    */
    private String serviceType;

    /**
    * 子服务类型，当serviceType="csn"时,必传。<br/>LOCAL-网络实例带宽类型。<br>PEER_CLOUD-夸地域带宽云间互通<br/>PEER_EDGE-云边互通
    */
    private String subServiceType;

    /**
    * 当subServiceType是PEER_CLOUD或PEER_EDGE时必传。表示对端地域。例如华北-北京传递"bj",华北保定传递"bd"
    */
    private String peerRegion;

    /**
    * 资源ID，对等连接ID或网关ID。当subServiceType="LOCAL"时候，该resourceId="csnId:vpcId"。当subServiceType="PEER_CLOUD"时为csnId
    */
    private String resourceId;

    /**
    * 限速方向: egress
    */
    private String direction;

    /**
    * 源网段CIDR,当前限流规则对当前设置的CIDR源网段生效。
    */
    private String cidr;

    /**
    * 带宽,Mbps,上限取决于具体网关的最大带宽。
    */
    private Integer bandwidth;

    public String getClientToken() {
        return clientToken;
    }

    public CreateGatewayLimitRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getIpVersion() {
        return ipVersion;
    }

    public CreateGatewayLimitRulesRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateGatewayLimitRulesRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateGatewayLimitRulesRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getServiceType() {
        return serviceType;
    }

    public CreateGatewayLimitRulesRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public String getSubServiceType() {
        return subServiceType;
    }

    public CreateGatewayLimitRulesRequest setSubServiceType(String subServiceType) {
        this.subServiceType = subServiceType;
        return this;
    }

    public String getPeerRegion() {
        return peerRegion;
    }

    public CreateGatewayLimitRulesRequest setPeerRegion(String peerRegion) {
        this.peerRegion = peerRegion;
        return this;
    }

    public String getResourceId() {
        return resourceId;
    }

    public CreateGatewayLimitRulesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public String getDirection() {
        return direction;
    }

    public CreateGatewayLimitRulesRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getCidr() {
        return cidr;
    }

    public CreateGatewayLimitRulesRequest setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public CreateGatewayLimitRulesRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

}
