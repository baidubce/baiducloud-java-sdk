package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteLogStoreViewRequest extends BaseBceRequest {

    /**
    * 日志视图名称
    */
    private String name;

    /**
    * 日志组名称
    */
    private String project;

    public String getName() {
        return name;
    }

    public DeleteLogStoreViewRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getProject() {
        return project;
    }

    public DeleteLogStoreViewRequest setProject(String project) {
        this.project = project;
        return this;
    }

}
