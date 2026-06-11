package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListImagesRequest extends BaseBceRequest {

    /**
    * marker
    */
    @JsonIgnore
    private String marker;

    /**
    * maxKeys
    */
    @JsonIgnore
    private Integer maxKeys;

    /**
    * imageType
    */
    @JsonIgnore
    private String imageType;

    /**
    * imageName
    */
    @JsonIgnore
    private String imageName;

    public String getMarker() {
        return marker;
    }

    public ListImagesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListImagesRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getImageType() {
        return imageType;
    }

    public ListImagesRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    public String getImageName() {
        return imageName;
    }

    public ListImagesRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

}
