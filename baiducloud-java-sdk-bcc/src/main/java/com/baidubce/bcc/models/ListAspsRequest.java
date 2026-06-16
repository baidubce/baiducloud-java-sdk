package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAspsRequest extends BaseBceRequest {

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
    * aspName
    */
    @JsonIgnore
    private String aspName;

    /**
    * volumeName
    */
    @JsonIgnore
    private String volumeName;

    public String getMarker() {
        return marker;
    }

    public ListAspsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListAspsRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getAspName() {
        return aspName;
    }

    public ListAspsRequest setAspName(String aspName) {
        this.aspName = aspName;
        return this;
    }

    public String getVolumeName() {
        return volumeName;
    }

    public ListAspsRequest setVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }

}
