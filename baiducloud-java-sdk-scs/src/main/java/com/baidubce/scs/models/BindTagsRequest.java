package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindTagsRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 待解绑的标签列表
    */
    private List<TagModel> changeTags;

    public String getInstanceId() {
        return instanceId;
    }

    public BindTagsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<TagModel> getChangeTags() {
        return changeTags;
    }

    public BindTagsRequest setChangeTags(List<TagModel> changeTags) {
        this.changeTags = changeTags;
        return this;
    }

}
