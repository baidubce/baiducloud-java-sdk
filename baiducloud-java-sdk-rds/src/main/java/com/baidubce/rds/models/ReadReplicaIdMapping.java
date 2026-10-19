package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReadReplicaIdMapping {
    /**
     * 只读实例ID。
     */
    private String appId;

    /**
     * 只读实例短ID。
     */
    private String appIdShort;

    /**
     * 只读实例状态，参考[公网状态表](/doc/RDS/s/9jwvz0wd3#%E5%85%AC%E7%BD%91%E8%AE%BF%E9%97%AE%E7%8A%B6%E6%80%81)。
     */
    private String status;

    /**
     * 分配内存大小（单位:MB）。
     */
    private Integer allocatedMemoryInMB;

    /**
     * cpu个数。
     */
    private Integer cpuCount;

    /**
     * 分配存储大小（单位GB）。
     */
    private Integer allocatedStorageInGB;

    /**
     * 分配存储大小（单位GB）。
     */
    private Double usedStorageInGB;

    public ReadReplicaIdMapping setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getAppId() {
        return this.appId;
    }

    public ReadReplicaIdMapping setAppIdShort(String appIdShort) {
        this.appIdShort = appIdShort;
        return this;
    }

    public String getAppIdShort() {
        return this.appIdShort;
    }

    public ReadReplicaIdMapping setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public ReadReplicaIdMapping setAllocatedMemoryInMB(Integer allocatedMemoryInMB) {
        this.allocatedMemoryInMB = allocatedMemoryInMB;
        return this;
    }

    public Integer getAllocatedMemoryInMB() {
        return this.allocatedMemoryInMB;
    }

    public ReadReplicaIdMapping setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public ReadReplicaIdMapping setAllocatedStorageInGB(Integer allocatedStorageInGB) {
        this.allocatedStorageInGB = allocatedStorageInGB;
        return this;
    }

    public Integer getAllocatedStorageInGB() {
        return this.allocatedStorageInGB;
    }

    public ReadReplicaIdMapping setUsedStorageInGB(Double usedStorageInGB) {
        this.usedStorageInGB = usedStorageInGB;
        return this;
    }

    public Double getUsedStorageInGB() {
        return this.usedStorageInGB;
    }

    @Override
    public String toString() {
        return "ReadReplicaIdMapping{" + "appId=" + appId + "\n" + "appIdShort=" + appIdShort + "\n" + "status=" + status + "\n" + "allocatedMemoryInMB=" + allocatedMemoryInMB
                + "\n" + "cpuCount=" + cpuCount + "\n" + "allocatedStorageInGB=" + allocatedStorageInGB + "\n" + "usedStorageInGB=" + usedStorageInGB + "\n" + "}";
    }

}