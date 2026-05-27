package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAppBlbServerGroupRsRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * sgId
    */
    @JsonIgnore
    private String sgId;

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

    public DescribeAppBlbServerGroupRsRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getSgId() {
        return sgId;
    }

    public DescribeAppBlbServerGroupRsRequest setSgId(String sgId) {
        this.sgId = sgId;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeAppBlbServerGroupRsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeAppBlbServerGroupRsRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
