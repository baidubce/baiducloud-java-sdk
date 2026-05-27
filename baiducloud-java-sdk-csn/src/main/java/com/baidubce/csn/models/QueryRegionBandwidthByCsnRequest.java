package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryRegionBandwidthByCsnRequest extends BaseBceRequest {

    /**
    * csnId
    */
    @JsonIgnore
    private String csnId;

    public String getCsnId() {
        return csnId;
    }

    public QueryRegionBandwidthByCsnRequest setCsnId(String csnId) {
        this.csnId = csnId;
        return this;
    }

}
