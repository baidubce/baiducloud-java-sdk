package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeL3MountTargetRequest extends BaseBceRequest {

    /**
    * PFS实例ID
    */
    private String instanceId;

    /**
    * 挂载点ID
    */
    private String mountTargetId;

    public String getInstanceId() {
        return instanceId;
    }

    public DescribeL3MountTargetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getMountTargetId() {
        return mountTargetId;
    }

    public DescribeL3MountTargetRequest setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
        return this;
    }

}
