package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheSpecifiedIpAddressGroupResponse extends BaseBceResponse {

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
    * IP地址组绑定的实例
    */
    private List<IpCollectionBindedInstance> bindedInstances;

    public String getIpSetId() {
        return ipSetId;
    }

    public QueryTheSpecifiedIpAddressGroupResponse setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }

    public String getName() {
        return name;
    }

    public QueryTheSpecifiedIpAddressGroupResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public QueryTheSpecifiedIpAddressGroupResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getIpVersion() {
        return ipVersion;
    }

    public QueryTheSpecifiedIpAddressGroupResponse setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public List<TemplateIpAddressInfo> getIpAddressInfo() {
        return ipAddressInfo;
    }

    public QueryTheSpecifiedIpAddressGroupResponse setIpAddressInfo(List<TemplateIpAddressInfo> ipAddressInfo) {
        this.ipAddressInfo = ipAddressInfo;
        return this;
    }

    public List<IpCollectionBindedInstance> getBindedInstances() {
        return bindedInstances;
    }

    public QueryTheSpecifiedIpAddressGroupResponse setBindedInstances(List<IpCollectionBindedInstance> bindedInstances) {
        this.bindedInstances = bindedInstances;
        return this;
    }

    @Override
    public String toString() {
        return "QueryTheSpecifiedIpAddressGroupResponse{" + "ipSetId=" + ipSetId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "ipVersion=" + ipVersion
                + "\n" + "ipAddressInfo=" + ipAddressInfo + "\n" + "bindedInstances=" + bindedInstances + "\n" + "}";
    }

}
