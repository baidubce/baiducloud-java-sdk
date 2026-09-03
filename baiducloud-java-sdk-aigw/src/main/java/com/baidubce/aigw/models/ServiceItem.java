package com.baidubce.aigw.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceItem {
    /**
     * 服务名称
     */
    private String serviceName;

    /**
     * 服务绑定的集群 ID 列表
     */
    private List<String> clusterIds;

    public ServiceItem setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public ServiceItem setClusterIds(List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }

    public List<String> getClusterIds() {
        return this.clusterIds;
    }

    @Override
    public String toString() {
        return "ServiceItem{" + "serviceName=" + serviceName + "\n" + "clusterIds=" + clusterIds + "\n" + "}";
    }

}