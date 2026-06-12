package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDatasetResponse extends BaseBceResponse {

    /**
    * 数据集ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public CreateDatasetResponse setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "CreateDatasetResponse{" + "id=" + id + "\n" + "}";
    }

}
