package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Autoscaler {
    /**
     * 集群 ID
     */
    private String clusterID;

    /**
     * 集群名称
     */
    private String clusterName;

    /**
     * caConfig
     */
    private CAConfig caConfig;

    public Autoscaler setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getClusterID() {
        return this.clusterID;
    }

    public Autoscaler setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    public String getClusterName() {
        return this.clusterName;
    }

    public Autoscaler setCaConfig(CAConfig caConfig) {
        this.caConfig = caConfig;
        return this;
    }

    public CAConfig getCaConfig() {
        return this.caConfig;
    }

    @Override
    public String toString() {
        return "Autoscaler{" + "clusterID=" + clusterID + "\n" + "clusterName=" + clusterName + "\n" + "caConfig=" + caConfig + "\n" + "}";
    }

}