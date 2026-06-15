package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchAddIpRequest extends BaseBceRequest {

    /**
    * 虚机ID
    */
    private String instanceId;

    /**
    * 需要增加IPV6/IPV4的数量，与privateIps必须存在一个
    */
    private Integer secondaryPrivateIpAddressCount;

    /**
    * 需要增加的IPV6/IPV4地址，与secondaryPrivateIpAddressCount必须存在一个
    */
    private List<String> privateIps;

    /**
    * 是否分配IPV6，创建IPV6必须是true
    */
    private Boolean allocateMultiIpv6Addr;

    public String getInstanceId() {
        return instanceId;
    }

    public BatchAddIpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Integer getSecondaryPrivateIpAddressCount() {
        return secondaryPrivateIpAddressCount;
    }

    public BatchAddIpRequest setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
        return this;
    }

    public List<String> getPrivateIps() {
        return privateIps;
    }

    public BatchAddIpRequest setPrivateIps(List<String> privateIps) {
        this.privateIps = privateIps;
        return this;
    }

    public Boolean getAllocateMultiIpv6Addr() {
        return allocateMultiIpv6Addr;
    }

    public BatchAddIpRequest setAllocateMultiIpv6Addr(Boolean allocateMultiIpv6Addr) {
        this.allocateMultiIpv6Addr = allocateMultiIpv6Addr;
        return this;
    }

}
