package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchDeleteIpRequest extends BaseBceRequest {

    /**
    * 虚机ID
    */
    private String instanceId;

    /**
    * 需要删除的IPV6/IPV4地址
    */
    private List<String> privateIps;

    public String getInstanceId() {
        return instanceId;
    }

    public BatchDeleteIpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<String> getPrivateIps() {
        return privateIps;
    }

    public BatchDeleteIpRequest setPrivateIps(List<String> privateIps) {
        this.privateIps = privateIps;
        return this;
    }

}
