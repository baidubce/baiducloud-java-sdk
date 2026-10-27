package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MountServiceBinding {
    /**
     * 挂载服务 Id。响应必返；请求可省略，省略时为默认挂载服务 MNTSVC-RAPIDFS_DEFAULT_ID
     */
    private String mountServiceId;

    /**
     * 挂载服务名称。响应必返；请求中为只读字段，传入会被忽略
     */
    private String mountServiceName;

    /**
     * 数据源唯一 Id。响应必返；请求中为只读字段，以请求所属数据源为准，传入会被忽略
     */
    private String dataSrcId;

    /**
     * 数据源名称。响应必返；请求中为只读字段，传入会被忽略
     */
    private String dataSrcName;

    /**
     * 
     */
    private String logicalMountPath;

    /**
     * 
     */
    private String status;

    public MountServiceBinding setMountServiceId(String mountServiceId) {
        this.mountServiceId = mountServiceId;
        return this;
    }

    public String getMountServiceId() {
        return this.mountServiceId;
    }

    public MountServiceBinding setMountServiceName(String mountServiceName) {
        this.mountServiceName = mountServiceName;
        return this;
    }

    public String getMountServiceName() {
        return this.mountServiceName;
    }

    public MountServiceBinding setDataSrcId(String dataSrcId) {
        this.dataSrcId = dataSrcId;
        return this;
    }

    public String getDataSrcId() {
        return this.dataSrcId;
    }

    public MountServiceBinding setDataSrcName(String dataSrcName) {
        this.dataSrcName = dataSrcName;
        return this;
    }

    public String getDataSrcName() {
        return this.dataSrcName;
    }

    public MountServiceBinding setLogicalMountPath(String logicalMountPath) {
        this.logicalMountPath = logicalMountPath;
        return this;
    }

    public String getLogicalMountPath() {
        return this.logicalMountPath;
    }

    public MountServiceBinding setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "MountServiceBinding{" + "mountServiceId=" + mountServiceId + "\n" + "mountServiceName=" + mountServiceName + "\n" + "dataSrcId=" + dataSrcId + "\n"
                + "dataSrcName=" + dataSrcName + "\n" + "logicalMountPath=" + logicalMountPath + "\n" + "status=" + status + "\n" + "}";
    }

}