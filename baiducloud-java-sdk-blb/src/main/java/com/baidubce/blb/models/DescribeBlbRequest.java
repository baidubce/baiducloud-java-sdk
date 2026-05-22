package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeBlbRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * type
    */
    @JsonIgnore
    private String type;

    public String getBlbId() {
        return blbId;
    }

    public DescribeBlbRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getType() {
        return type;
    }

    public DescribeBlbRequest setType(String type) {
        this.type = type;
        return this;
    }

}
