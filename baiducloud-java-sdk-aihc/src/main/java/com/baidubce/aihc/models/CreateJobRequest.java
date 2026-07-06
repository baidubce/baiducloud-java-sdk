package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateJobRequest extends BaseBceRequest {

    /**
    * 名称
    */
    private String name;

    /**
    * 训练任务所属队列，保持和queueID一致即可
    */
    private String queue;

    /**
    * 分布式框架类型，支持PyTorchJob，TFJob，MPIJob，RayJob。默认值：PyTorchJob
    */
    private String jobType;

    /**
    * jobSpec
    */
    private JobSpec jobSpec;

    /**
    * 启动命令
    */
    private String command;

    /**
    * 训练任务标签，默认包含：  1. aijob.cce.baidubce.com/create-from-aihcp-api: "true"  2. aijob.cce.baidubce.com/ai-user-id: {accoutId}  3. aijob.cce.baidubce.com/ai-user-name: {userName}
    */
    private List<Label> labels;

    /**
    * 调度优先级，支持高（high）、中（normal）、低（low），默认值：normal
    */
    private String priority;

    /**
    * 数据源配置，当前支持pfs、hostpath、bos、cfs、rapidfs、dataset
    */
    private List<DataSource> datasources;

    /**
    * 是否开启BCCL自动注入，默认值为关闭。当前开启条件:  1.实例数大于等于 2   2.每个实例占整机 8 卡   3.任务开启 RDMA  4.卡型号为A800/HPAS
    */
    private Boolean enableBccl;

    /**
    * 是否开启容错， 默认值为 关闭，目前PyTorchJob支持容错
    */
    private Boolean faultTolerance;

    /**
    * 容错配置："--enable-replace=true --enable-hang-detection=true --hang-detection-log-timeout-minutes=7 --hang-detection-startup-toleration-minutes=15
    * --hang-detection-stack-timeout-minutes=3 --max-num-of-unconditional-retry=2 --custom-log-patterns=timeout1 --custom-log-patterns=timeout2"
    */
    private String faultToleranceArgs;

    /**
    * tensorboardConfig
    */
    private TensorboardConfig tensorboardConfig;

    /**
    * alertConfig
    */
    private AlertConfig alertConfig;

    /**
    * 任务运行完成后的保留时间，参数格式参考：1m、1h、1d，分别代表1分钟、1小时、1天，RayJob暂不支持任务保留时间
    */
    private String retentionPeriod;

    /**
    * advancedSettings
    */
    private AdvancedSettings advancedSettings;

    public String getName() {
        return name;
    }

    public CreateJobRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getQueue() {
        return queue;
    }

    public CreateJobRequest setQueue(String queue) {
        this.queue = queue;
        return this;
    }

    public String getJobType() {
        return jobType;
    }

    public CreateJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    public JobSpec getJobSpec() {
        return jobSpec;
    }

    public CreateJobRequest setJobSpec(JobSpec jobSpec) {
        this.jobSpec = jobSpec;
        return this;
    }

    public String getCommand() {
        return command;
    }

    public CreateJobRequest setCommand(String command) {
        this.command = command;
        return this;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public CreateJobRequest setLabels(List<Label> labels) {
        this.labels = labels;
        return this;
    }

    public String getPriority() {
        return priority;
    }

    public CreateJobRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }

    public List<DataSource> getDatasources() {
        return datasources;
    }

    public CreateJobRequest setDatasources(List<DataSource> datasources) {
        this.datasources = datasources;
        return this;
    }

    public Boolean getEnableBccl() {
        return enableBccl;
    }

    public CreateJobRequest setEnableBccl(Boolean enableBccl) {
        this.enableBccl = enableBccl;
        return this;
    }

    public Boolean getFaultTolerance() {
        return faultTolerance;
    }

    public CreateJobRequest setFaultTolerance(Boolean faultTolerance) {
        this.faultTolerance = faultTolerance;
        return this;
    }

    public String getFaultToleranceArgs() {
        return faultToleranceArgs;
    }

    public CreateJobRequest setFaultToleranceArgs(String faultToleranceArgs) {
        this.faultToleranceArgs = faultToleranceArgs;
        return this;
    }

    public TensorboardConfig getTensorboardConfig() {
        return tensorboardConfig;
    }

    public CreateJobRequest setTensorboardConfig(TensorboardConfig tensorboardConfig) {
        this.tensorboardConfig = tensorboardConfig;
        return this;
    }

    public AlertConfig getAlertConfig() {
        return alertConfig;
    }

    public CreateJobRequest setAlertConfig(AlertConfig alertConfig) {
        this.alertConfig = alertConfig;
        return this;
    }

    public String getRetentionPeriod() {
        return retentionPeriod;
    }

    public CreateJobRequest setRetentionPeriod(String retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
    }

    public AdvancedSettings getAdvancedSettings() {
        return advancedSettings;
    }

    public CreateJobRequest setAdvancedSettings(AdvancedSettings advancedSettings) {
        this.advancedSettings = advancedSettings;
        return this;
    }

}
