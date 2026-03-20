package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuerySslVpnUsersRequest {

    /**
    * vpnId
    */
    @JsonIgnore
    private String vpnId;

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
    * userName
    */
    @JsonIgnore
    private String userName;

    public String getVpnId() {
        return vpnId;
    }

    public QuerySslVpnUsersRequest setVpnId(String vpnId) {
        this.vpnId = vpnId;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QuerySslVpnUsersRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QuerySslVpnUsersRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public QuerySslVpnUsersRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

}
