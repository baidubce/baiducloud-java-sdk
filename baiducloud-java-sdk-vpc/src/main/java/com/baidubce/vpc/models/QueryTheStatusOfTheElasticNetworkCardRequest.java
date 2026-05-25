package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheStatusOfTheElasticNetworkCardRequest extends BaseBceRequest {

    /**
    * eniId
    */
    @JsonIgnore
    private String eniId;

    public String getEniId() {
        return eniId;
    }

    public QueryTheStatusOfTheElasticNetworkCardRequest setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

}
