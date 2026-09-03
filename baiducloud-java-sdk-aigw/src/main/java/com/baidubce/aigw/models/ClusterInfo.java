package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClusterInfo {
    /**
     * CCE 集群 ID
     */
    private String clusterId;

    /**
     * CCE 集群名称
     */
    private String clusterName;

    public ClusterInfo setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return this.clusterId;
    }

    public ClusterInfo setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    public String getClusterName() {
        return this.clusterName;
    }

    @Override
    public String toString() {
        return "ClusterInfo{" + "clusterId=" + clusterId + "\n" + "clusterName=" + clusterName + "\n" + "}";
    }

}