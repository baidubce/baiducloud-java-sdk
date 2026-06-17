package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListVolumeClustersRequest extends BaseBceRequest {

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
    * zoneName
    */
    @JsonIgnore
    private String zoneName;

    /**
    * clusterName
    */
    @JsonIgnore
    private String clusterName;

    public String getMarker() {
        return marker;
    }

    public ListVolumeClustersRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListVolumeClustersRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public ListVolumeClustersRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getClusterName() {
        return clusterName;
    }

    public ListVolumeClustersRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

}
