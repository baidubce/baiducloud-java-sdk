package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetNatRequest extends BaseBceRequest {

    /**
    * natId
    */
    @JsonIgnore
    private String natId;

    public String getNatId() {
        return natId;
    }

    public GetNatRequest setNatId(String natId) {
        this.natId = natId;
        return this;
    }

}
