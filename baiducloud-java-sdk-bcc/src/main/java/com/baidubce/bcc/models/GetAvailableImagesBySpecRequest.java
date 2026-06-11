package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAvailableImagesBySpecRequest extends BaseBceRequest {

    /**
    * spec
    */
    @JsonIgnore
    private String spec;

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
    * osName
    */
    @JsonIgnore
    private String osName;

    public String getSpec() {
        return spec;
    }

    public GetAvailableImagesBySpecRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public GetAvailableImagesBySpecRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public GetAvailableImagesBySpecRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getOsName() {
        return osName;
    }

    public GetAvailableImagesBySpecRequest setOsName(String osName) {
        this.osName = osName;
        return this;
    }

}
