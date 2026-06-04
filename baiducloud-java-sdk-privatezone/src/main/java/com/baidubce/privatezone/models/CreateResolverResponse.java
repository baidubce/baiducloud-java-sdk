package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateResolverResponse extends BaseBceResponse {

    /**
    * 解析器的ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public CreateResolverResponse setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "CreateResolverResponse{" + "id=" + id + "\n" + "}";
    }

}
