package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryIpv6GatewayResponse extends BaseBceResponse {

    /**
    * IPv6网关的Id
    */
    private String gatewayId;

    /**
    * IPv6网关的名称
    */
    private String name;

    /**
    * IPv6网关的带宽
    */
    private Integer bandwidthInMbps;

    /**
    * IPv6网关所属的vpc的Id
    */
    private String vpcId;

    /**
    * IPv6网关只出不进的列表
    */
    private List<EgressOnlyRule> egressOnlyRules;

    /**
    * IPv6网关限速策略的列表
    */
    private List<RateLimitRule> rateLimitRules;

    /**
    * 是否开启释放保护
    */
    private Boolean deleteProtect;

    public String getGatewayId() {
        return gatewayId;
    }

    public QueryIpv6GatewayResponse setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    public String getName() {
        return name;
    }

    public QueryIpv6GatewayResponse setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return bandwidthInMbps;
    }

    public QueryIpv6GatewayResponse setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public QueryIpv6GatewayResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public List<EgressOnlyRule> getEgressOnlyRules() {
        return egressOnlyRules;
    }

    public QueryIpv6GatewayResponse setEgressOnlyRules(List<EgressOnlyRule> egressOnlyRules) {
        this.egressOnlyRules = egressOnlyRules;
        return this;
    }

    public List<RateLimitRule> getRateLimitRules() {
        return rateLimitRules;
    }

    public QueryIpv6GatewayResponse setRateLimitRules(List<RateLimitRule> rateLimitRules) {
        this.rateLimitRules = rateLimitRules;
        return this;
    }

    public Boolean getDeleteProtect() {
        return deleteProtect;
    }

    public QueryIpv6GatewayResponse setDeleteProtect(Boolean deleteProtect) {
        this.deleteProtect = deleteProtect;
        return this;
    }

    @Override
    public String toString() {
        return "QueryIpv6GatewayResponse{" + "gatewayId=" + gatewayId + "\n" + "name=" + name + "\n" + "bandwidthInMbps=" + bandwidthInMbps + "\n" + "vpcId=" + vpcId + "\n"
                + "egressOnlyRules=" + egressOnlyRules + "\n" + "rateLimitRules=" + rateLimitRules + "\n" + "deleteProtect=" + deleteProtect + "\n" + "}";
    }

}
