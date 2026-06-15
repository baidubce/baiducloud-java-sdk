package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DelIpv6Request extends BaseBceRequest {

    /**
    * 实例id
    */
    private String instanceId;

    /**
    * 需要释放的ipv6地址
    */
    private String ipv6Address;

    /**
    * 是否重启，true表示重启，为空表示不重启。默认不重启false。
    */
    private Boolean reboot;

    public String getInstanceId() {
        return instanceId;
    }

    public DelIpv6Request setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getIpv6Address() {
        return ipv6Address;
    }

    public DelIpv6Request setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    public Boolean getReboot() {
        return reboot;
    }

    public DelIpv6Request setReboot(Boolean reboot) {
        this.reboot = reboot;
        return this;
    }

}
