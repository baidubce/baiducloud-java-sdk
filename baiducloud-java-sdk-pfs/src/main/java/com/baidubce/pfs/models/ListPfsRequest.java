package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListPfsRequest extends BaseBceRequest {

    /**
    * maxKeys
    */
    @JsonIgnore
    private Integer maxKeys;

    /**
    * marker
    */
    @JsonIgnore
    private String marker;

    /**
    * filterTag
    */
    @JsonIgnore
    private String filterTag;

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListPfsRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListPfsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public String getFilterTag() {
        return filterTag;
    }

    public ListPfsRequest setFilterTag(String filterTag) {
        this.filterTag = filterTag;
        return this;
    }

}
