package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeCacheNodeQuotaRequest extends BaseBceRequest {

    /**
    * RapidFS 实例 ID
    */
    private String instanceId;

    public String getInstanceId() {
        return instanceId;
    }

    public DescribeCacheNodeQuotaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

}
