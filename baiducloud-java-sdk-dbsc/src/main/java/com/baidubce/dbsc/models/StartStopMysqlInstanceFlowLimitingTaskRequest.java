package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StartStopMysqlInstanceFlowLimitingTaskRequest extends BaseBceRequest {

    /**
    * 指定了限流规则ID
    */
    private Integer filterId;

    /**
    * Action 指定操作类型：ON：开启SQL限流OFF：停止SQL限流
    */
    private String action;

    /**
    * 集群ID
    */
    private String appId;

    /**
    * 节点ID
    */
    private String nodeId;

    public Integer getFilterId() {
        return filterId;
    }

    public StartStopMysqlInstanceFlowLimitingTaskRequest setFilterId(Integer filterId) {
        this.filterId = filterId;
        return this;
    }

    public String getAction() {
        return action;
    }

    public StartStopMysqlInstanceFlowLimitingTaskRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public StartStopMysqlInstanceFlowLimitingTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getNodeId() {
        return nodeId;
    }

    public StartStopMysqlInstanceFlowLimitingTaskRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

}
