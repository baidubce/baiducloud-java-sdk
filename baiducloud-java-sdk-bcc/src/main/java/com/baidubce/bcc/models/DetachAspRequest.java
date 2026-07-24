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

}
