package com.baidubce.apm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeServiceConfigResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 状态码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * 语言
    */
    private String language;

    /**
    * 是否是LLM应用
    */
    private Boolean includeLLM;

    /**
    * 服务显示名，当该字段被设置时，Console应用名称显示该字段
    */
    private String serviceDisplayName;

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

    public Boolean getSuccess() {
        return success;
    }

    public DescribeServiceConfigResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeServiceConfigResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeServiceConfigResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public DescribeServiceConfigResponse setLanguage(String language) {
        this.language = language;
        return this;
    }

    public Boolean getIncludeLLM() {
        return includeLLM;
    }

    public DescribeServiceConfigResponse setIncludeLLM(Boolean includeLLM) {
        this.includeLLM = includeLLM;
        return this;
    }

    public String getServiceDisplayName() {
        return serviceDisplayName;
    }

    public DescribeServiceConfigResponse setServiceDisplayName(String serviceDisplayName) {
        this.serviceDisplayName = serviceDisplayName;
        return this;
    }

    public SampleConfig getSampleConfig() {
        return sampleConfig;
    }

    public DescribeServiceConfigResponse setSampleConfig(SampleConfig sampleConfig) {
        this.sampleConfig = sampleConfig;
        return this;
    }

    public LoggingConfig getLoggingConfig() {
        return loggingConfig;
    }

    public DescribeServiceConfigResponse setLoggingConfig(LoggingConfig loggingConfig) {
        this.loggingConfig = loggingConfig;
        return this;
    }

    public ServiceRequestConfig getRequestConfig() {
        return requestConfig;
    }

    public DescribeServiceConfigResponse setRequestConfig(ServiceRequestConfig requestConfig) {
        this.requestConfig = requestConfig;
        return this;
    }

    public ServiceTopoConfig getTopoConfig() {
        return topoConfig;
    }

    public DescribeServiceConfigResponse setTopoConfig(ServiceTopoConfig topoConfig) {
        this.topoConfig = topoConfig;
        return this;
    }

    public MllmResourceDumpConfig getMllmResourceDumpConfig() {
        return mllmResourceDumpConfig;
    }

    public DescribeServiceConfigResponse setMllmResourceDumpConfig(MllmResourceDumpConfig mllmResourceDumpConfig) {
        this.mllmResourceDumpConfig = mllmResourceDumpConfig;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeServiceConfigResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "language=" + language + "\n" + "includeLLM="
                + includeLLM + "\n" + "serviceDisplayName=" + serviceDisplayName + "\n" + "sampleConfig=" + sampleConfig + "\n" + "loggingConfig=" + loggingConfig + "\n"
                + "requestConfig=" + requestConfig + "\n" + "topoConfig=" + topoConfig + "\n" + "mllmResourceDumpConfig=" + mllmResourceDumpConfig + "\n" + "}";
    }

}
