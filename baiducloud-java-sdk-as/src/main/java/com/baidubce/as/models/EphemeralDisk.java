package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EphemeralDisk {
    /**
     * 本地盘类型
     */
    private String storageType;

    /**
     * 本地盘大小
     */
    private Integer sizeInGB;

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

    @Override
    public String toString() {
        return "EphemeralDisk{" + "storageType=" + storageType + "\n" + "sizeInGB=" + sizeInGB + "\n" + "}";
    }

}