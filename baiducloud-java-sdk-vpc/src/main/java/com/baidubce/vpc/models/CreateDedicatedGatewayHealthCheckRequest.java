package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDedicatedGatewayHealthCheckRequest extends BaseBceRequest {

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
    * 若不传该参数，系统会自动分配一个IP
    */
    private String healthCheckSourceIp;

    /**
    * 参数可取值为"ICMP"，默认为"ICMP"
    */
    private String healthCheckType;

    /**
    * 健康检查的端口
    */
    private Integer healthCheckPort;

    /**
    * 健康检查的间隔，1-60之间的整数，单位s
    */
    private Integer healthCheckInterval;

    /**
    * 健康检查阈值，2-5之间的整数
    */
    private Integer healthThreshold;

    /**
    * 不健康检查阈值，2-5之间的整数
    */
    private Integer unhealthThreshold;

    /**
    * 是否自动生成探测路由，默认开启。如需关闭，选择false。
    */
    private Boolean autoGenerateRouteRule;

    public String getEtGatewayId() {
        return etGatewayId;
    }

    public CreateDedicatedGatewayHealthCheckRequest setEtGatewayId(String etGatewayId) {
        this.etGatewayId = etGatewayId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateDedicatedGatewayHealthCheckRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getHealthCheckSourceIp() {
        return healthCheckSourceIp;
    }

    public CreateDedicatedGatewayHealthCheckRequest setHealthCheckSourceIp(String healthCheckSourceIp) {
        this.healthCheckSourceIp = healthCheckSourceIp;
        return this;
    }

    public String getHealthCheckType() {
        return healthCheckType;
    }

    public CreateDedicatedGatewayHealthCheckRequest setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }

    public Integer getHealthCheckPort() {
        return healthCheckPort;
    }

    public CreateDedicatedGatewayHealthCheckRequest setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }

    public Integer getHealthCheckInterval() {
        return healthCheckInterval;
    }

    public CreateDedicatedGatewayHealthCheckRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }

    public Integer getHealthThreshold() {
        return healthThreshold;
    }

    public CreateDedicatedGatewayHealthCheckRequest setHealthThreshold(Integer healthThreshold) {
        this.healthThreshold = healthThreshold;
        return this;
    }

    public Integer getUnhealthThreshold() {
        return unhealthThreshold;
    }

    public CreateDedicatedGatewayHealthCheckRequest setUnhealthThreshold(Integer unhealthThreshold) {
        this.unhealthThreshold = unhealthThreshold;
        return this;
    }

    public Boolean getAutoGenerateRouteRule() {
        return autoGenerateRouteRule;
    }

    public CreateDedicatedGatewayHealthCheckRequest setAutoGenerateRouteRule(Boolean autoGenerateRouteRule) {
        this.autoGenerateRouteRule = autoGenerateRouteRule;
        return this;
    }

}
