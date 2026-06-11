package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateADatasetV2Response extends BaseBceResponse {

    /**
    * 数据集ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public CreateADatasetV2Response setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "CreateADatasetV2Response{" + "id=" + id + "\n" + "}";
    }

}
