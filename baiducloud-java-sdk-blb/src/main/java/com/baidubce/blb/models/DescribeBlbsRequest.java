package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeBlbsRequest extends BaseBceRequest {

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

    /**
    * type
    */
    @JsonIgnore
    private String type;

    public String getAddress() {
        return address;
    }

    public DescribeBlbsRequest setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getName() {
        return name;
    }

    public DescribeBlbsRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getBlbId() {
        return blbId;
    }

    public DescribeBlbsRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getBccId() {
        return bccId;
    }

    public DescribeBlbsRequest setBccId(String bccId) {
        this.bccId = bccId;
        return this;
    }

    public Boolean getExactlyMatch() {
        return exactlyMatch;
    }

    public DescribeBlbsRequest setExactlyMatch(Boolean exactlyMatch) {
        this.exactlyMatch = exactlyMatch;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeBlbsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeBlbsRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getType() {
        return type;
    }

    public DescribeBlbsRequest setType(String type) {
        this.type = type;
        return this;
    }

}
