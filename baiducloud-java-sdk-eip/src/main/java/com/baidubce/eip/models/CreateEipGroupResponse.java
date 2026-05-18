package com.baidubce.eip.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEipGroupResponse extends BaseBceResponse {

    /**
    * 分配的实例ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public CreateEipGroupResponse setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "CreateEipGroupResponse{" + "id=" + id + "\n" + "}";
    }

}
