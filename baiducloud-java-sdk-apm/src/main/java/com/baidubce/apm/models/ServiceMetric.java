package com.baidubce.apm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceMetric {
    /**
     * 服务名称
     */
    private String serviceName;

    /**
     * 服务ID
     */
    private String serviceId;

    /**
     * 标签列表
     */
    private List<Tag> tags;

    /**
     * requests
     */
    private MetricValue requests;

    /**
     * requestsPerSecond
     */
    private MetricValue requestsPerSecond;

    /**
     * errors
     */
    private MetricValue errors;

    /**
     * errorRate
     */
    private MetricValue errorRate;

    /**
     * durationSeconds
     */
    private MetricValue durationSeconds;

    public ServiceMetric setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public ServiceMetric setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public ServiceMetric setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public ServiceMetric setRequests(MetricValue requests) {
        this.requests = requests;
        return this;
    }

    public MetricValue getRequests() {
        return this.requests;
    }

    public ServiceMetric setRequestsPerSecond(MetricValue requestsPerSecond) {
        this.requestsPerSecond = requestsPerSecond;
        return this;
    }

    public MetricValue getRequestsPerSecond() {
        return this.requestsPerSecond;
    }

    public ServiceMetric setErrors(MetricValue errors) {
        this.errors = errors;
        return this;
    }

    public MetricValue getErrors() {
        return this.errors;
    }

    public ServiceMetric setErrorRate(MetricValue errorRate) {
        this.errorRate = errorRate;
        return this;
    }

    public MetricValue getErrorRate() {
        return this.errorRate;
    }

    public ServiceMetric setDurationSeconds(MetricValue durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    public MetricValue getDurationSeconds() {
        return this.durationSeconds;
    }

    @Override
    public String toString() {
        return "ServiceMetric{" + "serviceName=" + serviceName + "\n" + "serviceId=" + serviceId + "\n" + "tags=" + tags + "\n" + "requests=" + requests + "\n"
                + "requestsPerSecond=" + requestsPerSecond + "\n" + "errors=" + errors + "\n" + "errorRate=" + errorRate + "\n" + "durationSeconds=" + durationSeconds + "\n"
                + "}";
    }

}