package com.baidubce.et.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryDedicatedLineDetailRequest extends BaseBceRequest {

    /**
    * dcphyId
    */
    @JsonIgnore
    private String dcphyId;

    public String getDcphyId() {
        return dcphyId;
    }

    public QueryDedicatedLineDetailRequest setDcphyId(String dcphyId) {
        this.dcphyId = dcphyId;
        return this;
    }

}
