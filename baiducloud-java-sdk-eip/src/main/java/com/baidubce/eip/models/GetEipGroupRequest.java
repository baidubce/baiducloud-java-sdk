package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetEipGroupRequest extends BaseBceRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;

    public String getId() {
        return id;
    }

    public GetEipGroupRequest setId(String id) {
        this.id = id;
        return this;
    }

}
