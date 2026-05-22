package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAppBlbPolicyRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * port
    */
    @JsonIgnore
    private Integer port;

    /**
    * type
    */
    @JsonIgnore
    private String type;

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

    public DescribeAppBlbPolicyRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public Integer getPort() {
        return port;
    }

    public DescribeAppBlbPolicyRequest setPort(Integer port) {
        this.port = port;
        return this;
    }

    public String getType() {
        return type;
    }

    public DescribeAppBlbPolicyRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeAppBlbPolicyRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeAppBlbPolicyRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
