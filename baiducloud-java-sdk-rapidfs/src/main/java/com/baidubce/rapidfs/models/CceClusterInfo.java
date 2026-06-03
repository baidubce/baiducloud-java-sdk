package com.baidubce.rapidfs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CceClusterInfo {
    /**
     * CCE 集群 ID
     */
    private String clusterId;

    /**
     * 集群名称（排序键）
     */
    private String clusterName;

    /**
     * 集群关联的可用区列表
     */
    private List<String> zones;

    public CceClusterInfo setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return this.clusterId;
    }

    public CceClusterInfo setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    public String getClusterName() {
        return this.clusterName;
    }

    public CceClusterInfo setZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    public List<String> getZones() {
        return this.zones;
    }

    @Override
    public String toString() {
        return "CceClusterInfo{" + "clusterId=" + clusterId + "\n" + "clusterName=" + clusterName + "\n" + "zones=" + zones + "\n" + "}";
    }

}