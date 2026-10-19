package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplicaRequest {
    /**
     * 批量变配的只读实例ID
     */
    private String instanceId;

    /**
     * 只读实例CPU核数，最小值是1
     */
    private Integer cpuCount;

    /**
     * 只读实例内存大小，单位GB。最小值为1
     */
    private Integer memoryCapacity;

    /**
     * 只读实例存储大小，单位GB。最小值为1，如果磁盘类型为diskIoType为cloud\_enha，则volumeCapacity必须大于50
     */
    private Integer volumeCapacity;

    /**
     * 
     */
    private String diskIoType;

    public ReplicaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public ReplicaRequest setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public ReplicaRequest setMemoryCapacity(Integer memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
        return this;
    }

    public Integer getMemoryCapacity() {
        return this.memoryCapacity;
    }

    public ReplicaRequest setVolumeCapacity(Integer volumeCapacity) {
        this.volumeCapacity = volumeCapacity;
        return this;
    }

    public Integer getVolumeCapacity() {
        return this.volumeCapacity;
    }

    public ReplicaRequest setDiskIoType(String diskIoType) {
        this.diskIoType = diskIoType;
        return this;
    }

    public String getDiskIoType() {
        return this.diskIoType;
    }

    @Override
    public String toString() {
        return "ReplicaRequest{" + "instanceId=" + instanceId + "\n" + "cpuCount=" + cpuCount + "\n" + "memoryCapacity=" + memoryCapacity + "\n" + "volumeCapacity="
                + volumeCapacity + "\n" + "diskIoType=" + diskIoType + "\n" + "}";
    }

}