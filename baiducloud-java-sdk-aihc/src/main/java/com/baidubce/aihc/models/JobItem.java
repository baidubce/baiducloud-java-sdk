package com.baidubce.aihc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JobItem {
    /**
     * 任务id
     */
    private String jobid;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 任务名称
     */
    private String name;

    /**
     * 
     */
    private String status;

    /**
     * 任务类型，如：pytorchjob、mpijob等
     */
    private String jobType;

    /**
     * 任务所在资源池Id
     */
    private String resourcePoolId;

    /**
     * 任务所在资源池队列
     */
    private String queue;

    /**
     * job
     */
    private JobSpec job;

    /**
     * 任务创建时间
     */
    private String createdAt;

    /**
     * 任务结束时间
     */
    private String finishedAt;

    /**
     * 任务的数据源配置
     */
    private List<DataSource> datasources;

    /**
     * 任务标签
     */
    private List<Label> labels;

    /**
     * 任务优先级
     */
    private String priority;

    /**
     * 任务是否开启了BCCL注入
     */
    private Boolean enableBccl;

    /**
     * BCCL注入状态,包括:  success: 注入成功  failed: 注入失败  unknown: 还未执行注入
     */
    private String enableBcclStatus;

    /**
     * BCCL注入失败原因
     */
    private String enableBcclErrorReason;

    /**
     * 是否开启容错
     */
    private Boolean enableFaultTolerance;

    /**
     * 容错配置参数
     */
    private String faultToleranceArgs;

    /**
     * 任务Pod列表，在详情接口needDetail参数为False和查询训练任务列表接口中不返回该字段
     */
    private List<Pod> pods;

    /**
     * 历史Pod列表，在详情接口needDetail参数为False和查询训练任务列表接口中不返回该字段
     */
    private List<Pod> historyPods;

    /**
     * 任务时间线详情信息，查询训练任务列表接口中不返回该字段
     */
    private List<JobTimeLine> jobTimeLine;

    public JobItem setJobid(String jobid) {
        this.jobid = jobid;
        return this;
    }

    public String getJobid() {
        return this.jobid;
    }

    public JobItem setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return this.userId;
    }

    public JobItem setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public JobItem setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public JobItem setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    public String getJobType() {
        return this.jobType;
    }

    public JobItem setResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
        return this;
    }

    public String getResourcePoolId() {
        return this.resourcePoolId;
    }

    public JobItem setQueue(String queue) {
        this.queue = queue;
        return this;
    }

    public String getQueue() {
        return this.queue;
    }

    public JobItem setJob(JobSpec job) {
        this.job = job;
        return this;
    }

    public JobSpec getJob() {
        return this.job;
    }

    public JobItem setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public JobItem setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    public String getFinishedAt() {
        return this.finishedAt;
    }

    public JobItem setDatasources(List<DataSource> datasources) {
        this.datasources = datasources;
        return this;
    }

    public List<DataSource> getDatasources() {
        return this.datasources;
    }

    public JobItem setLabels(List<Label> labels) {
        this.labels = labels;
        return this;
    }

    public List<Label> getLabels() {
        return this.labels;
    }

    public JobItem setPriority(String priority) {
        this.priority = priority;
        return this;
    }

    public String getPriority() {
        return this.priority;
    }

    public JobItem setEnableBccl(Boolean enableBccl) {
        this.enableBccl = enableBccl;
        return this;
    }

    public Boolean getEnableBccl() {
        return this.enableBccl;
    }

    public JobItem setEnableBcclStatus(String enableBcclStatus) {
        this.enableBcclStatus = enableBcclStatus;
        return this;
    }

    public String getEnableBcclStatus() {
        return this.enableBcclStatus;
    }

    public JobItem setEnableBcclErrorReason(String enableBcclErrorReason) {
        this.enableBcclErrorReason = enableBcclErrorReason;
        return this;
    }

    public String getEnableBcclErrorReason() {
        return this.enableBcclErrorReason;
    }

    public JobItem setEnableFaultTolerance(Boolean enableFaultTolerance) {
        this.enableFaultTolerance = enableFaultTolerance;
        return this;
    }

    public Boolean getEnableFaultTolerance() {
        return this.enableFaultTolerance;
    }

    public JobItem setFaultToleranceArgs(String faultToleranceArgs) {
        this.faultToleranceArgs = faultToleranceArgs;
        return this;
    }

    public String getFaultToleranceArgs() {
        return this.faultToleranceArgs;
    }

    public JobItem setPods(List<Pod> pods) {
        this.pods = pods;
        return this;
    }

    public List<Pod> getPods() {
        return this.pods;
    }

    public JobItem setHistoryPods(List<Pod> historyPods) {
        this.historyPods = historyPods;
        return this;
    }

    public List<Pod> getHistoryPods() {
        return this.historyPods;
    }

    public JobItem setJobTimeLine(List<JobTimeLine> jobTimeLine) {
        this.jobTimeLine = jobTimeLine;
        return this;
    }

    public List<JobTimeLine> getJobTimeLine() {
        return this.jobTimeLine;
    }

    @Override
    public String toString() {
        return "JobItem{" + "jobid=" + jobid + "\n" + "userId=" + userId + "\n" + "name=" + name + "\n" + "status=" + status + "\n" + "jobType=" + jobType + "\n"
                + "resourcePoolId=" + resourcePoolId + "\n" + "queue=" + queue + "\n" + "job=" + job + "\n" + "createdAt=" + createdAt + "\n" + "finishedAt=" + finishedAt + "\n"
                + "datasources=" + datasources + "\n" + "labels=" + labels + "\n" + "priority=" + priority + "\n" + "enableBccl=" + enableBccl + "\n" + "enableBcclStatus="
                + enableBcclStatus + "\n" + "enableBcclErrorReason=" + enableBcclErrorReason + "\n" + "enableFaultTolerance=" + enableFaultTolerance + "\n" + "faultToleranceArgs="
                + faultToleranceArgs + "\n" + "pods=" + pods + "\n" + "historyPods=" + historyPods + "\n" + "jobTimeLine=" + jobTimeLine + "\n" + "}";
    }

}