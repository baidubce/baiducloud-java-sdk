package com.baidubce.ax.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSandboxResourcesResponse extends BaseBceResponse {

    /**
    * 沙箱实例 ID。
    */
    private String sandboxID;

    /**
    * 运行时类型。
    */
    private String runtimeType;

    /**
    * 调整状态。
    */
    private String status;

    /**
    * 容器资源状态列表。
    */
    private List<SandboxContainerResourceStatus> containers;

    /**
    * 资源调整条件。
    */
    private List<SandboxResourceCondition> conditions;

    /**
    * 状态说明。
    */
    private String message;

    public String getSandboxID() {
        return sandboxID;
    }

    public GetSandboxResourcesResponse setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }

    public String getRuntimeType() {
        return runtimeType;
    }

    public GetSandboxResourcesResponse setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GetSandboxResourcesResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public List<SandboxContainerResourceStatus> getContainers() {
        return containers;
    }

    public GetSandboxResourcesResponse setContainers(List<SandboxContainerResourceStatus> containers) {
        this.containers = containers;
        return this;
    }

    public List<SandboxResourceCondition> getConditions() {
        return conditions;
    }

    public GetSandboxResourcesResponse setConditions(List<SandboxResourceCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public GetSandboxResourcesResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "GetSandboxResourcesResponse{" + "sandboxID=" + sandboxID + "\n" + "runtimeType=" + runtimeType + "\n" + "status=" + status + "\n" + "containers=" + containers
                + "\n" + "conditions=" + conditions + "\n" + "message=" + message + "\n" + "}";
    }

}
