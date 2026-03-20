package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SharedBandwidthInquiryRequest extends BaseBceRequest {

    /**
    * 公网带宽，单位为Mbps。限制为为1~200之间的整数。
    */
    private Integer bandwidthInMbps;

    /**
    * 共享带宽的数量，默认为1。
    */
    private Integer count;

    /**
    * 共享带宽中的IP数量。
    */
    private Integer ipNum;

    /**
    * billing
    */
    private Billing billing;

    public Integer getBandwidthInMbps() {
        return bandwidthInMbps;
    }

    public SharedBandwidthInquiryRequest setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public SharedBandwidthInquiryRequest setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getIpNum() {
        return ipNum;
    }

    public SharedBandwidthInquiryRequest setIpNum(Integer ipNum) {
        this.ipNum = ipNum;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public SharedBandwidthInquiryRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

}
