package com.baidubce.bci.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateImageCacheResponse extends BaseBceResponse {

    /**
    * 镜像缓存ID
    */
    private String imageCacheId;

    public String getImageCacheId() {
        return imageCacheId;
    }

    public CreateImageCacheResponse setImageCacheId(String imageCacheId) {
        this.imageCacheId = imageCacheId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateImageCacheResponse{" + "imageCacheId=" + imageCacheId + "\n" + "}";
    }

}
