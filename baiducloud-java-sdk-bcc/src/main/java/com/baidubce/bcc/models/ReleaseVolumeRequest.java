package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReleaseVolumeRequest extends BaseBceRequest {

    /**
    * volumeId
    */
    @JsonIgnore
    private String volumeId;

    /**
    * 取值为"on"时，会删除磁盘关联的自动快照
    */
    private String autoSnapshot;

    /**
    * 取值为"on"时，会删除磁盘关联的手动快照
    */
    private String manualSnapshot;

    /**
    * 自动快照是否按照"自动快照随磁盘释放"属性进行资源释放，默认为false，当该参数为true时将根据自动快照的关联释放属性进行释放，优先级高于autoSnapshot
    */
    private Boolean cdsAttributeActive;

    /**
    * 取值为"on"时，数据盘进入回收站，取值为"off"时，立即删除。默认为"on"。
    */
    private String recycle;

    public String getVolumeId() {
        return volumeId;
    }

    public ReleaseVolumeRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public String getAutoSnapshot() {
        return autoSnapshot;
    }

    public ReleaseVolumeRequest setAutoSnapshot(String autoSnapshot) {
        this.autoSnapshot = autoSnapshot;
        return this;
    }

    public String getManualSnapshot() {
        return manualSnapshot;
    }

    public ReleaseVolumeRequest setManualSnapshot(String manualSnapshot) {
        this.manualSnapshot = manualSnapshot;
        return this;
    }

    public Boolean getCdsAttributeActive() {
        return cdsAttributeActive;
    }

    public ReleaseVolumeRequest setCdsAttributeActive(Boolean cdsAttributeActive) {
        this.cdsAttributeActive = cdsAttributeActive;
        return this;
    }

    public String getRecycle() {
        return recycle;
    }

    public ReleaseVolumeRequest setRecycle(String recycle) {
        this.recycle = recycle;
        return this;
    }

}
