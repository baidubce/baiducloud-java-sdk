package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HighAvailabilityVirtualIpUnbindingInstanceRequest extends BaseBceRequest {

    /**
    * haVipId
    */
    @JsonIgnore
    private String haVipId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 解绑的实例ID列表，列表长度不大于5
    */
    private List<String> instanceIds;

    /**
    * 解绑的实例类型，"SERVER"表示云服务器（BCC/BBC/DCC），"ENI"表示弹性网卡
    */
    private String instanceType;

    public String getHaVipId() {
        return haVipId;
    }

    public HighAvailabilityVirtualIpUnbindingInstanceRequest setHaVipId(String haVipId) {
        this.haVipId = haVipId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public HighAvailabilityVirtualIpUnbindingInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public HighAvailabilityVirtualIpUnbindingInstanceRequest setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public HighAvailabilityVirtualIpUnbindingInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

}
