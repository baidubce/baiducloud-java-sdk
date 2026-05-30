package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePFSTagRequest extends BaseBceRequest {

    /**
    * 实例ID列表
    */
    private List<String> instanceId;

    /**
    * 标签列表
    */
    private List<Tag> tags;

    public List<String> getInstanceId() {
        return instanceId;
    }

    public UpdatePFSTagRequest setInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public UpdatePFSTagRequest setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

}
