package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnbindInstanceFromTagsRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 待解绑的标签列表
    */
    private List<TagModel> changeTags;

    /**
    * 关联资源（cds系统盘、数据盘、eip、快照、快照链）是否一同解绑标签。true：关联解绑；false：不关联解绑。不传默认false
    */
    private Boolean attachRelatedResourceTag;

    public String getInstanceId() {
        return instanceId;
    }

    public UnbindInstanceFromTagsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<TagModel> getChangeTags() {
        return changeTags;
    }

    public UnbindInstanceFromTagsRequest setChangeTags(List<TagModel> changeTags) {
        this.changeTags = changeTags;
        return this;
    }

    public Boolean getAttachRelatedResourceTag() {
        return attachRelatedResourceTag;
    }

    public UnbindInstanceFromTagsRequest setAttachRelatedResourceTag(Boolean attachRelatedResourceTag) {
        this.attachRelatedResourceTag = attachRelatedResourceTag;
        return this;
    }

}
