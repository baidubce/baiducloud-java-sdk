package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteL3MountTargetRequest extends BaseBceRequest {

    /**
    * PFS实例ID
    */
    private String instanceId;

    /**
    * PFS实例的挂载点ID
    */
    private String mountTargetId;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteL3MountTargetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getMountTargetId() {
        return mountTargetId;
    }

    public DeleteL3MountTargetRequest setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
        return this;
    }

}
