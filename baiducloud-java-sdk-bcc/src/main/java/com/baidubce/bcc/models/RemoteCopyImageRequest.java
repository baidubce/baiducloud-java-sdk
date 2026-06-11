package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoteCopyImageRequest extends BaseBceRequest {

    /**
    * imageId
    */
    @JsonIgnore
    private String imageId;

    /**
    * 复制镜像名
    */
    private String name;

    /**
    * 目的regionId，可以传多个
    */
    private List<String> destRegion;

    public String getImageId() {
        return imageId;
    }

    public RemoteCopyImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public String getName() {
        return name;
    }

    public RemoteCopyImageRequest setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getDestRegion() {
        return destRegion;
    }

    public RemoteCopyImageRequest setDestRegion(List<String> destRegion) {
        this.destRegion = destRegion;
        return this;
    }

}
