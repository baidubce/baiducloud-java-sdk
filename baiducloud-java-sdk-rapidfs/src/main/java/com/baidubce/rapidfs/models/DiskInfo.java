package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DiskInfo {
    /**
     * 设备名
     */
    private String dev;

    /**
     * 挂载路径
     */
    private String mountPath;

    /**
     * 磁盘配额，单位 GiB
     */
    private Long diskQuotaGiB;

    /**
     * 是否格式化：format=true 时必须给出 dev；format=false 时必须给出 diskQuotaGiB
     */
    private Boolean format;

    /**
     * 磁盘类型（可选）
     */
    private String diskType;

    public DiskInfo setDev(String dev) {
        this.dev = dev;
        return this;
    }

    public String getDev() {
        return this.dev;
    }

    public DiskInfo setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    public String getMountPath() {
        return this.mountPath;
    }

    public DiskInfo setDiskQuotaGiB(Long diskQuotaGiB) {
        this.diskQuotaGiB = diskQuotaGiB;
        return this;
    }

    public Long getDiskQuotaGiB() {
        return this.diskQuotaGiB;
    }

    public DiskInfo setFormat(Boolean format) {
        this.format = format;
        return this;
    }

    public Boolean getFormat() {
        return this.format;
    }

    public DiskInfo setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    public String getDiskType() {
        return this.diskType;
    }

    @Override
    public String toString() {
        return "DiskInfo{" + "dev=" + dev + "\n" + "mountPath=" + mountPath + "\n" + "diskQuotaGiB=" + diskQuotaGiB + "\n" + "format=" + format + "\n" + "diskType=" + diskType
                + "\n" + "}";
    }

}