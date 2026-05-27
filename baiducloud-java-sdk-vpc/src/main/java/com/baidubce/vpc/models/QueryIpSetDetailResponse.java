package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryIpSetDetailResponse extends BaseBceResponse {

    /**
    * IP地址族的ID
    */
    private String ipGroupId;

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
    * 关联的IP地址组ID列表
    */
    private List<String> ipSetIds;

    /**
    * IP地址族绑定的实例
    */
    private List<IpCollectionBindedInstance> bindedInstances;

    public String getIpGroupId() {
        return ipGroupId;
    }

    public QueryIpSetDetailResponse setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    public String getName() {
        return name;
    }

    public QueryIpSetDetailResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public QueryIpSetDetailResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getIpVersion() {
        return ipVersion;
    }

    public QueryIpSetDetailResponse setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public List<String> getIpSetIds() {
        return ipSetIds;
    }

    public QueryIpSetDetailResponse setIpSetIds(List<String> ipSetIds) {
        this.ipSetIds = ipSetIds;
        return this;
    }

    public List<IpCollectionBindedInstance> getBindedInstances() {
        return bindedInstances;
    }

    public QueryIpSetDetailResponse setBindedInstances(List<IpCollectionBindedInstance> bindedInstances) {
        this.bindedInstances = bindedInstances;
        return this;
    }

    @Override
    public String toString() {
        return "QueryIpSetDetailResponse{" + "ipGroupId=" + ipGroupId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "ipVersion=" + ipVersion + "\n"
                + "ipSetIds=" + ipSetIds + "\n" + "bindedInstances=" + bindedInstances + "\n" + "}";
    }

}
