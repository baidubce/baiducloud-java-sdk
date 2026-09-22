package com.baidubce.scs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClusterItem {
    /**
     * 成员集群的ID。
     */
    private String clusterShowId;

    /**
     * 成员集群的名称。
     */
    private String clusterName;

    /**
     * 成员集群所在地域。
     */
    private String region;

    /**
     * 集群状态。此状态为集群在实例组中的状态，非集群本身状态。
     */
    private String clusterStatus;

    /**
     * 集群引擎类型。
     */
    private String clusterEngine;

    /**
     * 集群创建时间。
     */
    private String createTime;

    /**
     * 集群总容量。
     */
    private Float totalCapacityInGb;

    /**
     * 集群已用容量。
     */
    private Float usedCapacityInGb;

    /**
     * 集群到期时间。
     */
    private String expiredTime;

    /**
     * 集群分片列表。查询多活组监控数据时使用。
     */
    private List<String> shardList;

    /**
     * 集群BLB信息列表。查询多活组监控数据时使用。
     */
    private List<SyncFlowItem> syncFlow;

    public ClusterItem setClusterShowId(String clusterShowId) {
        this.clusterShowId = clusterShowId;
        return this;
    }

    public String getClusterShowId() {
        return this.clusterShowId;
    }

    public ClusterItem setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    public String getClusterName() {
        return this.clusterName;
    }

    public ClusterItem setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public ClusterItem setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }

    public String getClusterStatus() {
        return this.clusterStatus;
    }

    public ClusterItem setClusterEngine(String clusterEngine) {
        this.clusterEngine = clusterEngine;
        return this;
    }

    public String getClusterEngine() {
        return this.clusterEngine;
    }

    public ClusterItem setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public ClusterItem setTotalCapacityInGb(Float totalCapacityInGb) {
        this.totalCapacityInGb = totalCapacityInGb;
        return this;
    }

    public Float getTotalCapacityInGb() {
        return this.totalCapacityInGb;
    }

    public ClusterItem setUsedCapacityInGb(Float usedCapacityInGb) {
        this.usedCapacityInGb = usedCapacityInGb;
        return this;
    }

    public Float getUsedCapacityInGb() {
        return this.usedCapacityInGb;
    }

    public ClusterItem setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    public String getExpiredTime() {
        return this.expiredTime;
    }

    public ClusterItem setShardList(List<String> shardList) {
        this.shardList = shardList;
        return this;
    }

    public List<String> getShardList() {
        return this.shardList;
    }

    public ClusterItem setSyncFlow(List<SyncFlowItem> syncFlow) {
        this.syncFlow = syncFlow;
        return this;
    }

    public List<SyncFlowItem> getSyncFlow() {
        return this.syncFlow;
    }

    @Override
    public String toString() {
        return "ClusterItem{" + "clusterShowId=" + clusterShowId + "\n" + "clusterName=" + clusterName + "\n" + "region=" + region + "\n" + "clusterStatus=" + clusterStatus + "\n"
                + "clusterEngine=" + clusterEngine + "\n" + "createTime=" + createTime + "\n" + "totalCapacityInGb=" + totalCapacityInGb + "\n" + "usedCapacityInGb="
                + usedCapacityInGb + "\n" + "expiredTime=" + expiredTime + "\n" + "shardList=" + shardList + "\n" + "syncFlow=" + syncFlow + "\n" + "}";
    }

}