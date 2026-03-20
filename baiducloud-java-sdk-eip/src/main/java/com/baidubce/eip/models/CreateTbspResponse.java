package com.baidubce.eip.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateTbspResponse extends BaseBceResponse {
    /**
     * DDoS增强防护包id
     */
    private String id;

    public CreateTbspResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CreateTbspResponse{" + "id=" + id + "\n" + "}";
    }

}