package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckStatusResponse {
    /**
     * 集群中实例状态检查结果，有两种取值。Yes表示检查通过，No表示检查不通过。
     */
    private String clusterInstanceStatus;

    /**
     * 集群中实例拓扑信息检查结果，有两种取值。Yes表示检查通过，No表示检查不通过。
     */
    private String clusterTopology;

    /**
     * 实例探活检查结果，有两种取值。Yes表示检查通过，No表示检查不通过。
     */
    private String clusterMySQLIsAlived;

    /**
     * 集群延迟状态检查结果，有两种取值。Yes表示检查通过，No表示检查不通过。
     */
    private String clusterDelay;

    /**
     * 若实例属于热活组，检查热活组内leader是否非只读，follower是否只读
     */
    private String leaderReadOnly;

    public CheckStatusResponse setClusterInstanceStatus(String clusterInstanceStatus) {
        this.clusterInstanceStatus = clusterInstanceStatus;
        return this;
    }

    public String getClusterInstanceStatus() {
        return this.clusterInstanceStatus;
    }

    public CheckStatusResponse setClusterTopology(String clusterTopology) {
        this.clusterTopology = clusterTopology;
        return this;
    }

    public String getClusterTopology() {
        return this.clusterTopology;
    }

    public CheckStatusResponse setClusterMySQLIsAlived(String clusterMySQLIsAlived) {
        this.clusterMySQLIsAlived = clusterMySQLIsAlived;
        return this;
    }

    public String getClusterMySQLIsAlived() {
        return this.clusterMySQLIsAlived;
    }

    public CheckStatusResponse setClusterDelay(String clusterDelay) {
        this.clusterDelay = clusterDelay;
        return this;
    }

    public String getClusterDelay() {
        return this.clusterDelay;
    }

    public CheckStatusResponse setLeaderReadOnly(String leaderReadOnly) {
        this.leaderReadOnly = leaderReadOnly;
        return this;
    }

    public String getLeaderReadOnly() {
        return this.leaderReadOnly;
    }

    @Override
    public String toString() {
        return "CheckStatusResponse{" + "clusterInstanceStatus=" + clusterInstanceStatus + "\n" + "clusterTopology=" + clusterTopology + "\n" + "clusterMySQLIsAlived="
                + clusterMySQLIsAlived + "\n" + "clusterDelay=" + clusterDelay + "\n" + "leaderReadOnly=" + leaderReadOnly + "\n" + "}";
    }

}