package com.baidubce.rapidfs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CacheNodeInfo {
    /**
     * 缓存节点唯一 ID
     */
    private String cacheNodeId;

    /**
     * RapidFS 实例 ID
     */
    private String instanceId;

    /**
     * 
     */
    private String type;

    /**
     * 缓存节点 IP 地址
     */
    private String ip;

    /**
     * 节点状态，见 CacheNodeStatus
     */
    private String status;

    /**
     * 连接状态，见 CacheNodeConnectionStatus
     */
    private String connectionStatus;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 创建时间，例如 2026-06-01T23:00:10Z"
     */
    private String createTime;

    /**
     * 缓存节点最近一次心跳上报时间，例如 2026-06-01T23:00:10Z"
     */
    private String reportTime;

    /**
     * 总容量（MiB）
     */
    private Long capacityMiB;

    /**
     * 已使用容量（MiB）
     */
    private Long capacityUsedMiB;

    /**
     * 容量使用百分比
     */
    private Double capacityUsedPercentage;

    /**
     * 
     */
    private String config;

    /**
     * 磁盘信息列表
     */
    private List<DiskInfo> diskInfos;

    /**
     * 部署路径
     */
    private String deployPath;

    /**
     * bccInfo
     */
    private BCCCacheNodeInfo bccInfo;

    /**
     * idcInfo
     */
    private IDCCacheNodeInfo idcInfo;

    /**
     * cceInfo
     */
    private CCECacheNodeInfo cceInfo;

    /**
     * k8sInfo
     */
    private K8SCacheNodeInfo k8sInfo;

    /**
     * aihcInfo
     */
    private AIHCCacheNodeInfo aihcInfo;

    public CacheNodeInfo setCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
        return this;
    }

    public String getCacheNodeId() {
        return this.cacheNodeId;
    }

    public CacheNodeInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public CacheNodeInfo setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public CacheNodeInfo setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public CacheNodeInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public CacheNodeInfo setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }

    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    public CacheNodeInfo setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public CacheNodeInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public CacheNodeInfo setReportTime(String reportTime) {
        this.reportTime = reportTime;
        return this;
    }

    public String getReportTime() {
        return this.reportTime;
    }

    public CacheNodeInfo setCapacityMiB(Long capacityMiB) {
        this.capacityMiB = capacityMiB;
        return this;
    }

    public Long getCapacityMiB() {
        return this.capacityMiB;
    }

    public CacheNodeInfo setCapacityUsedMiB(Long capacityUsedMiB) {
        this.capacityUsedMiB = capacityUsedMiB;
        return this;
    }

    public Long getCapacityUsedMiB() {
        return this.capacityUsedMiB;
    }

    public CacheNodeInfo setCapacityUsedPercentage(Double capacityUsedPercentage) {
        this.capacityUsedPercentage = capacityUsedPercentage;
        return this;
    }

    public Double getCapacityUsedPercentage() {
        return this.capacityUsedPercentage;
    }

    public CacheNodeInfo setConfig(String config) {
        this.config = config;
        return this;
    }

    public String getConfig() {
        return this.config;
    }

    public CacheNodeInfo setDiskInfos(List<DiskInfo> diskInfos) {
        this.diskInfos = diskInfos;
        return this;
    }

    public List<DiskInfo> getDiskInfos() {
        return this.diskInfos;
    }

    public CacheNodeInfo setDeployPath(String deployPath) {
        this.deployPath = deployPath;
        return this;
    }

    public String getDeployPath() {
        return this.deployPath;
    }

    public CacheNodeInfo setBccInfo(BCCCacheNodeInfo bccInfo) {
        this.bccInfo = bccInfo;
        return this;
    }

    public BCCCacheNodeInfo getBccInfo() {
        return this.bccInfo;
    }

    public CacheNodeInfo setIdcInfo(IDCCacheNodeInfo idcInfo) {
        this.idcInfo = idcInfo;
        return this;
    }

    public IDCCacheNodeInfo getIdcInfo() {
        return this.idcInfo;
    }

    public CacheNodeInfo setCceInfo(CCECacheNodeInfo cceInfo) {
        this.cceInfo = cceInfo;
        return this;
    }

    public CCECacheNodeInfo getCceInfo() {
        return this.cceInfo;
    }

    public CacheNodeInfo setK8sInfo(K8SCacheNodeInfo k8sInfo) {
        this.k8sInfo = k8sInfo;
        return this;
    }

    public K8SCacheNodeInfo getK8sInfo() {
        return this.k8sInfo;
    }

    public CacheNodeInfo setAihcInfo(AIHCCacheNodeInfo aihcInfo) {
        this.aihcInfo = aihcInfo;
        return this;
    }

    public AIHCCacheNodeInfo getAihcInfo() {
        return this.aihcInfo;
    }

    @Override
    public String toString() {
        return "CacheNodeInfo{" + "cacheNodeId=" + cacheNodeId + "\n" + "instanceId=" + instanceId + "\n" + "type=" + type + "\n" + "ip=" + ip + "\n" + "status=" + status + "\n"
                + "connectionStatus=" + connectionStatus + "\n" + "description=" + description + "\n" + "createTime=" + createTime + "\n" + "reportTime=" + reportTime + "\n"
                + "capacityMiB=" + capacityMiB + "\n" + "capacityUsedMiB=" + capacityUsedMiB + "\n" + "capacityUsedPercentage=" + capacityUsedPercentage + "\n" + "config="
                + config + "\n" + "diskInfos=" + diskInfos + "\n" + "deployPath=" + deployPath + "\n" + "bccInfo=" + bccInfo + "\n" + "idcInfo=" + idcInfo + "\n" + "cceInfo="
                + cceInfo + "\n" + "k8sInfo=" + k8sInfo + "\n" + "aihcInfo=" + aihcInfo + "\n" + "}";
    }

}