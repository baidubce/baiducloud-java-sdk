package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindTagVolumeRequest extends BaseBceRequest {

    /**
    * volumeId
    */
    @JsonIgnore
    private String volumeId;

    /**
    * 待绑定的标签列表，绑定的标签如果之前不存在，将自动创建该标签
    */
    private List<TagModel> changeTags;

    public String getVolumeId() {
        return volumeId;
    }

    public BindTagVolumeRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public List<TagModel> getChangeTags() {
        return changeTags;
    }

    public BindTagVolumeRequest setChangeTags(List<TagModel> changeTags) {
        this.changeTags = changeTags;
        return this;
    }

}
