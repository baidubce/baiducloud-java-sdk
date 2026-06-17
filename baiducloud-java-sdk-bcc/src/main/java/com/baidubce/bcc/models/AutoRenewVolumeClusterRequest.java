package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoRenewVolumeClusterRequest extends BaseBceRequest {

    /**
    * 专属集群ID
    */
    private String clusterId;

    /**
    * 按月付费或者按年付费，月是month，年是year
    */
    private String renewTimeUnit;

    /**
    * 自动续费的时间，按月是1-9，按年是1-3
    */
    private Integer renewTime;

    public String getClusterId() {
        return clusterId;
    }

    public AutoRenewVolumeClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getRenewTimeUnit() {
        return renewTimeUnit;
    }

    public AutoRenewVolumeClusterRequest setRenewTimeUnit(String renewTimeUnit) {
        this.renewTimeUnit = renewTimeUnit;
        return this;
    }

    public Integer getRenewTime() {
        return renewTime;
    }

    public AutoRenewVolumeClusterRequest setRenewTime(Integer renewTime) {
        this.renewTime = renewTime;
        return this;
    }

}
