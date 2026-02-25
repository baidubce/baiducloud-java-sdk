package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EipBandwidthScalingCapacityRequest extends BaseBceRequest {

    /**
    * eip
    */
    @JsonIgnore
    private String eip;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 公网带宽，单位为Mbps。对于预付费(prepay)以及按带宽(bandwidth)类型的EIP，限制为1~200之间的整数，对于按流量(traffic)类型的EIP，限制为1~1000之间的整数。
    */
    private Integer newBandwidthInMbps;


    public String getEip() {
        return eip;
    }

    public EipBandwidthScalingCapacityRequest setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public EipBandwidthScalingCapacityRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getNewBandwidthInMbps() {
        return newBandwidthInMbps;
    }

    public EipBandwidthScalingCapacityRequest setNewBandwidthInMbps(Integer newBandwidthInMbps) {
        this.newBandwidthInMbps = newBandwidthInMbps;
        return this;
    }


}
