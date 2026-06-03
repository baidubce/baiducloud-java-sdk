package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResizeInstanceRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * RapidFS 实例 ID
    */
    private String instanceId;

    /**
    * 扩缩容后的目标容量，单位 TiB
    */
    private Integer capacityTiB;

    public String getClientToken() {
        return clientToken;
    }

    public ResizeInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public ResizeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Integer getCapacityTiB() {
        return capacityTiB;
    }

    public ResizeInstanceRequest setCapacityTiB(Integer capacityTiB) {
        this.capacityTiB = capacityTiB;
        return this;
    }

}
