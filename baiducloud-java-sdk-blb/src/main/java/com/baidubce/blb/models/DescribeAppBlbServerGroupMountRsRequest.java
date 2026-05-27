package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAppBlbServerGroupMountRsRequest extends BaseBceRequest {

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

    public String getBlbId() {
        return blbId;
    }

    public DescribeAppBlbServerGroupMountRsRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getSgId() {
        return sgId;
    }

    public DescribeAppBlbServerGroupMountRsRequest setSgId(String sgId) {
        this.sgId = sgId;
        return this;
    }

}
