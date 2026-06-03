package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestAcceleratorFilterRequest extends BaseBceRequest {

    /**
    * 触发规则
    */
    private List<AcceleratorFilter> filters;

    /**
    * 镜像地址
    */
    private String repository;

    public List<AcceleratorFilter> getFilters() {
        return filters;
    }

    public TestAcceleratorFilterRequest setFilters(List<AcceleratorFilter> filters) {
        this.filters = filters;
        return this;
    }

    public String getRepository() {
        return repository;
    }

    public TestAcceleratorFilterRequest setRepository(String repository) {
        this.repository = repository;
        return this;
    }

}
