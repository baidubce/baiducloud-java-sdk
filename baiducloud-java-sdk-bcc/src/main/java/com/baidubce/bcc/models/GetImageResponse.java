package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetImageResponse extends BaseBceResponse {

    /**
    * image
    */
    private ImageModel image;

    public ImageModel getImage() {
        return image;
    }

    public GetImageResponse setImage(ImageModel image) {
        this.image = image;
        return this;
    }

    @Override
    public String toString() {
        return "GetImageResponse{" + "image=" + image + "\n" + "}";
    }

}
