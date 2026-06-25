package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteCustomScrapeTaskRequest extends BaseBceRequest {

    /**
    * scrapeJobId
    */
    @JsonIgnore
    private String scrapeJobId;

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

    public String getScrapeJobId() {
        return scrapeJobId;
    }

    public DeleteCustomScrapeTaskRequest setScrapeJobId(String scrapeJobId) {
        this.scrapeJobId = scrapeJobId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteCustomScrapeTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAgentId() {
        return agentId;
    }

    public DeleteCustomScrapeTaskRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

}
