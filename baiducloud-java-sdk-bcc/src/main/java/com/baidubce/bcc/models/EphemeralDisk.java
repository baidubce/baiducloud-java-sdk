package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EphemeralDisk {
    /**
     * CDS磁盘存储类型，包括SSD_Enhanced (增强型SSD)，cloud_hp1（通用型SD），hp1 (高性能云磁盘)和hdd (通用型HDD) 共四种磁盘类型，默认 hp1。（查询磁盘列表、查询磁盘详情返回）
     */
    private String storageType;

    /**
     * 磁盘大小，单位GB（创建实例、创建抢占实例）
     */
    private Integer sizeInGB;

    /**
     * 可用容量，GB（创建实例）
     */
    private Integer freeSizeInGB;

    public EphemeralDisk setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public String getStorageType() {
        return this.storageType;
    }

    public EphemeralDisk setSizeInGB(Integer sizeInGB) {
        this.sizeInGB = sizeInGB;
        return this;
    }

    public Integer getSizeInGB() {
        return this.sizeInGB;
    }

    public EphemeralDisk setFreeSizeInGB(Integer freeSizeInGB) {
        this.freeSizeInGB = freeSizeInGB;
        return this;
    }

    public Integer getFreeSizeInGB() {
        return this.freeSizeInGB;
    }

    @Override
    public String toString() {
        return "EphemeralDisk{" + "storageType=" + storageType + "\n" + "sizeInGB=" + sizeInGB + "\n" + "freeSizeInGB=" + freeSizeInGB + "\n" + "}";
    }

}