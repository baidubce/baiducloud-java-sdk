package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDatasetVersionResponse extends BaseBceResponse {

    /**
    * 数据集版本ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public CreateDatasetVersionResponse setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "CreateDatasetVersionResponse{" + "id=" + id + "\n" + "}";
    }

}
