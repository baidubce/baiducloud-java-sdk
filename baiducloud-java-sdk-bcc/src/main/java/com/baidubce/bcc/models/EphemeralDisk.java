package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EphemeralDisk {
    /**
     * 
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