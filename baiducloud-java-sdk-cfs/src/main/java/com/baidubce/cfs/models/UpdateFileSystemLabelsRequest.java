package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateFileSystemLabelsRequest extends BaseBceRequest {

    /**
    * tag
    */
    @JsonIgnore
    private String tag;

    /**
    * FileSystem ID 列表
    */
    private List<String> fsId;

    /**
    * tags
    */
    private List<Tag> tags;

    public String getTag() {
        return tag;
    }

    public UpdateFileSystemLabelsRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public List<String> getFsId() {
        return fsId;
    }

    public UpdateFileSystemLabelsRequest setFsId(List<String> fsId) {
        this.fsId = fsId;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public UpdateFileSystemLabelsRequest setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

}
