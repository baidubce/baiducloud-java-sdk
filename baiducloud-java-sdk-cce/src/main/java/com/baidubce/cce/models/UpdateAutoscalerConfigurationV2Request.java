package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAutoscalerConfigurationV2Request extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

    /**
    * 自动扩缩容选组策略。可选值：random、most-pods、least-waste、priority。默认值为 random。
    */
    private String expander;

    /**
    * 节点组的 Autoscaler 配置。用户无需输入此项内容。
    */
    private List<Object> instanceGroups;

    /**
    * K8S 版本。为空时，后台会自动查询集群 K8S 版本号。
    */
    private String kubeVersion;

    /**
    * 最大并发缩容数
    */
    private Integer maxEmptyBulkDelete;

    /**
    * 扩容后缩容启动时延，单位为分钟
    */
    private Integer scaleDownDelayAfterAdd;

    /**
    * 是否启用缩容。默认值为 false。
    */
    private Boolean scaleDownEnabled;

    /**
    * GPU 缩容阈值百分比，取值范围为 (0, 100)。
    */
    private Integer scaleDownGPUUtilizationThreshold;

    /**
    * 缩容触发时延，单位为分钟。
    */
    private Integer scaleDownUnneededTime;

    /**
    * 缩容阈值百分比，取值范围为 (0, 100)。
    */
    private Integer scaleDownUtilizationThreshold;

    /**
    * 是否跳过使用本地存储的节点。默认值为 true。
    */
    private Boolean skipNodesWithLocalStorage;

    /**
    * 是否跳过有部署系统 Pod 的节点。默认值为 true。
    */
    private Boolean skipNodesWithSystemPods;

    /**
    * 用户自定义配置。
    */
    private Map<String, String> customConfigs;

    public String getClusterID() {
        return clusterID;
    }

    public UpdateAutoscalerConfigurationV2Request setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getExpander() {
        return expander;
    }

    public UpdateAutoscalerConfigurationV2Request setExpander(String expander) {
        this.expander = expander;
        return this;
    }

    public List<Object> getInstanceGroups() {
        return instanceGroups;
    }

    public UpdateAutoscalerConfigurationV2Request setInstanceGroups(List<Object> instanceGroups) {
        this.instanceGroups = instanceGroups;
        return this;
    }

    public String getKubeVersion() {
        return kubeVersion;
    }

    public UpdateAutoscalerConfigurationV2Request setKubeVersion(String kubeVersion) {
        this.kubeVersion = kubeVersion;
        return this;
    }

    public Integer getMaxEmptyBulkDelete() {
        return maxEmptyBulkDelete;
    }

    public UpdateAutoscalerConfigurationV2Request setMaxEmptyBulkDelete(Integer maxEmptyBulkDelete) {
        this.maxEmptyBulkDelete = maxEmptyBulkDelete;
        return this;
    }

    public Integer getScaleDownDelayAfterAdd() {
        return scaleDownDelayAfterAdd;
    }

    public UpdateAutoscalerConfigurationV2Request setScaleDownDelayAfterAdd(Integer scaleDownDelayAfterAdd) {
        this.scaleDownDelayAfterAdd = scaleDownDelayAfterAdd;
        return this;
    }

    public Boolean getScaleDownEnabled() {
        return scaleDownEnabled;
    }

    public UpdateAutoscalerConfigurationV2Request setScaleDownEnabled(Boolean scaleDownEnabled) {
        this.scaleDownEnabled = scaleDownEnabled;
        return this;
    }

    public Integer getScaleDownGPUUtilizationThreshold() {
        return scaleDownGPUUtilizationThreshold;
    }

    public UpdateAutoscalerConfigurationV2Request setScaleDownGPUUtilizationThreshold(Integer scaleDownGPUUtilizationThreshold) {
        this.scaleDownGPUUtilizationThreshold = scaleDownGPUUtilizationThreshold;
        return this;
    }

    public Integer getScaleDownUnneededTime() {
        return scaleDownUnneededTime;
    }

    public UpdateAutoscalerConfigurationV2Request setScaleDownUnneededTime(Integer scaleDownUnneededTime) {
        this.scaleDownUnneededTime = scaleDownUnneededTime;
        return this;
    }

    public Integer getScaleDownUtilizationThreshold() {
        return scaleDownUtilizationThreshold;
    }

    public UpdateAutoscalerConfigurationV2Request setScaleDownUtilizationThreshold(Integer scaleDownUtilizationThreshold) {
        this.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
        return this;
    }

    public Boolean getSkipNodesWithLocalStorage() {
        return skipNodesWithLocalStorage;
    }

    public UpdateAutoscalerConfigurationV2Request setSkipNodesWithLocalStorage(Boolean skipNodesWithLocalStorage) {
        this.skipNodesWithLocalStorage = skipNodesWithLocalStorage;
        return this;
    }

    public Boolean getSkipNodesWithSystemPods() {
        return skipNodesWithSystemPods;
    }

    public UpdateAutoscalerConfigurationV2Request setSkipNodesWithSystemPods(Boolean skipNodesWithSystemPods) {
        this.skipNodesWithSystemPods = skipNodesWithSystemPods;
        return this;
    }

    public Map<String, String> getCustomConfigs() {
        return customConfigs;
    }

    public UpdateAutoscalerConfigurationV2Request setCustomConfigs(Map<String, String> customConfigs) {
        this.customConfigs = customConfigs;
        return this;
    }

}
