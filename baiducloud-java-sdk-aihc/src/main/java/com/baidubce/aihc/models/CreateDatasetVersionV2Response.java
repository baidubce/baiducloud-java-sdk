package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDatasetVersionV2Response extends BaseBceResponse {

    /**
    * 数据集版本ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public CreateDatasetVersionV2Response setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "CreateDatasetVersionV2Response{" + "id=" + id + "\n" + "}";
    }

}
