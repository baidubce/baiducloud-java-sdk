package com.baidubce.apm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LLMService {
    /**
     * 服务名称
     */
    private String serviceName;

    /**
     * 服务显示名
     */
    private String serviceDisplayName;

    /**
     * 服务ID
     */
    private String serviceId;

    /**
     * 标签列表
     */
    private List<Tag> tags;

    /**
     * llmRequests
     */
    private MetricValue llmRequests;

    /**
     * llmRequestsPerSecond
     */
    private MetricValue llmRequestsPerSecond;

    /**
     * llmErrors
     */
    private MetricValue llmErrors;

    /**
     * llmDurationSeconds
     */
    private MetricValue llmDurationSeconds;

    /**
     * llmTokens
     */
    private MetricValue llmTokens;

    public LLMService setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public LLMService setServiceDisplayName(String serviceDisplayName) {
        this.serviceDisplayName = serviceDisplayName;
        return this;
    }

    public String getServiceDisplayName() {
        return this.serviceDisplayName;
    }

    public LLMService setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public LLMService setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public LLMService setLlmRequests(MetricValue llmRequests) {
        this.llmRequests = llmRequests;
        return this;
    }

    public MetricValue getLlmRequests() {
        return this.llmRequests;
    }

    public LLMService setLlmRequestsPerSecond(MetricValue llmRequestsPerSecond) {
        this.llmRequestsPerSecond = llmRequestsPerSecond;
        return this;
    }

    public MetricValue getLlmRequestsPerSecond() {
        return this.llmRequestsPerSecond;
    }

    public LLMService setLlmErrors(MetricValue llmErrors) {
        this.llmErrors = llmErrors;
        return this;
    }

    public MetricValue getLlmErrors() {
        return this.llmErrors;
    }

    public LLMService setLlmDurationSeconds(MetricValue llmDurationSeconds) {
        this.llmDurationSeconds = llmDurationSeconds;
        return this;
    }

    public MetricValue getLlmDurationSeconds() {
        return this.llmDurationSeconds;
    }

    public LLMService setLlmTokens(MetricValue llmTokens) {
        this.llmTokens = llmTokens;
        return this;
    }

    public MetricValue getLlmTokens() {
        return this.llmTokens;
    }

    @Override
    public String toString() {
        return "LLMService{" + "serviceName=" + serviceName + "\n" + "serviceDisplayName=" + serviceDisplayName + "\n" + "serviceId=" + serviceId + "\n" + "tags=" + tags + "\n"
                + "llmRequests=" + llmRequests + "\n" + "llmRequestsPerSecond=" + llmRequestsPerSecond + "\n" + "llmErrors=" + llmErrors + "\n" + "llmDurationSeconds="
                + llmDurationSeconds + "\n" + "llmTokens=" + llmTokens + "\n" + "}";
    }

}