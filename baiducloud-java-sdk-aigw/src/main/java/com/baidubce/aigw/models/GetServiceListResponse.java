package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetServiceListResponse extends BaseBceResponse {

    /**
    * 服务名称
    */
    private String serviceName;

    /**
    * 服务命名空间
    */
    private String namespace;

    /**
    * 关联集群 ID；非 CCE 服务可能为空
    */
    private String clusterId;

    public String getServiceName() {
        return serviceName;
    }

    public GetServiceListResponse setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getNamespace() {
        return namespace;
    }

    public GetServiceListResponse setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }

    public GetServiceListResponse setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    @Override
    public String toString() {
        return "GetServiceListResponse{" + "serviceName=" + serviceName + "\n" + "namespace=" + namespace + "\n" + "clusterId=" + clusterId + "\n" + "}";
    }

}
