package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateRedisBigKeyAnalysisTaskResponse extends BaseBceResponse {

    /**
    * 任务ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public CreateRedisBigKeyAnalysisTaskResponse setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "CreateRedisBigKeyAnalysisTaskResponse{" + "id=" + id + "\n" + "}";
    }

}
