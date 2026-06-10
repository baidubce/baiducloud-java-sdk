package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttachVolumeRequest extends BaseBceRequest {

    /**
    * volumeId
    */
    @JsonIgnore
    private String volumeId;

    /**
    * 待挂载的虚拟机实例ID
    */
    private String instanceId;

    /**
    * 磁盘随实例删除，默认为false，仅后付费类型的数据盘支持配置该选项
    */
    private Boolean deleteWithInstance;

    /**
    * 自动快照随磁盘删除，默认为false，所有类型的磁盘都支持配置该选项
    */
    private Boolean deleteAutoSnapshot;

    public String getVolumeId() {
        return volumeId;
    }

    public AttachVolumeRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public AttachVolumeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Boolean getDeleteWithInstance() {
        return deleteWithInstance;
    }

    public AttachVolumeRequest setDeleteWithInstance(Boolean deleteWithInstance) {
        this.deleteWithInstance = deleteWithInstance;
        return this;
    }

    public Boolean getDeleteAutoSnapshot() {
        return deleteAutoSnapshot;
    }

    public AttachVolumeRequest setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
        this.deleteAutoSnapshot = deleteAutoSnapshot;
        return this;
    }

}
