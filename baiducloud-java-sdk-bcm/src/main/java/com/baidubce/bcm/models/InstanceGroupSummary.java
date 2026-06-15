package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceGroupSummary {
    /**
     * 实例组ID
     */
    private String id;

    /**
     * 实例组名称
     */
    private String name;

    /**
     * 云产品类型
     */
    private String scope;

    /**
     * 资源类型
     */
    private String resourceType;

    /**
     * 实例个数
     */
    private Integer instanceCount;

    public InstanceGroupSummary setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public InstanceGroupSummary setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public InstanceGroupSummary setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getScope() {
        return this.scope;
    }

    public InstanceGroupSummary setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public InstanceGroupSummary setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    @Override
    public String toString() {
        return "InstanceGroupSummary{" + "id=" + id + "\n" + "name=" + name + "\n" + "scope=" + scope + "\n" + "resourceType=" + resourceType + "\n" + "instanceCount="
                + instanceCount + "\n" + "}";
    }

}