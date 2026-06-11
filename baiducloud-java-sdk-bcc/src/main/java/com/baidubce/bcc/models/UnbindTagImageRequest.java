package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnbindTagImageRequest extends BaseBceRequest {

    /**
    * imageId
    */
    @JsonIgnore
    private String imageId;

    /**
    * 待解绑的标签列表
    */
    private List<TagModel> changeTags;

    public String getImageId() {
        return imageId;
    }

    public UnbindTagImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public List<TagModel> getChangeTags() {
        return changeTags;
    }

    public UnbindTagImageRequest setChangeTags(List<TagModel> changeTags) {
        this.changeTags = changeTags;
        return this;
    }

}
