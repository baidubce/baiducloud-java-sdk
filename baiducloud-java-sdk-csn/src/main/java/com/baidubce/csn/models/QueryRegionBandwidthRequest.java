package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryRegionBandwidthRequest extends BaseBceRequest {

    /**
    * csnBpId
    */
    @JsonIgnore
    private String csnBpId;

    public String getCsnBpId() {
        return csnBpId;
    }

    public QueryRegionBandwidthRequest setCsnBpId(String csnBpId) {
        this.csnBpId = csnBpId;
        return this;
    }

}
