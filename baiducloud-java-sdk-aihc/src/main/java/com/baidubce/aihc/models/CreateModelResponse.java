package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateModelResponse extends BaseBceResponse {

    /**
    * 模型ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public CreateModelResponse setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "CreateModelResponse{" + "id=" + id + "\n" + "}";
    }

}
