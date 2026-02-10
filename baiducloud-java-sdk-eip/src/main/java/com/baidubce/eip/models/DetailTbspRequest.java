package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DetailTbspRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;


    public String getId() {
        return id;
    }

    public DetailTbspRequest setId(String id) {
        this.id = id;
        return this;
    }


}
