package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteInstanceGroupInstancesRequest extends BaseBceRequest {

    /**
    * 实例组ID
    */
    private String id;

    /**
    * 待删除的实例列表
    */
    private List<InstanceGroupInstance> instances;

    public String getId() {
        return id;
    }

    public DeleteInstanceGroupInstancesRequest setId(String id) {
        this.id = id;
        return this;
    }

    public List<InstanceGroupInstance> getInstances() {
        return instances;
    }

    public DeleteInstanceGroupInstancesRequest setInstances(List<InstanceGroupInstance> instances) {
        this.instances = instances;
        return this;
    }

}
