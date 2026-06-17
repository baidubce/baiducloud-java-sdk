package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeFastQueryRequest extends BaseBceRequest {

    /**
    * fastQueryName
    */
    @JsonIgnore
    private String fastQueryName;

    public String getFastQueryName() {
        return fastQueryName;
    }

    public DescribeFastQueryRequest setFastQueryName(String fastQueryName) {
        this.fastQueryName = fastQueryName;
        return this;
    }

}
