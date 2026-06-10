package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VolumeAttachmentModel {
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
     * 挂载设备路径（该参数即将停止使用，为提高代码的兼容性，建议您尽量不要使用该参数）
     */
    private String device;

    public VolumeAttachmentModel setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public String getVolumeId() {
        return this.volumeId;
    }

    public VolumeAttachmentModel setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public String getSerial() {
        return this.serial;
    }

    public VolumeAttachmentModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public VolumeAttachmentModel setDevice(String device) {
        this.device = device;
        return this;
    }

    public String getDevice() {
        return this.device;
    }

    @Override
    public String toString() {
        return "VolumeAttachmentModel{" + "volumeId=" + volumeId + "\n" + "serial=" + serial + "\n" + "instanceId=" + instanceId + "\n" + "device=" + device + "\n" + "}";
    }

}