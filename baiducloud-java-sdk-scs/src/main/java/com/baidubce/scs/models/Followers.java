package com.baidubce.scs.models;

import java.lang.String;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Followers {
    /**
     * 从角色实例名称
     */
    private String clusterName;

    /**
     * 集群ID
     */
    private String clusterShowId;

    /**
     * 从角色地域
     */
    private String region;

    /**
     * 从角色实例状态
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

    /**
     * 状态。online：正常
     */
    private String syncStatus;

    /**
     * 主从同步offset的最大差值
     */
    private Integer maxOffset;

    /**
     * 主从同步时延
     */
    private Integer lag;

    public Followers setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    public String getClusterName() {
        return this.clusterName;
    }

    public Followers setClusterShowId(String clusterShowId) {
        this.clusterShowId = clusterShowId;
        return this;
    }

    public String getClusterShowId() {
        return this.clusterShowId;
    }

    public Followers setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public Followers setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Followers setTotalCapacityInGB(Float totalCapacityInGB) {
        this.totalCapacityInGB = totalCapacityInGB;
        return this;
    }

    public Float getTotalCapacityInGB() {
        return this.totalCapacityInGB;
    }

    public Followers setUsedCapacityInGB(Integer usedCapacityInGB) {
        this.usedCapacityInGB = usedCapacityInGB;
        return this;
    }

    public Integer getUsedCapacityInGB() {
        return this.usedCapacityInGB;
    }

    public Followers setShardNum(Integer shardNum) {
        this.shardNum = shardNum;
        return this;
    }

    public Integer getShardNum() {
        return this.shardNum;
    }

    public Followers setFlavor(Integer flavor) {
        this.flavor = flavor;
        return this;
    }

    public Integer getFlavor() {
        return this.flavor;
    }

    public Followers setQpsWrite(Long qpsWrite) {
        this.qpsWrite = qpsWrite;
        return this;
    }

    public Long getQpsWrite() {
        return this.qpsWrite;
    }

    public Followers setQpsRead(Long qpsRead) {
        this.qpsRead = qpsRead;
        return this;
    }

    public Long getQpsRead() {
        return this.qpsRead;
    }

    public Followers setStaleReadable(Boolean staleReadable) {
        this.staleReadable = staleReadable;
        return this;
    }

    public Boolean getStaleReadable() {
        return this.staleReadable;
    }

    public Followers setForbidWrite(Integer forbidWrite) {
        this.forbidWrite = forbidWrite;
        return this;
    }

    public Integer getForbidWrite() {
        return this.forbidWrite;
    }

    public Followers setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    public Followers setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    public String getExpiredTime() {
        return this.expiredTime;
    }

    public Followers setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    public String getSyncStatus() {
        return this.syncStatus;
    }

    public Followers setMaxOffset(Integer maxOffset) {
        this.maxOffset = maxOffset;
        return this;
    }

    public Integer getMaxOffset() {
        return this.maxOffset;
    }

    public Followers setLag(Integer lag) {
        this.lag = lag;
        return this;
    }

    public Integer getLag() {
        return this.lag;
    }

    @Override
    public String toString() {
        return "Followers{" + "clusterName=" + clusterName + "\n" + "clusterShowId=" + clusterShowId + "\n" + "region=" + region + "\n" + "status=" + status + "\n"
                + "totalCapacityInGB=" + totalCapacityInGB + "\n" + "usedCapacityInGB=" + usedCapacityInGB + "\n" + "shardNum=" + shardNum + "\n" + "flavor=" + flavor + "\n"
                + "qpsWrite=" + qpsWrite + "\n" + "qpsRead=" + qpsRead + "\n" + "staleReadable=" + staleReadable + "\n" + "forbidWrite=" + forbidWrite + "\n" + "availabilityZone="
                + availabilityZone + "\n" + "expiredTime=" + expiredTime + "\n" + "syncStatus=" + syncStatus + "\n" + "maxOffset=" + maxOffset + "\n" + "lag=" + lag + "\n" + "}";
    }

}