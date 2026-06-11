package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportImageResponse extends BaseBceResponse {

    /**
    * 返回的镜像ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public ImportImageResponse setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "ImportImageResponse{" + "id=" + id + "\n" + "}";
    }

}
