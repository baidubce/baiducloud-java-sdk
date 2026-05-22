package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAppBlbsRequest extends BaseBceRequest {

    /**
    * address
    */
    @JsonIgnore
    private String address;

    /**
    * name
    */
    @JsonIgnore
    private String name;

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * bccId
    */
    @JsonIgnore
    private String bccId;

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

    public String getAddress() {
        return address;
    }

    public DescribeAppBlbsRequest setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getName() {
        return name;
    }

    public DescribeAppBlbsRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getBlbId() {
        return blbId;
    }

    public DescribeAppBlbsRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getBccId() {
        return bccId;
    }

    public DescribeAppBlbsRequest setBccId(String bccId) {
        this.bccId = bccId;
        return this;
    }

    public Boolean getExactlyMatch() {
        return exactlyMatch;
    }

    public DescribeAppBlbsRequest setExactlyMatch(Boolean exactlyMatch) {
        this.exactlyMatch = exactlyMatch;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeAppBlbsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeAppBlbsRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
