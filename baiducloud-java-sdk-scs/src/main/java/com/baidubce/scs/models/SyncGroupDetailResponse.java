package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SyncGroupDetailResponse extends BaseBceResponse {

    /**
    * 实例组ID。
    */
    private String syncGroupShowId;

    /**
    * 实例组名称。
    */
    private String syncGroupName;

    /**
    * 实例组状态。
    */
    private String status;

    /**
    * 实例组中成员集群的数量。
    */
    private Integer clusterNum;

    /**
    * 实例组中成员集群的规格。
    */
    private String nodeType;

    /**
    * 网络联通状态。忽略该字段。
    */
    private String netConn;

    /**
    * 冲突解决办法。忽略该字段。
    */
    private String confilctResolution;

    /**
    * 多活实例组创建时间。
    */
    private String syncGroupCreateTime;

    /**
    * 实例组中所有成员的规格是否一致。
    */
    private Boolean sameSpec;

    /**
    * 实例组中所有成员的分片数量是否一致。
    */
    private Boolean sameShardNum;

    /**
    * 多活组列表数据。
    */
    private List<ClusterItem> cluster;

    public String getSyncGroupShowId() {
        return syncGroupShowId;
    }

    public SyncGroupDetailResponse setSyncGroupShowId(String syncGroupShowId) {
        this.syncGroupShowId = syncGroupShowId;
        return this;
    }

    public String getSyncGroupName() {
        return syncGroupName;
    }

    public SyncGroupDetailResponse setSyncGroupName(String syncGroupName) {
        this.syncGroupName = syncGroupName;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public SyncGroupDetailResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public Integer getClusterNum() {
        return clusterNum;
    }

    public SyncGroupDetailResponse setClusterNum(Integer clusterNum) {
        this.clusterNum = clusterNum;
        return this;
    }

    public String getNodeType() {
        return nodeType;
    }

    public SyncGroupDetailResponse setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    public String getNetConn() {
        return netConn;
    }

    public SyncGroupDetailResponse setNetConn(String netConn) {
        this.netConn = netConn;
        return this;
    }

    public String getConfilctResolution() {
        return confilctResolution;
    }

    public SyncGroupDetailResponse setConfilctResolution(String confilctResolution) {
        this.confilctResolution = confilctResolution;
        return this;
    }

    public String getSyncGroupCreateTime() {
        return syncGroupCreateTime;
    }

    public SyncGroupDetailResponse setSyncGroupCreateTime(String syncGroupCreateTime) {
        this.syncGroupCreateTime = syncGroupCreateTime;
        return this;
    }

    public Boolean getSameSpec() {
        return sameSpec;
    }

    public SyncGroupDetailResponse setSameSpec(Boolean sameSpec) {
        this.sameSpec = sameSpec;
        return this;
    }

    public Boolean getSameShardNum() {
        return sameShardNum;
    }

    public SyncGroupDetailResponse setSameShardNum(Boolean sameShardNum) {
        this.sameShardNum = sameShardNum;
        return this;
    }

    public List<ClusterItem> getCluster() {
        return cluster;
    }

    public SyncGroupDetailResponse setCluster(List<ClusterItem> cluster) {
        this.cluster = cluster;
        return this;
    }

    @Override
    public String toString() {
        return "SyncGroupDetailResponse{" + "syncGroupShowId=" + syncGroupShowId + "\n" + "syncGroupName=" + syncGroupName + "\n" + "status=" + status + "\n" + "clusterNum="
                + clusterNum + "\n" + "nodeType=" + nodeType + "\n" + "netConn=" + netConn + "\n" + "confilctResolution=" + confilctResolution + "\n" + "syncGroupCreateTime="
                + syncGroupCreateTime + "\n" + "sameSpec=" + sameSpec + "\n" + "sameShardNum=" + sameShardNum + "\n" + "cluster=" + cluster + "\n" + "}";
    }

}
