package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeCacheDeployGroupRequest extends BaseBceRequest {

    /**
    * RapidFS 实例 ID
    */
    private String instanceId;

    /**
    * 缓存部署组名称
    */
    private String cacheDeployGroupName;

    /**
    * K8s 集群的命名空间
    */
    private String cacheDeployGroupNS;

    public String getInstanceId() {
        return instanceId;
    }

    public DescribeCacheDeployGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getCacheDeployGroupName() {
        return cacheDeployGroupName;
    }

    public DescribeCacheDeployGroupRequest setCacheDeployGroupName(String cacheDeployGroupName) {
        this.cacheDeployGroupName = cacheDeployGroupName;
        return this;
    }

    public String getCacheDeployGroupNS() {
        return cacheDeployGroupNS;
    }

    public DescribeCacheDeployGroupRequest setCacheDeployGroupNS(String cacheDeployGroupNS) {
        this.cacheDeployGroupNS = cacheDeployGroupNS;
        return this;
    }

}
