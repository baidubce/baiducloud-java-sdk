package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateInstanceTagsRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 标签键值对信息
    */
    private List<LogicalTag> tags;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateInstanceTagsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<LogicalTag> getTags() {
        return tags;
    }

    public UpdateInstanceTagsRequest setTags(List<LogicalTag> tags) {
        this.tags = tags;
        return this;
    }

}
