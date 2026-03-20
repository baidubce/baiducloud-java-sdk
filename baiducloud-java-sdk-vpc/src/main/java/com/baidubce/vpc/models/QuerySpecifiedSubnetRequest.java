package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuerySpecifiedSubnetRequest {

    /**
    * subnetId
    */
    @JsonIgnore
    private String subnetId;

    public String getSubnetId() {
        return subnetId;
    }

    public QuerySpecifiedSubnetRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

}
