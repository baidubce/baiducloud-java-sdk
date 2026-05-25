package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HighlyAvailableVirtualIpBindingInstanceRequest extends BaseBceRequest {

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
    * 绑定的实例ID列表，列表长度不大于5
    */
    private List<String> instanceIds;

    /**
    * 绑定的实例类型，"SERVER"表示云服务器（BCC/BBC/DCC），"ENI"表示弹性网卡
    */
    private String instanceType;

    public String getHaVipId() {
        return haVipId;
    }

    public HighlyAvailableVirtualIpBindingInstanceRequest setHaVipId(String haVipId) {
        this.haVipId = haVipId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public HighlyAvailableVirtualIpBindingInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public HighlyAvailableVirtualIpBindingInstanceRequest setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public HighlyAvailableVirtualIpBindingInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

}
