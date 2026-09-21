package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KillMysqlSessionRequest extends BaseBceRequest {

    /**
    * 集群ID
    */
    private String appId;

    /**
    * 节点ID
    */
    private String nodeId;

    /**
    * idItems 指定了需要查杀的会话ID列表
    */
    private List<Integer> idItems;

    public String getAppId() {
        return appId;
    }

    public KillMysqlSessionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getNodeId() {
        return nodeId;
    }

    public KillMysqlSessionRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public List<Integer> getIdItems() {
        return idItems;
    }

    public KillMysqlSessionRequest setIdItems(List<Integer> idItems) {
        this.idItems = idItems;
        return this;
    }

}
