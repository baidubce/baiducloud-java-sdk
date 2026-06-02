package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLbdcRequest extends BaseBceRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;

    public String getId() {
        return id;
    }

    public DescribeLbdcRequest setId(String id) {
        this.id = id;
        return this;
    }

}
