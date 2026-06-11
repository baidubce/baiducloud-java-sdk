package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteImageRequest extends BaseBceRequest {

    /**
    * imageId
    */
    @JsonIgnore
    private String imageId;

    public String getImageId() {
        return imageId;
    }

    public DeleteImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

}
