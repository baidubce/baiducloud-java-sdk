package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAcceleratorFilterRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 备注
    */
    private String description;

    /**
    * 触发规则
    */
    private List<AcceleratorFilter> filters;

    /**
    * 镜像按需加载规则名称
    */
    private String name;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateAcceleratorFilterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateAcceleratorFilterRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<AcceleratorFilter> getFilters() {
        return filters;
    }

    public CreateAcceleratorFilterRequest setFilters(List<AcceleratorFilter> filters) {
        this.filters = filters;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateAcceleratorFilterRequest setName(String name) {
        this.name = name;
        return this;
    }

}
