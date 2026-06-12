package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateModelVersionResponse extends BaseBceResponse {

    /**
    * 模型版本ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public CreateModelVersionResponse setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "CreateModelVersionResponse{" + "id=" + id + "\n" + "}";
    }

}
