package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResolveIndexRequest extends BaseBceRequest {

    /**
    * name
    */
    @JsonIgnore
    private String name;

    public String getName() {
        return name;
    }

    public ResolveIndexRequest setName(String name) {
        this.name = name;
        return this;
    }

}
