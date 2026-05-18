package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateBaseDdosThresholdRequest extends BaseBceRequest {

    /**
    * ip
    */
    @JsonIgnore
    private String ip;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 清洗阈值设置类型，包含按带宽上限 (bandwidth)、智能阈值 (auto) 和手动设置 (manual)
    */
    private String thresholdType;

    /**
    * 每秒流量带宽Mbps，最小值为120Mbps，最大值为5000Mbps (当清洗阈值设置类型为manual时必填)
    */
    private Long ipCleanMbps;

    /**
    * 每秒报文数pps，最小值为58594pps，最大值为4882813pps (当清洗阈值设置类型为manual时必填)
    */
    private Long ipCleanPps;

    public String getIp() {
        return ip;
    }

    public UpdateBaseDdosThresholdRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateBaseDdosThresholdRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getThresholdType() {
        return thresholdType;
    }

    public UpdateBaseDdosThresholdRequest setThresholdType(String thresholdType) {
        this.thresholdType = thresholdType;
        return this;
    }

    public Long getIpCleanMbps() {
        return ipCleanMbps;
    }

    public UpdateBaseDdosThresholdRequest setIpCleanMbps(Long ipCleanMbps) {
        this.ipCleanMbps = ipCleanMbps;
        return this;
    }

    public Long getIpCleanPps() {
        return ipCleanPps;
    }

    public UpdateBaseDdosThresholdRequest setIpCleanPps(Long ipCleanPps) {
        this.ipCleanPps = ipCleanPps;
        return this;
    }

}
