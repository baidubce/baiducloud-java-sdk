package com.baidubce.et.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDedicatedChannelResponse extends BaseBceResponse {

    /**
    * 专线通道的ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public CreateDedicatedChannelResponse setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "CreateDedicatedChannelResponse{" + "id=" + id + "\n" + "}";
    }

}
