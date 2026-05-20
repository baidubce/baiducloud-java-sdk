package com.baidubce.dns.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryDomainNameListRequest extends BaseBceRequest {

    /**
    * name
    */
    @JsonIgnore
    private String name;

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

    public String getName() {
        return name;
    }

    public QueryDomainNameListRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryDomainNameListRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryDomainNameListRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
