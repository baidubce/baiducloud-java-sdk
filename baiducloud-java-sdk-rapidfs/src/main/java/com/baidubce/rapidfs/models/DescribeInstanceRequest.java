package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeInstanceRequest extends BaseBceRequest {

    /**
    * RapidFS 实例ID
    */
    private String instanceId;

    public String getInstanceId() {
        return instanceId;
    }

    public DescribeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

}
