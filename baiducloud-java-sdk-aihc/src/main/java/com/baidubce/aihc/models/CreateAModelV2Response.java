package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAModelV2Response extends BaseBceResponse {

    /**
    * 模型ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public CreateAModelV2Response setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "CreateAModelV2Response{" + "id=" + id + "\n" + "}";
    }

}
