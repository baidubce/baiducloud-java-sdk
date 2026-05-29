package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAppBlbIpGroupRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * name
    */
    @JsonIgnore
    private String name;

    /**
    * exactlyMatch
    */
    @JsonIgnore
    private Boolean exactlyMatch;

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

    public DescribeAppBlbIpGroupRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getName() {
        return name;
    }

    public DescribeAppBlbIpGroupRequest setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getExactlyMatch() {
        return exactlyMatch;
    }

    public DescribeAppBlbIpGroupRequest setExactlyMatch(Boolean exactlyMatch) {
        this.exactlyMatch = exactlyMatch;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeAppBlbIpGroupRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeAppBlbIpGroupRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
