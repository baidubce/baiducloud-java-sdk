package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NewModelVersionV2Response extends BaseBceResponse {

    /**
    * 模型版本ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public NewModelVersionV2Response setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "NewModelVersionV2Response{" + "id=" + id + "\n" + "}";
    }

}
