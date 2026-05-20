package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateDedicatedGatewayRequest extends BaseBceRequest {

    /**
    * etGatewayId
    */
    @JsonIgnore
    private String etGatewayId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 专线网关的名称，由大小写字母、数字以及-_ /.特殊字符组成，必须以字母开头，长度1-65
    */
    private String name;

    /**
    * 专线网关带宽的限速值，单位为Mbps。限制为2~100000之间的整数
    */
    private Integer speed;

    /**
    * 专线网关的描述，不超过200字符
    */
    private String description;

    /**
    * 专线网关的IPv4云端网络，用户可以选本VPC网段或自定义一个或多个网段
    */
    private List<String> localCidrs;

    /**
    * IPv6功能是否开启，1是0否，IPv6为白名单功能
    */
    private Integer enableIpv6;

    /**
    * 专线网关的IPv6云端网络，用户可以选本VPC网段或自定义一个或多个IPv6网段
    */
    private List<String> ipv6LocalCidrs;

    public String getEtGatewayId() {
        return etGatewayId;
    }

    public UpdateDedicatedGatewayRequest setEtGatewayId(String etGatewayId) {
        this.etGatewayId = etGatewayId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateDedicatedGatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateDedicatedGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getSpeed() {
        return speed;
    }

    public UpdateDedicatedGatewayRequest setSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateDedicatedGatewayRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<String> getLocalCidrs() {
        return localCidrs;
    }

    public UpdateDedicatedGatewayRequest setLocalCidrs(List<String> localCidrs) {
        this.localCidrs = localCidrs;
        return this;
    }

    public Integer getEnableIpv6() {
        return enableIpv6;
    }

    public UpdateDedicatedGatewayRequest setEnableIpv6(Integer enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }

    public List<String> getIpv6LocalCidrs() {
        return ipv6LocalCidrs;
    }

    public UpdateDedicatedGatewayRequest setIpv6LocalCidrs(List<String> ipv6LocalCidrs) {
        this.ipv6LocalCidrs = ipv6LocalCidrs;
        return this;
    }

}
