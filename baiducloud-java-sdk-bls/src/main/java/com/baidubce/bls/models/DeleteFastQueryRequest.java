package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteFastQueryRequest extends BaseBceRequest {

    /**
    * fastQueryName
    */
    @JsonIgnore
    private String fastQueryName;

    public String getFastQueryName() {
        return fastQueryName;
    }

    public DeleteFastQueryRequest setFastQueryName(String fastQueryName) {
        this.fastQueryName = fastQueryName;
        return this;
    }

}
