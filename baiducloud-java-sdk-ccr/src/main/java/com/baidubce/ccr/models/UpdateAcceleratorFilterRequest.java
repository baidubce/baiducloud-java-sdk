package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAcceleratorFilterRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * policyId
    */
    @JsonIgnore
    private String policyId;

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

    public UpdateAcceleratorFilterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }

    public UpdateAcceleratorFilterRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateAcceleratorFilterRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<AcceleratorFilter> getFilters() {
        return filters;
    }

    public UpdateAcceleratorFilterRequest setFilters(List<AcceleratorFilter> filters) {
        this.filters = filters;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateAcceleratorFilterRequest setName(String name) {
        this.name = name;
        return this;
    }

}
