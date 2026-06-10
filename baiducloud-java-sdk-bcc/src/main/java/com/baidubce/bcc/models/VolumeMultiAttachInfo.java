package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VolumeMultiAttachInfo {
    /**
     * 磁盘ID
     */
    private String volumeId;

    /**
     * 磁盘序列号
     */
    private String serial;

    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 状态
     */
    private String status;

    public VolumeMultiAttachInfo setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public String getVolumeId() {
        return this.volumeId;
    }

    public VolumeMultiAttachInfo setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public String getSerial() {
        return this.serial;
    }

    public VolumeMultiAttachInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public VolumeMultiAttachInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "VolumeMultiAttachInfo{" + "volumeId=" + volumeId + "\n" + "serial=" + serial + "\n" + "instanceId=" + instanceId + "\n" + "status=" + status + "\n" + "}";
    }

}