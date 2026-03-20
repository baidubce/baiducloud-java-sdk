package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BandwidthPackageInquiryRequest extends BaseBceRequest {

    /**
    * 公网带宽，单位为Mbps。对于使用带宽计费的EIP，限制为为1~200之间的整数（代表带宽上限）。
    */
    private Integer bandwidthInMbps;

    /**
    * EIP数量，默认为1。
    */
    private Integer count;

    /**
    * 带宽包的类型，包括BandwidthPackage（带宽包）和AccelerationPackage（跨境加速包），其中跨境加速包仅支持中国香港区域，默认为BandwidthPackage
    */
    private String type;

    public Integer getBandwidthInMbps() {
        return bandwidthInMbps;
    }

    public BandwidthPackageInquiryRequest setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public BandwidthPackageInquiryRequest setCount(Integer count) {
        this.count = count;
        return this;
    }

    public String getType() {
        return type;
    }

    public BandwidthPackageInquiryRequest setType(String type) {
        this.type = type;
        return this;
    }

}
