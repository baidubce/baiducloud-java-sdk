package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyInstanceHostnameRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 是否自动重启，默认false
    */
    private Boolean reboot;

    /**
    * 是否开启hostname domain true:是 false:否，默认false
    */
    private Boolean isOpenHostnameDomain;

    /**
    * 实例主机名
    */
    private String hostname;

    /**
    * 是否允许hostname重复 true:是 false:否，默认false
    */
    private Boolean isAllowHostnameRepeat;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyInstanceHostnameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Boolean getReboot() {
        return reboot;
    }

    public ModifyInstanceHostnameRequest setReboot(Boolean reboot) {
        this.reboot = reboot;
        return this;
    }

    public Boolean getIsOpenHostnameDomain() {
        return isOpenHostnameDomain;
    }

    public ModifyInstanceHostnameRequest setIsOpenHostnameDomain(Boolean isOpenHostnameDomain) {
        this.isOpenHostnameDomain = isOpenHostnameDomain;
        return this;
    }

    public String getHostname() {
        return hostname;
    }

    public ModifyInstanceHostnameRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    public Boolean getIsAllowHostnameRepeat() {
        return isAllowHostnameRepeat;
    }

    public ModifyInstanceHostnameRequest setIsAllowHostnameRepeat(Boolean isAllowHostnameRepeat) {
        this.isAllowHostnameRepeat = isAllowHostnameRepeat;
        return this;
    }

}
