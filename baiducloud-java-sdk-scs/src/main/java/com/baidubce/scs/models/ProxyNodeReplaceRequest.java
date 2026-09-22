package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProxyNodeReplaceRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 待替换的代理节点列表。支持单选、批量选择。
    */
    private List<String> proxyList;

    /**
    * 是否维护时间内执行。`false` 表示立即执行；`true` 表示创建维护窗口任务。默认值为 `false`。
    */
    private Boolean defer;

    public String getInstanceId() {
        return instanceId;
    }

    public ProxyNodeReplaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<String> getProxyList() {
        return proxyList;
    }

    public ProxyNodeReplaceRequest setProxyList(List<String> proxyList) {
        this.proxyList = proxyList;
        return this;
    }

    public Boolean getDefer() {
        return defer;
    }

    public ProxyNodeReplaceRequest setDefer(Boolean defer) {
        this.defer = defer;
        return this;
    }

}
