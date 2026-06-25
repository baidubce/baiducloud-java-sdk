package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCustomScrapeTaskRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * agentId
    */
    @JsonIgnore
    private String agentId;

    /**
    * 抓取任务配置，示例值见请求示例
    */
    private String config;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateCustomScrapeTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAgentId() {
        return agentId;
    }

    public CreateCustomScrapeTaskRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getConfig() {
        return config;
    }

    public CreateCustomScrapeTaskRequest setConfig(String config) {
        this.config = config;
        return this;
    }

}
