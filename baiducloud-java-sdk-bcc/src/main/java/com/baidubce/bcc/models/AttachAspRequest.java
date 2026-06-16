package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttachAspRequest extends BaseBceRequest {

    /**
    * aspId
    */
    @JsonIgnore
    private String aspId;

    /**
    * 需要绑定的磁盘ID列表
    */
    private List<String> volumeIds;

    /**
    * 自动快照随磁盘删除，初始值为false，显式赋值后所有相关磁盘对应属性会被新值替换
    */
    private Boolean deleteAutoSnapshot;

    public String getAspId() {
        return aspId;
    }

    public AttachAspRequest setAspId(String aspId) {
        this.aspId = aspId;
        return this;
    }

    public List<String> getVolumeIds() {
        return volumeIds;
    }

    public AttachAspRequest setVolumeIds(List<String> volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }

    public Boolean getDeleteAutoSnapshot() {
        return deleteAutoSnapshot;
    }

    public AttachAspRequest setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
        this.deleteAutoSnapshot = deleteAutoSnapshot;
        return this;
    }

}
