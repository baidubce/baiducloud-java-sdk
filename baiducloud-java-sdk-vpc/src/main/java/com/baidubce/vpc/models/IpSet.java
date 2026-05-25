package com.baidubce.vpc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IpSet {
    /**
     * IP地址组的ID
     */
    private String ipSetId;

    /**
     * IP地址组的名称
     */
    private String name;

    /**
     * IP地址组的描述
     */
    private String description;

    /**
     * ipVersion，取值IPv4或IPv6
     */
    private String ipVersion;

    /**
     * 参数模板IP地址信息
     */
    private List<TemplateIpAddressInfo> ipAddressInfo;

    /**
     * IP地址组绑定实例数量
     */
    private Integer bindedInstanceNum;

    public IpSet setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }

    public String getIpSetId() {
        return this.ipSetId;
    }

    public IpSet setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public IpSet setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public IpSet setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public String getIpVersion() {
        return this.ipVersion;
    }

    public IpSet setIpAddressInfo(List<TemplateIpAddressInfo> ipAddressInfo) {
        this.ipAddressInfo = ipAddressInfo;
        return this;
    }

    public List<TemplateIpAddressInfo> getIpAddressInfo() {
        return this.ipAddressInfo;
    }

    public IpSet setBindedInstanceNum(Integer bindedInstanceNum) {
        this.bindedInstanceNum = bindedInstanceNum;
        return this;
    }

    public Integer getBindedInstanceNum() {
        return this.bindedInstanceNum;
    }

    @Override
    public String toString() {
        return "IpSet{" + "ipSetId=" + ipSetId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "ipVersion=" + ipVersion + "\n" + "ipAddressInfo="
                + ipAddressInfo + "\n" + "bindedInstanceNum=" + bindedInstanceNum + "\n" + "}";
    }

}