package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DiskInfo {
    /**
     * 
     */
    private String storageType;

    /**
     * 最大单盘可创建磁盘容量
     */
    private Integer maxDiskSize;

    /**
     * 最小单盘创建磁盘容量
     */
    private Integer minDiskSize;

    public DiskInfo setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public String getStorageType() {
        return this.storageType;
    }

    public DiskInfo setMaxDiskSize(Integer maxDiskSize) {
        this.maxDiskSize = maxDiskSize;
        return this;
    }

    public Integer getMaxDiskSize() {
        return this.maxDiskSize;
    }

    public DiskInfo setMinDiskSize(Integer minDiskSize) {
        this.minDiskSize = minDiskSize;
        return this;
    }

    public Integer getMinDiskSize() {
        return this.minDiskSize;
    }

    @Override
    public String toString() {
        return "DiskInfo{" + "storageType=" + storageType + "\n" + "maxDiskSize=" + maxDiskSize + "\n" + "minDiskSize=" + minDiskSize + "\n" + "}";
    }

}