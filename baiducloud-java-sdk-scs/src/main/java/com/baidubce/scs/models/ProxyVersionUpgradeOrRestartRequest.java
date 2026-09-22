package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProxyVersionUpgradeOrRestartRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 升级任务为空 重启任务不为空。<li>填写批量重启的proxy的showId
    */
    private List<String> proxyList;

    /**
    * 任务类型。 <li>relaunch：重启proxy；<li> latest：升级proxy版本
    */
    private String upgradeType;

    /**
    * 是否延迟执行，默认false： <li>false 立即执行 <li>true 延迟执行(维护时间窗口执行)
    */
    private Boolean isDefer;

    public String getInstanceId() {
        return instanceId;
    }

    public ProxyVersionUpgradeOrRestartRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<String> getProxyList() {
        return proxyList;
    }

    public ProxyVersionUpgradeOrRestartRequest setProxyList(List<String> proxyList) {
        this.proxyList = proxyList;
        return this;
    }

    public String getUpgradeType() {
        return upgradeType;
    }

    public ProxyVersionUpgradeOrRestartRequest setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }

    public Boolean getIsDefer() {
        return isDefer;
    }

    public ProxyVersionUpgradeOrRestartRequest setIsDefer(Boolean isDefer) {
        this.isDefer = isDefer;
        return this;
    }

}
