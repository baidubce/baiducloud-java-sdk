package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryIpGroupDetailRequest extends BaseBceRequest {

    /**
    * ipSetId
    */
    @JsonIgnore
    private String ipSetId;

    public String getIpSetId() {
        return ipSetId;
    }

    public QueryIpGroupDetailRequest setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }

}
