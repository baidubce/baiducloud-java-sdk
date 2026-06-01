package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateServiceConfigRequest extends BaseBceRequest {

    /**
    * 应用名列表，支持将配置同时更新到多个服务
    */
    private List<String> serviceNames;

    /**
    * sampleConfig
    */
    private SampleConfig sampleConfig;

    /**
    * loggingConfig
    */
    private LoggingConfig loggingConfig;

    /**
    * requestConfig
    */
    private ServiceRequestConfig requestConfig;

    /**
    * topoConfig
    */
    private ServiceTopoConfig topoConfig;

    /**
    * mllmResourceDumpConfig
    */
    private MllmResourceDumpConfig mllmResourceDumpConfig;

    public List<String> getServiceNames() {
        return serviceNames;
    }

    public UpdateServiceConfigRequest setServiceNames(List<String> serviceNames) {
        this.serviceNames = serviceNames;
        return this;
    }

    public SampleConfig getSampleConfig() {
        return sampleConfig;
    }

    public UpdateServiceConfigRequest setSampleConfig(SampleConfig sampleConfig) {
        this.sampleConfig = sampleConfig;
        return this;
    }

    public LoggingConfig getLoggingConfig() {
        return loggingConfig;
    }

    public UpdateServiceConfigRequest setLoggingConfig(LoggingConfig loggingConfig) {
        this.loggingConfig = loggingConfig;
        return this;
    }

    public ServiceRequestConfig getRequestConfig() {
        return requestConfig;
    }

    public UpdateServiceConfigRequest setRequestConfig(ServiceRequestConfig requestConfig) {
        this.requestConfig = requestConfig;
        return this;
    }

    public ServiceTopoConfig getTopoConfig() {
        return topoConfig;
    }

    public UpdateServiceConfigRequest setTopoConfig(ServiceTopoConfig topoConfig) {
        this.topoConfig = topoConfig;
        return this;
    }

    public MllmResourceDumpConfig getMllmResourceDumpConfig() {
        return mllmResourceDumpConfig;
    }

    public UpdateServiceConfigRequest setMllmResourceDumpConfig(MllmResourceDumpConfig mllmResourceDumpConfig) {
        this.mllmResourceDumpConfig = mllmResourceDumpConfig;
        return this;
    }

}
