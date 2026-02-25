package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheListOfEipsInTheRecyclingBinRequest {

    /**
    * eip
    */
    @JsonIgnore
    private String eip;

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


    public String getEip() {
        return eip;
    }

    public QueryTheListOfEipsInTheRecyclingBinRequest setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public String getName() {
        return name;
    }

    public QueryTheListOfEipsInTheRecyclingBinRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryTheListOfEipsInTheRecyclingBinRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryTheListOfEipsInTheRecyclingBinRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }


}
