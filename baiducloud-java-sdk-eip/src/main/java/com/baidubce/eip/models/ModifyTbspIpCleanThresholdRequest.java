package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyTbspIpCleanThresholdRequest extends BaseBceRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * DDoS增强防护包防护对象IP地址
    */
    private String ip;

    /**
    * 防护对象IP清洗阈值设置类型，包含按带宽上限 (bandwidth)、智能阈值 (auto) 和手动设置 (manual)
    */
    private String thresholdType;

    /**
    * 每秒流量带宽Mbps，最小值为120Mbps，最大值为10000Mbps (当清洗阈值设置类型为manual时必填)
    */
    private Integer cleanMbps;

    /**
    * 每秒报文数pps，最小值为58594pps，最大值为4882813pps (当清洗阈值设置类型为manual时必填)
    */
    private Integer cleanPps;

    public String getId() {
        return id;
    }

    public ModifyTbspIpCleanThresholdRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ModifyTbspIpCleanThresholdRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public ModifyTbspIpCleanThresholdRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getThresholdType() {
        return thresholdType;
    }

    public ModifyTbspIpCleanThresholdRequest setThresholdType(String thresholdType) {
        this.thresholdType = thresholdType;
        return this;
    }

    public Integer getCleanMbps() {
        return cleanMbps;
    }

    public ModifyTbspIpCleanThresholdRequest setCleanMbps(Integer cleanMbps) {
        this.cleanMbps = cleanMbps;
        return this;
    }

    public Integer getCleanPps() {
        return cleanPps;
    }

    public ModifyTbspIpCleanThresholdRequest setCleanPps(Integer cleanPps) {
        this.cleanPps = cleanPps;
        return this;
    }

}
