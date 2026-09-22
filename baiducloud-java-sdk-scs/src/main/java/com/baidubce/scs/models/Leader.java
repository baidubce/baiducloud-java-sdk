package com.baidubce.scs.models;

import java.lang.String;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Leader {
    /**
     * 热活实例组名称。规则：支持大小写字母、数字以及-_.等特殊字符，长度6~32
     */
    private String groupName;

    /**
     * 热活实例组主角色实例ID
     */
    private String leaderId;

    /**
     * 热活实例组主角色所在地域
     */
    private String leaderRegion;

    /**
     * 主角色实例名称
     */
    private String clusterName;

    /**
     * 主角色实例ID
     */
    private String clusterShowId;

    /**
     * 主角色地域
     */
    private String region;

    /**
     * 主角色实例状态
     */
    private String status;

    /**
     * 总容量
     */
    private Float totalCapacityInGB;

    /**
     * 已用容量
     */
    private Integer usedCapacityInGB;

    /**
     * 分片数
     */
    private Integer shardNum;

    /**
     * 单分片容量
     */
    private Integer flavor;

    /**
     * 写流量阈值
     */
    private Long qpsWrite;

    /**
     * 读流量阈值
     */
    private Long qpsRead;

    /**
     * 从角色脏读开关状态（true:打开， false:关闭）
     */
    private Boolean staleReadable;

    /**
     * 禁写标志（0 未禁写， 1 禁写）
     */
    private Integer forbidWrite;

    /**
     * 可用区
     */
    private String availabilityZone;

    /**
     * 过期时间
     */
    private String expiredTime;

    public Leader setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public Leader setLeaderId(String leaderId) {
        this.leaderId = leaderId;
        return this;
    }

    public String getLeaderId() {
        return this.leaderId;
    }

    public Leader setLeaderRegion(String leaderRegion) {
        this.leaderRegion = leaderRegion;
        return this;
    }

    public String getLeaderRegion() {
        return this.leaderRegion;
    }

    public Leader setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    public String getClusterName() {
        return this.clusterName;
    }

    public Leader setClusterShowId(String clusterShowId) {
        this.clusterShowId = clusterShowId;
        return this;
    }

    public String getClusterShowId() {
        return this.clusterShowId;
    }

    public Leader setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public Leader setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Leader setTotalCapacityInGB(Float totalCapacityInGB) {
        this.totalCapacityInGB = totalCapacityInGB;
        return this;
    }

    public Float getTotalCapacityInGB() {
        return this.totalCapacityInGB;
    }

    public Leader setUsedCapacityInGB(Integer usedCapacityInGB) {
        this.usedCapacityInGB = usedCapacityInGB;
        return this;
    }

    public Integer getUsedCapacityInGB() {
        return this.usedCapacityInGB;
    }

    public Leader setShardNum(Integer shardNum) {
        this.shardNum = shardNum;
        return this;
    }

    public Integer getShardNum() {
        return this.shardNum;
    }

    public Leader setFlavor(Integer flavor) {
        this.flavor = flavor;
        return this;
    }

    public Integer getFlavor() {
        return this.flavor;
    }

    public Leader setQpsWrite(Long qpsWrite) {
        this.qpsWrite = qpsWrite;
        return this;
    }

    public Long getQpsWrite() {
        return this.qpsWrite;
    }

    public Leader setQpsRead(Long qpsRead) {
        this.qpsRead = qpsRead;
        return this;
    }

    public Long getQpsRead() {
        return this.qpsRead;
    }

    public Leader setStaleReadable(Boolean staleReadable) {
        this.staleReadable = staleReadable;
        return this;
    }

    public Boolean getStaleReadable() {
        return this.staleReadable;
    }

    public Leader setForbidWrite(Integer forbidWrite) {
        this.forbidWrite = forbidWrite;
        return this;
    }

    public Integer getForbidWrite() {
        return this.forbidWrite;
    }

    public Leader setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    public Leader setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    public String getExpiredTime() {
        return this.expiredTime;
    }

    @Override
    public String toString() {
        return "Leader{" + "groupName=" + groupName + "\n" + "leaderId=" + leaderId + "\n" + "leaderRegion=" + leaderRegion + "\n" + "clusterName=" + clusterName + "\n"
                + "clusterShowId=" + clusterShowId + "\n" + "region=" + region + "\n" + "status=" + status + "\n" + "totalCapacityInGB=" + totalCapacityInGB + "\n"
                + "usedCapacityInGB=" + usedCapacityInGB + "\n" + "shardNum=" + shardNum + "\n" + "flavor=" + flavor + "\n" + "qpsWrite=" + qpsWrite + "\n" + "qpsRead=" + qpsRead
                + "\n" + "staleReadable=" + staleReadable + "\n" + "forbidWrite=" + forbidWrite + "\n" + "availabilityZone=" + availabilityZone + "\n" + "expiredTime="
                + expiredTime + "\n" + "}";
    }

}