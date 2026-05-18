package com.baidubce.eip.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEipBpResponse extends BaseBceResponse {

    /**
    * 带宽包id
    */
    private String id;

    public String getId() {
        return id;
    }

    public CreateEipBpResponse setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "CreateEipBpResponse{" + "id=" + id + "\n" + "}";
    }

}
