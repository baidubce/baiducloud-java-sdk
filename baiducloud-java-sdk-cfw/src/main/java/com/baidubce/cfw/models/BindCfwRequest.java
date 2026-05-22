package com.baidubce.cfw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindCfwRequest extends BaseBceRequest {

    /**
    * cfwId
    */
    @JsonIgnore
    private String cfwId;

    /**
    * 实例类型，取值 \[ eip \| nat \|  etGateway \| peerconn \| csn \| ipv6Gateway ]
    */
    private String instanceType;

    /**
    * 绑定实例信息
    */
    private List<CfwBind> instances;

    public String getCfwId() {
        return cfwId;
    }

    public BindCfwRequest setCfwId(String cfwId) {
        this.cfwId = cfwId;
        return this;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public BindCfwRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public List<CfwBind> getInstances() {
        return instances;
    }

    public BindCfwRequest setInstances(List<CfwBind> instances) {
        this.instances = instances;
        return this;
    }

}
