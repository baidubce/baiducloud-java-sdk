package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetDnsResolverListRequest extends BaseBceRequest {

    /**
    * marker
    */
    @JsonIgnore
    private String marker;

    /**
    * maxKeys
    */
    @JsonIgnore
    private String maxKeys;

    /**
    * status
    */
    @JsonIgnore
    private String status;

    public String getMarker() {
        return marker;
    }

    public GetDnsResolverListRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public String getMaxKeys() {
        return maxKeys;
    }

    public GetDnsResolverListRequest setMaxKeys(String maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GetDnsResolverListRequest setStatus(String status) {
        this.status = status;
        return this;
    }

}
