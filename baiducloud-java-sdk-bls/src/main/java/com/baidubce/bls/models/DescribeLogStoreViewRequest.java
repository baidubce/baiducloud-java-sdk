package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLogStoreViewRequest extends BaseBceRequest {

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

    public DescribeLogStoreViewRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getProject() {
        return project;
    }

    public DescribeLogStoreViewRequest setProject(String project) {
        this.project = project;
        return this;
    }

}
