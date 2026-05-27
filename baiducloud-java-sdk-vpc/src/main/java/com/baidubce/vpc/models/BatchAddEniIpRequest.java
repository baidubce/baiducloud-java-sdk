package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchAddEniIpRequest extends BaseBceRequest {

    /**
    * eniId
    */
    @JsonIgnore
    private String eniId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 是否IPv6地址，true表示分配IPv6地址，默认false分配IPv4地址
    */
    private Boolean isIpv6;

    /**
    * 指定的内网IP信息，单次最多指定10个，与privateIpAddressCount至少提供一个
    */
    private List<String> privateIpAddresses;

    /**
    * 新申请的内网IP地址个数，最大为10，与privateIpAddresses至少提供一个
    */
    private Integer privateIpAddressCount;

    public String getEniId() {
        return eniId;
    }

    public BatchAddEniIpRequest setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public BatchAddEniIpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Boolean getIsIpv6() {
        return isIpv6;
    }

    public BatchAddEniIpRequest setIsIpv6(Boolean isIpv6) {
        this.isIpv6 = isIpv6;
        return this;
    }

    public List<String> getPrivateIpAddresses() {
        return privateIpAddresses;
    }

    public BatchAddEniIpRequest setPrivateIpAddresses(List<String> privateIpAddresses) {
        this.privateIpAddresses = privateIpAddresses;
        return this;
    }

    public Integer getPrivateIpAddressCount() {
        return privateIpAddressCount;
    }

    public BatchAddEniIpRequest setPrivateIpAddressCount(Integer privateIpAddressCount) {
        this.privateIpAddressCount = privateIpAddressCount;
        return this;
    }

}
