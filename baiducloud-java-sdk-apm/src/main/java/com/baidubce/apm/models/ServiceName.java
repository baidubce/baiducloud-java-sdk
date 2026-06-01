package com.baidubce.apm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceName {
    /**
     * 应用名称
     */
    private String serviceName;

    /**
     * 应用ID
     */
    private String serviceId;

    /**
     * 部署名称
     */
    private String serviceDisplayName;

    /**
     * 语言
     */
    private String language;

    /**
     * 是否为大模型应用
     */
    private Boolean includeLLM;

    public ServiceName setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public ServiceName setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public ServiceName setServiceDisplayName(String serviceDisplayName) {
        this.serviceDisplayName = serviceDisplayName;
        return this;
    }

    public String getServiceDisplayName() {
        return this.serviceDisplayName;
    }

    public ServiceName setLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getLanguage() {
        return this.language;
    }

    public ServiceName setIncludeLLM(Boolean includeLLM) {
        this.includeLLM = includeLLM;
        return this;
    }

    public Boolean getIncludeLLM() {
        return this.includeLLM;
    }

    @Override
    public String toString() {
        return "ServiceName{" + "serviceName=" + serviceName + "\n" + "serviceId=" + serviceId + "\n" + "serviceDisplayName=" + serviceDisplayName + "\n" + "language=" + language
                + "\n" + "includeLLM=" + includeLLM + "\n" + "}";
    }

}