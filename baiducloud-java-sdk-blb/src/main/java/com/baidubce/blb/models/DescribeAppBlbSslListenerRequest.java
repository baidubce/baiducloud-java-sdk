package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAppBlbSslListenerRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * listenerPort
    */
    @JsonIgnore
    private Integer listenerPort;

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

    public String getBlbId() {
        return blbId;
    }

    public DescribeAppBlbSslListenerRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public Integer getListenerPort() {
        return listenerPort;
    }

    public DescribeAppBlbSslListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeAppBlbSslListenerRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeAppBlbSslListenerRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
