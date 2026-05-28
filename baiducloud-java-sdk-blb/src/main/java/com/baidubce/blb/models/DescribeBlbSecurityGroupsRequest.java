package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeBlbSecurityGroupsRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    public String getBlbId() {
        return blbId;
    }

    public DescribeBlbSecurityGroupsRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

}
