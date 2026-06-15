package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateInstanceGroupRequest extends BaseBceRequest {

    /**
    * 实例组ID
    */
    private String id;

    /**
    * 云产品类型
    */
    private String scope;

    /**
    * 资源类型
    */
    private String resourceType;

    /**
    * 实例组名称
    */
    private String name;

    /**
    * 实例列表
    */
    private List<InstanceGroupInstance> instances;

    public String getId() {
        return id;
    }

    public UpdateInstanceGroupRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public UpdateInstanceGroupRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public UpdateInstanceGroupRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateInstanceGroupRequest setName(String name) {
        this.name = name;
        return this;
    }

    public List<InstanceGroupInstance> getInstances() {
        return instances;
    }

    public UpdateInstanceGroupRequest setInstances(List<InstanceGroupInstance> instances) {
        this.instances = instances;
        return this;
    }

}
