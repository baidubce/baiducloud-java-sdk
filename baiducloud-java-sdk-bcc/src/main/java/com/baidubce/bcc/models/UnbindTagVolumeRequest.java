package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnbindTagVolumeRequest extends BaseBceRequest {

    /**
    * volumeId
    */
    @JsonIgnore
    private String volumeId;

    /**
    * 待解绑的标签列表
    */
    private List<TagModel> changeTags;

    public String getVolumeId() {
        return volumeId;
    }

    public UnbindTagVolumeRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public List<TagModel> getChangeTags() {
        return changeTags;
    }

    public UnbindTagVolumeRequest setChangeTags(List<TagModel> changeTags) {
        this.changeTags = changeTags;
        return this;
    }

}
