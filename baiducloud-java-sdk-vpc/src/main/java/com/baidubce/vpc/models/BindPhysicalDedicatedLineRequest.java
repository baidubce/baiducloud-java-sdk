package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindPhysicalDedicatedLineRequest extends BaseBceRequest {

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
    * 绑定的物理专线的ID，etid和channelId必须同时存在
    */
    private String etId;

    /**
    * 绑定的专线通道的ID，etid和channelId必须同时存在
    */
    private String channelId;

    /**
    * 专线网关的云端网络，用户可以选本VPC网段或自定义一个或多个网段
    */
    private List<String> localCidrs;

    public String getEtGatewayId() {
        return etGatewayId;
    }

    public BindPhysicalDedicatedLineRequest setEtGatewayId(String etGatewayId) {
        this.etGatewayId = etGatewayId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public BindPhysicalDedicatedLineRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getEtId() {
        return etId;
    }

    public BindPhysicalDedicatedLineRequest setEtId(String etId) {
        this.etId = etId;
        return this;
    }

    public String getChannelId() {
        return channelId;
    }

    public BindPhysicalDedicatedLineRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    public List<String> getLocalCidrs() {
        return localCidrs;
    }

    public BindPhysicalDedicatedLineRequest setLocalCidrs(List<String> localCidrs) {
        this.localCidrs = localCidrs;
        return this;
    }

}
