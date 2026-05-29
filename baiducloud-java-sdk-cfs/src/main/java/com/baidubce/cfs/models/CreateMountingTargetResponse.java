package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateMountingTargetResponse extends BaseBceResponse {

    /**
    * 分配的服务dns，通过此dns执行文件系统挂载，即可访问服务
    */
    private String domain;

    /**
    * MountTarget的ID
    */
    private String mountId;

    public String getDomain() {
        return domain;
    }

    public CreateMountingTargetResponse setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getMountId() {
        return mountId;
    }

    public CreateMountingTargetResponse setMountId(String mountId) {
        this.mountId = mountId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateMountingTargetResponse{" + "domain=" + domain + "\n" + "mountId=" + mountId + "\n" + "}";
    }

}
