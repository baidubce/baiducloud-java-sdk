package com.baidubce.scs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListItem {
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

    /**
     * 账号名称。
     */
    private String userName;

    /**
     * 账号状态。0：正常可用；1：创建中；2：修改中；4：删除中；
     */
    private Integer updateStatus;

    /**
     * 备注信息。
     */
    private String extra;

    /**
     * 账号权限。1：读写；2：只读；
     */
    private Integer userType;

    public ListItem setSyncGroupShowId(String syncGroupShowId) {
        this.syncGroupShowId = syncGroupShowId;
        return this;
    }

    public String getSyncGroupShowId() {
        return this.syncGroupShowId;
    }

    public ListItem setSyncGroupName(String syncGroupName) {
        this.syncGroupName = syncGroupName;
        return this;
    }

    public String getSyncGroupName() {
        return this.syncGroupName;
    }

    public ListItem setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public ListItem setClusterNum(Integer clusterNum) {
        this.clusterNum = clusterNum;
        return this;
    }

    public Integer getClusterNum() {
        return this.clusterNum;
    }

    public ListItem setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    public String getNodeType() {
        return this.nodeType;
    }

    public ListItem setNetConn(String netConn) {
        this.netConn = netConn;
        return this;
    }

    public String getNetConn() {
        return this.netConn;
    }

    public ListItem setConfilctResolution(String confilctResolution) {
        this.confilctResolution = confilctResolution;
        return this;
    }

    public String getConfilctResolution() {
        return this.confilctResolution;
    }

    public ListItem setSyncGroupCreateTime(String syncGroupCreateTime) {
        this.syncGroupCreateTime = syncGroupCreateTime;
        return this;
    }

    public String getSyncGroupCreateTime() {
        return this.syncGroupCreateTime;
    }

    public ListItem setSameSpec(Boolean sameSpec) {
        this.sameSpec = sameSpec;
        return this;
    }

    public Boolean getSameSpec() {
        return this.sameSpec;
    }

    public ListItem setSameShardNum(Boolean sameShardNum) {
        this.sameShardNum = sameShardNum;
        return this;
    }

    public Boolean getSameShardNum() {
        return this.sameShardNum;
    }

    public ListItem setCluster(List<ClusterItem> cluster) {
        this.cluster = cluster;
        return this;
    }

    public List<ClusterItem> getCluster() {
        return this.cluster;
    }

    public ListItem setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserName() {
        return this.userName;
    }

    public ListItem setUpdateStatus(Integer updateStatus) {
        this.updateStatus = updateStatus;
        return this;
    }

    public Integer getUpdateStatus() {
        return this.updateStatus;
    }

    public ListItem setExtra(String extra) {
        this.extra = extra;
        return this;
    }

    public String getExtra() {
        return this.extra;
    }

    public ListItem setUserType(Integer userType) {
        this.userType = userType;
        return this;
    }

    public Integer getUserType() {
        return this.userType;
    }

    @Override
    public String toString() {
        return "ListItem{" + "syncGroupShowId=" + syncGroupShowId + "\n" + "syncGroupName=" + syncGroupName + "\n" + "status=" + status + "\n" + "clusterNum=" + clusterNum + "\n"
                + "nodeType=" + nodeType + "\n" + "netConn=" + netConn + "\n" + "confilctResolution=" + confilctResolution + "\n" + "syncGroupCreateTime=" + syncGroupCreateTime
                + "\n" + "sameSpec=" + sameSpec + "\n" + "sameShardNum=" + sameShardNum + "\n" + "cluster=" + cluster + "\n" + "userName=" + userName + "\n" + "updateStatus="
                + updateStatus + "\n" + "extra=" + extra + "\n" + "userType=" + userType + "\n" + "}";
    }

}