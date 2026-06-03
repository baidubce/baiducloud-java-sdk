package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeInstanceResponse extends BaseBceResponse {

    /**
    * instanceInfo
    */
    private InstanceInfo instanceInfo;

    public InstanceInfo getInstanceInfo() {
        return instanceInfo;
    }

    public DescribeInstanceResponse setInstanceInfo(InstanceInfo instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeInstanceResponse{" + "instanceInfo=" + instanceInfo + "\n" + "}";
    }

}
