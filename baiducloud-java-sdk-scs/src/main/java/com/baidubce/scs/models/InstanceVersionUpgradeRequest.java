package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceVersionUpgradeRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 升级大版本时的版本号。非大版本升级时为空。<li>升级版本要高于现在的版本。<li>3系标准版可以升级到6系、7系<li> 4系可以升级到6系、7系<li> 5系可以升级到6系、7系<li>6系可以升到7系
    */
    private String kernelVersion;

    /**
    * 执行时间。<li> false：立即执行<li>true：维护时间内执行
    */
    private Boolean isDefer;

    public String getInstanceId() {
        return instanceId;
    }

    public InstanceVersionUpgradeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getKernelVersion() {
        return kernelVersion;
    }

    public InstanceVersionUpgradeRequest setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }

    public Boolean getIsDefer() {
        return isDefer;
    }

    public InstanceVersionUpgradeRequest setIsDefer(Boolean isDefer) {
        this.isDefer = isDefer;
        return this;
    }

}
