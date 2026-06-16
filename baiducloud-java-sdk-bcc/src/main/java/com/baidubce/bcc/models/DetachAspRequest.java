package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DetachAspRequest extends BaseBceRequest {

    /**
    * aspId
    */
    @JsonIgnore
    private String aspId;

    /**
    * 需要解绑的磁盘ID列表
    */
    private List<String> volumeIds;

    /**
    * 自动快照随磁盘删除，初始值为false，显式赋值后所有相关磁盘对应属性会被新值替换
    */
    private Boolean deleteAutoSnapshot;

    public String getAspId() {
        return aspId;
    }

    public DetachAspRequest setAspId(String aspId) {
        this.aspId = aspId;
        return this;
    }

    public List<String> getVolumeIds() {
        return volumeIds;
    }

    public DetachAspRequest setVolumeIds(List<String> volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }

    public Boolean getDeleteAutoSnapshot() {
        return deleteAutoSnapshot;
    }

    public DetachAspRequest setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
        this.deleteAutoSnapshot = deleteAutoSnapshot;
        return this;
    }

}
