package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TargetService {
    /**
     * 服务来源：CCE、FIXED_IP、DNS_DOMAIN、CFC、AI_PROXY
     */
    private String serviceSource;

    /**
     * 服务名称
     */
    private String serviceName;

    /**
     * CCE 服务所在命名空间
     */
    private String namespace;

    /**
     * CCE 服务端口
     */
    private Integer servicePort;

    /**
     * 负载均衡算法
     */
    private String loadBalanceAlgorithm;

    /**
     * 哈希类型
     */
    private String hashType;

    /**
     * 哈希键
     */
    private String hashKey;

    /**
     * ratio 策略的请求比例
     */
    private Integer requestRatio;

    /**
     * 动态权重因子
     */
    private Integer weightFactor;

    /**
     * model_name 策略的模型名称
     */
    private String modelName;

    /**
     * AI_PROXY 模型名称模式
     */
    private String modelNameMode;

    /**
     * AI_PROXY 指定的模型名称
     */
    private String specifiedModelName;

    public TargetService setServiceSource(String serviceSource) {
        this.serviceSource = serviceSource;
        return this;
    }

    public String getServiceSource() {
        return this.serviceSource;
    }

    public TargetService setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public TargetService setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public TargetService setServicePort(Integer servicePort) {
        this.servicePort = servicePort;
        return this;
    }

    public Integer getServicePort() {
        return this.servicePort;
    }

    public TargetService setLoadBalanceAlgorithm(String loadBalanceAlgorithm) {
        this.loadBalanceAlgorithm = loadBalanceAlgorithm;
        return this;
    }

    public String getLoadBalanceAlgorithm() {
        return this.loadBalanceAlgorithm;
    }

    public TargetService setHashType(String hashType) {
        this.hashType = hashType;
        return this;
    }

    public String getHashType() {
        return this.hashType;
    }

    public TargetService setHashKey(String hashKey) {
        this.hashKey = hashKey;
        return this;
    }

    public String getHashKey() {
        return this.hashKey;
    }

    public TargetService setRequestRatio(Integer requestRatio) {
        this.requestRatio = requestRatio;
        return this;
    }

    public Integer getRequestRatio() {
        return this.requestRatio;
    }

    public TargetService setWeightFactor(Integer weightFactor) {
        this.weightFactor = weightFactor;
        return this;
    }

    public Integer getWeightFactor() {
        return this.weightFactor;
    }

    public TargetService setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public String getModelName() {
        return this.modelName;
    }

    public TargetService setModelNameMode(String modelNameMode) {
        this.modelNameMode = modelNameMode;
        return this;
    }

    public String getModelNameMode() {
        return this.modelNameMode;
    }

    public TargetService setSpecifiedModelName(String specifiedModelName) {
        this.specifiedModelName = specifiedModelName;
        return this;
    }

    public String getSpecifiedModelName() {
        return this.specifiedModelName;
    }

    @Override
    public String toString() {
        return "TargetService{" + "serviceSource=" + serviceSource + "\n" + "serviceName=" + serviceName + "\n" + "namespace=" + namespace + "\n" + "servicePort=" + servicePort
                + "\n" + "loadBalanceAlgorithm=" + loadBalanceAlgorithm + "\n" + "hashType=" + hashType + "\n" + "hashKey=" + hashKey + "\n" + "requestRatio=" + requestRatio
                + "\n" + "weightFactor=" + weightFactor + "\n" + "modelName=" + modelName + "\n" + "modelNameMode=" + modelNameMode + "\n" + "specifiedModelName="
                + specifiedModelName + "\n" + "}";
    }

}