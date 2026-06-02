package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLbdcsRequest extends BaseBceRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;

    /**
    * name
    */
    @JsonIgnore
    private String name;

    public String getId() {
        return id;
    }

    public DescribeLbdcsRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DescribeLbdcsRequest setName(String name) {
        this.name = name;
        return this;
    }

}
