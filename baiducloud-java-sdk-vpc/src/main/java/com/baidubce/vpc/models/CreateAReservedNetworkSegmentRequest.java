package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAReservedNetworkSegmentRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 预留网段所属的子网ID
    */
    private String subnetId;

    /**
    * 预留网段的ip或cidr
    */
    private String ipCidr;

    /**
    * IP版本，支持IPv4和IPv6
    */
    private Integer ipVersion;

    /**
    * 预留网段描述
    */
    private String description;


    public String getClientToken() {
        return clientToken;
    }

    public CreateAReservedNetworkSegmentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public CreateAReservedNetworkSegmentRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getIpCidr() {
        return ipCidr;
    }

    public CreateAReservedNetworkSegmentRequest setIpCidr(String ipCidr) {
        this.ipCidr = ipCidr;
        return this;
    }

    public Integer getIpVersion() {
        return ipVersion;
    }

    public CreateAReservedNetworkSegmentRequest setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateAReservedNetworkSegmentRequest setDescription(String description) {
        this.description = description;
        return this;
    }


}
