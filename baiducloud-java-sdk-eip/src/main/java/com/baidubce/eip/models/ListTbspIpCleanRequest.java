package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTbspIpCleanRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;

    /**
    * ip
    */
    @JsonIgnore
    private String ip;

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


    public String getId() {
        return id;
    }

    public ListTbspIpCleanRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public ListTbspIpCleanRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListTbspIpCleanRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListTbspIpCleanRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }


}
