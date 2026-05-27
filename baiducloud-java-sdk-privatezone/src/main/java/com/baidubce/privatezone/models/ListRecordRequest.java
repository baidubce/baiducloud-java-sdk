package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListRecordRequest extends BaseBceRequest {

    /**
    * zoneId
    */
    @JsonIgnore
    private String zoneId;

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
    * rr
    */
    @JsonIgnore
    private String rr;

    /**
    * searchMode
    */
    @JsonIgnore
    private String searchMode;

    /**
    * type
    */
    @JsonIgnore
    private String type;

    /**
    * value
    */
    @JsonIgnore
    private String value;

    public String getZoneId() {
        return zoneId;
    }

    public ListRecordRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListRecordRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListRecordRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getRr() {
        return rr;
    }

    public ListRecordRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }

    public String getSearchMode() {
        return searchMode;
    }

    public ListRecordRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }

    public String getType() {
        return type;
    }

    public ListRecordRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getValue() {
        return value;
    }

    public ListRecordRequest setValue(String value) {
        this.value = value;
        return this;
    }

}
