package com.baidubce.cfw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnbindCfwRequest extends BaseBceRequest {

    /**
    * cfwId
    */
    @JsonIgnore
    private String cfwId;

    /**
    * 实例类型，取值\[ eip \| nat \|  etGateway \| peerconn \| csn \| ipv6Gateway ]
    */
    private String instanceType;

    /**
    * 解绑实例信息
    */
    private List<CfwBind> instances;

    public String getCfwId() {
        return cfwId;
    }

    public UnbindCfwRequest setCfwId(String cfwId) {
        this.cfwId = cfwId;
        return this;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public UnbindCfwRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public List<CfwBind> getInstances() {
        return instances;
    }

    public UnbindCfwRequest setInstances(List<CfwBind> instances) {
        this.instances = instances;
        return this;
    }

}
