package com.baidubce.et.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplyPhysicalDedicatedLineResponse extends BaseBceResponse {

    /**
    * 专线的ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public ApplyPhysicalDedicatedLineResponse setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "ApplyPhysicalDedicatedLineResponse{" + "id=" + id + "\n" + "}";
    }

}
