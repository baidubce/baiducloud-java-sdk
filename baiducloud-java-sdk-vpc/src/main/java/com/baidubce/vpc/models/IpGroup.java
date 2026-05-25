package com.baidubce.vpc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IpGroup {
    /**
     * IP地址族的ID
     */
    private String ipGroupId;

    /**
     * IP地址族的名称
     */
    private String name;

    /**
     * IP地址族的描述
     */
    private String description;

    /**
     * ipVersion，取值IPv4或IPv6
     */
    private String ipVersion;

    /**
     * 关联的IP地址组ID列表
     */
    private List<String> ipSetIds;

    /**
     * IP地址族绑定实例数量
     */
    private Integer bindedInstanceNum;

    public IpGroup setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    public String getIpGroupId() {
        return this.ipGroupId;
    }

    public IpGroup setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public IpGroup setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public IpGroup setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public String getIpVersion() {
        return this.ipVersion;
    }

    public IpGroup setIpSetIds(List<String> ipSetIds) {
        this.ipSetIds = ipSetIds;
        return this;
    }

    public List<String> getIpSetIds() {
        return this.ipSetIds;
    }

    public IpGroup setBindedInstanceNum(Integer bindedInstanceNum) {
        this.bindedInstanceNum = bindedInstanceNum;
        return this;
    }

    public Integer getBindedInstanceNum() {
        return this.bindedInstanceNum;
    }

    @Override
    public String toString() {
        return "IpGroup{" + "ipGroupId=" + ipGroupId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "ipVersion=" + ipVersion + "\n" + "ipSetIds="
                + ipSetIds + "\n" + "bindedInstanceNum=" + bindedInstanceNum + "\n" + "}";
    }

}