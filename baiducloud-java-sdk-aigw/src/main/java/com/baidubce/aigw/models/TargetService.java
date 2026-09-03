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
     * CCE 服务的命名空间，CCE 类型必需
     */
    private String namespace;

    /**
     * CCE 服务端口，CCE 类型必需，范围为 1～65535
     */
    private Integer servicePort;

    /**
     * 负载均衡算法：round-robin、least-conn、random、consistent-hash
     */
    private String loadBalanceAlgorithm;

    /**
     * 一致性哈希类型：header、query_param、ip、cookie
     */
    private String hashType;

    /**
     * 一致性哈希键；hashType 为 ip 时传空字符串
     */
    private String hashKey;

    /**
     * ratio 策略的流量比例，所有服务之和必须为 100
     */
    private Integer requestRatio;

    /**
     * model_name 策略匹配的模型名称
     */
    private String modelName;

    /**
     * 动态权重因子，必须为正整数，默认为 1
     */
    private Integer weightFactor;

    /**
     * AI_PROXY 模型名称模式：passthrough、specify
     */
    private String modelNameMode;

    /**
     * modelNameMode 为 specify 时使用的固定模型名称
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

    public TargetService setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public String getModelName() {
        return this.modelName;
    }

    public TargetService setWeightFactor(Integer weightFactor) {
        this.weightFactor = weightFactor;
        return this;
    }

    public Integer getWeightFactor() {
        return this.weightFactor;
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
                + "\n" + "modelName=" + modelName + "\n" + "weightFactor=" + weightFactor + "\n" + "modelNameMode=" + modelNameMode + "\n" + "specifiedModelName="
                + specifiedModelName + "\n" + "}";
    }

}