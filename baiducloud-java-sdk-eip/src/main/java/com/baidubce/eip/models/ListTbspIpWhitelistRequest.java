package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTbspIpWhitelistRequest {

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
    * ipCidr
    */
    @JsonIgnore
    private String ipCidr;

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

    public ListTbspIpWhitelistRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public ListTbspIpWhitelistRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIpCidr() {
        return ipCidr;
    }

    public ListTbspIpWhitelistRequest setIpCidr(String ipCidr) {
        this.ipCidr = ipCidr;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListTbspIpWhitelistRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListTbspIpWhitelistRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }


}
