package com.baidubce.dns.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryAndParseRecordListRequest extends BaseBceRequest {

    /**
    * zoneName
    */
    @JsonIgnore
    private String zoneName;

    /**
    * rr
    */
    @JsonIgnore
    private String rr;

    /**
    * id
    */
    @JsonIgnore
    private String id;

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

    public String getZoneName() {
        return zoneName;
    }

    public QueryAndParseRecordListRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getRr() {
        return rr;
    }

    public QueryAndParseRecordListRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }

    public String getId() {
        return id;
    }

    public QueryAndParseRecordListRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryAndParseRecordListRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryAndParseRecordListRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
