package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckList {
    /**
     * 集群实例状态是否正常。Yes表示检查通过，No表示检查不通过。
     */
    private String clusterInstanceStatus;

    /**
     * 集群拓扑是否正常。Yes表示检查通过，No表示检查不通过。
     */
    private String clusterTopology;

    /**
     * 集群实例是否都存活。Yes表示检查通过，No表示检查不通过。
     */
    private String clusterRedisIsAlived;

    /**
     * 集群是否存在延迟。Yes表示检查通过，No表示检查不通过。
     */
    private String clusterDelay;

    /**
     * 主节点只读检查是否通过。Yes表示检查通过，No表示检查不通过。
     */
    private String leaderReadOnly;

    public CheckList setClusterInstanceStatus(String clusterInstanceStatus) {
        this.clusterInstanceStatus = clusterInstanceStatus;
        return this;
    }

    public String getClusterInstanceStatus() {
        return this.clusterInstanceStatus;
    }

    public CheckList setClusterTopology(String clusterTopology) {
        this.clusterTopology = clusterTopology;
        return this;
    }

    public String getClusterTopology() {
        return this.clusterTopology;
    }

    public CheckList setClusterRedisIsAlived(String clusterRedisIsAlived) {
        this.clusterRedisIsAlived = clusterRedisIsAlived;
        return this;
    }

    public String getClusterRedisIsAlived() {
        return this.clusterRedisIsAlived;
    }

    public CheckList setClusterDelay(String clusterDelay) {
        this.clusterDelay = clusterDelay;
        return this;
    }

    public String getClusterDelay() {
        return this.clusterDelay;
    }

    public CheckList setLeaderReadOnly(String leaderReadOnly) {
        this.leaderReadOnly = leaderReadOnly;
        return this;
    }

    public String getLeaderReadOnly() {
        return this.leaderReadOnly;
    }

    @Override
    public String toString() {
        return "CheckList{" + "clusterInstanceStatus=" + clusterInstanceStatus + "\n" + "clusterTopology=" + clusterTopology + "\n" + "clusterRedisIsAlived="
                + clusterRedisIsAlived + "\n" + "clusterDelay=" + clusterDelay + "\n" + "leaderReadOnly=" + leaderReadOnly + "\n" + "}";
    }

}