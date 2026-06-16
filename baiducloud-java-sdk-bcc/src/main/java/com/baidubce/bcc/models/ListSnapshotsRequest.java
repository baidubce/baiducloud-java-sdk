package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListSnapshotsRequest extends BaseBceRequest {

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
    * volumeId
    */
    @JsonIgnore
    private String volumeId;

    public String getMarker() {
        return marker;
    }

    public ListSnapshotsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListSnapshotsRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getVolumeId() {
        return volumeId;
    }

    public ListSnapshotsRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

}
