package com.baidubce.rapidfs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CacheDeployGroupInfo {
    /**
     * 缓存部署组名称
     */
    private String cacheDeployGroupName;

    /**
     * RapidFS 实例 ID
     */
    private String instanceId;

    /**
     * K8s 集群的命名空间
     */
    private String cacheDeployGroupNS;

    /**
     * 部署组状态，参考 CacheDeployGroupStatus
     */
    private String status;

    /**
     * 期望节点数量
     */
    private Integer expectedNum;

    /**
     * 运行中节点数量
     */
    private Integer runningNum;

    /**
     * 总容量，单位 MiB
     */
    private Long capacityMiB;

    /**
     * 已使用容量，单位 MiB
     */
    private Long capacityUsedMiB;

    /**
     * 容量使用百分比
     */
    private Double capacityUsedPercentage;

    /**
     * 部署路径
     */
    private String deployPath;

    /**
     * 配置信息，json 格式的字符串：{  "systemConfig": {},  "resourceConfig": {},  "serviceConfig": {}}
     */
    private String config;

    /**
     * 创建时间，例如 2026-06-01T23:00:10Z"
     */
    private String createTime;

    /**
     * 修改时间，例如 2026-06-01T23:00:10Z"
     */
    private String modifyTime;

    /**
     * 磁盘信息列表
     */
    private List<DiskInfo> diskInfos;

    public CacheDeployGroupInfo setCacheDeployGroupName(String cacheDeployGroupName) {
        this.cacheDeployGroupName = cacheDeployGroupName;
        return this;
    }

    public String getCacheDeployGroupName() {
        return this.cacheDeployGroupName;
    }

    public CacheDeployGroupInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public CacheDeployGroupInfo setCacheDeployGroupNS(String cacheDeployGroupNS) {
        this.cacheDeployGroupNS = cacheDeployGroupNS;
        return this;
    }

    public String getCacheDeployGroupNS() {
        return this.cacheDeployGroupNS;
    }

    public CacheDeployGroupInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public CacheDeployGroupInfo setExpectedNum(Integer expectedNum) {
        this.expectedNum = expectedNum;
        return this;
    }

    public Integer getExpectedNum() {
        return this.expectedNum;
    }

    public CacheDeployGroupInfo setRunningNum(Integer runningNum) {
        this.runningNum = runningNum;
        return this;
    }

    public Integer getRunningNum() {
        return this.runningNum;
    }

    public CacheDeployGroupInfo setCapacityMiB(Long capacityMiB) {
        this.capacityMiB = capacityMiB;
        return this;
    }

    public Long getCapacityMiB() {
        return this.capacityMiB;
    }

    public CacheDeployGroupInfo setCapacityUsedMiB(Long capacityUsedMiB) {
        this.capacityUsedMiB = capacityUsedMiB;
        return this;
    }

    public Long getCapacityUsedMiB() {
        return this.capacityUsedMiB;
    }

    public CacheDeployGroupInfo setCapacityUsedPercentage(Double capacityUsedPercentage) {
        this.capacityUsedPercentage = capacityUsedPercentage;
        return this;
    }

    public Double getCapacityUsedPercentage() {
        return this.capacityUsedPercentage;
    }

    public CacheDeployGroupInfo setDeployPath(String deployPath) {
        this.deployPath = deployPath;
        return this;
    }

    public String getDeployPath() {
        return this.deployPath;
    }

    public CacheDeployGroupInfo setConfig(String config) {
        this.config = config;
        return this;
    }

    public String getConfig() {
        return this.config;
    }

    public CacheDeployGroupInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public CacheDeployGroupInfo setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getModifyTime() {
        return this.modifyTime;
    }

    public CacheDeployGroupInfo setDiskInfos(List<DiskInfo> diskInfos) {
        this.diskInfos = diskInfos;
        return this;
    }

    public List<DiskInfo> getDiskInfos() {
        return this.diskInfos;
    }

    @Override
    public String toString() {
        return "CacheDeployGroupInfo{" + "cacheDeployGroupName=" + cacheDeployGroupName + "\n" + "instanceId=" + instanceId + "\n" + "cacheDeployGroupNS=" + cacheDeployGroupNS
                + "\n" + "status=" + status + "\n" + "expectedNum=" + expectedNum + "\n" + "runningNum=" + runningNum + "\n" + "capacityMiB=" + capacityMiB + "\n"
                + "capacityUsedMiB=" + capacityUsedMiB + "\n" + "capacityUsedPercentage=" + capacityUsedPercentage + "\n" + "deployPath=" + deployPath + "\n" + "config=" + config
                + "\n" + "createTime=" + createTime + "\n" + "modifyTime=" + modifyTime + "\n" + "diskInfos=" + diskInfos + "\n" + "}";
    }

}