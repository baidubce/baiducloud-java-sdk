package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddIpv6Request extends BaseBceRequest {

    /**
    * 实例id
    */
    private String instanceId;

    /**
    * ipv6地址，为空表示自动分配ipv6
    */
    private String ipv6Address;

    /**
    * 是否重启，true表示重启，为空表示不重启
    */
    private Boolean reboot;

    public String getInstanceId() {
        return instanceId;
    }

    public AddIpv6Request setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getIpv6Address() {
        return ipv6Address;
    }

    public AddIpv6Request setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    public Boolean getReboot() {
        return reboot;
    }

    public AddIpv6Request setReboot(Boolean reboot) {
        this.reboot = reboot;
        return this;
    }

}
