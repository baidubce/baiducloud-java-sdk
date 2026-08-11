package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateL3MountTargetResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    private String requestId;

    /**
    * 分配的服务dns，通过此dns执行文件系统挂载，即可访问服务
    */
    private String domain;

    /**
    * 挂载点ID
    */
    private String mountTargetId;

    public String getRequestId() {
        return requestId;
    }

    public CreateL3MountTargetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public CreateL3MountTargetResponse setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getMountTargetId() {
        return mountTargetId;
    }

    public CreateL3MountTargetResponse setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateL3MountTargetResponse{" + "requestId=" + requestId + "\n" + "domain=" + domain + "\n" + "mountTargetId=" + mountTargetId + "\n" + "}";
    }

}
