package com.baidubce.pfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BucketLinkInfo {
    /**
     * 数据流动任务ID
     */
    private String bucketlinkId;

    /**
     * 数据流动任务名字
     */
    private String bucketlinkName;

    /**
     * PFS实例短ID
     */
    private String instanceId;

    /**
     * • 0 导出任务<br>• 1 导入任务
     */
    private Integer transferType;

    /**
     * 数据流动任务创建时间
     */
    private String createTime;

    /**
     * 数据流动任务结束时间
     */
    private String finishTime;

    /**
     * 冲突策略<br>• 1 覆盖策略<br>• 2 跳过策略<br>• 3 保留两者
     */
    private Integer conflictPolicy;

    /**
     * 任务吞吐上限，单位byte
     */
    private Integer throughputLimit;

    /**
     * 任务状态<br>• 0 任务初始化中<br>• 1 运行中<br>• 2 已成功<br>• 3 任务失败<br>• 4 取消中<br>• 5 已取消<br>• 6 删除中<br>• 7 暂停中<br>• 8 已暂停
     */
    private Integer status;

    /**
     * 数据源路径
     */
    private String src;

    /**
     * 数据目的路径
     */
    private String dst;

    /**
     * 进度情况(0 ~ 100)，在运行中时生效
     */
    private Integer progress;

    /**
     * 任务报告，在任务结束（已成功、任务失败、已取消）时生效
     */
    private String report;

    /**
     * 只有当数据流动为周期性任务时，该字段才会返回执行周期信息
     */
    private String cron;

    /**
     * 只有当数据流动为跨账号任务时，该字段才会返回
     */
    private String bucketBelongUserId;

    /**
     * 只有当数据流动为跨账号 & bucket使用了lcc专属集群，该字段才会返回
     */
    private String lccId;

    /**
     * 任务可见范围，1：主账号以及子账号全部可见，2：仅主账号和子账号可见
     */
    private Integer scope;

    public BucketLinkInfo setBucketlinkId(String bucketlinkId) {
        this.bucketlinkId = bucketlinkId;
        return this;
    }

    public String getBucketlinkId() {
        return this.bucketlinkId;
    }

    public BucketLinkInfo setBucketlinkName(String bucketlinkName) {
        this.bucketlinkName = bucketlinkName;
        return this;
    }

    public String getBucketlinkName() {
        return this.bucketlinkName;
    }

    public BucketLinkInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public BucketLinkInfo setTransferType(Integer transferType) {
        this.transferType = transferType;
        return this;
    }

    public Integer getTransferType() {
        return this.transferType;
    }

    public BucketLinkInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public BucketLinkInfo setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    public String getFinishTime() {
        return this.finishTime;
    }

    public BucketLinkInfo setConflictPolicy(Integer conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
        return this;
    }

    public Integer getConflictPolicy() {
        return this.conflictPolicy;
    }

    public BucketLinkInfo setThroughputLimit(Integer throughputLimit) {
        this.throughputLimit = throughputLimit;
        return this;
    }

    public Integer getThroughputLimit() {
        return this.throughputLimit;
    }

    public BucketLinkInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    public BucketLinkInfo setSrc(String src) {
        this.src = src;
        return this;
    }

    public String getSrc() {
        return this.src;
    }

    public BucketLinkInfo setDst(String dst) {
        this.dst = dst;
        return this;
    }

    public String getDst() {
        return this.dst;
    }

    public BucketLinkInfo setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    public Integer getProgress() {
        return this.progress;
    }

    public BucketLinkInfo setReport(String report) {
        this.report = report;
        return this;
    }

    public String getReport() {
        return this.report;
    }

    public BucketLinkInfo setCron(String cron) {
        this.cron = cron;
        return this;
    }

    public String getCron() {
        return this.cron;
    }

    public BucketLinkInfo setBucketBelongUserId(String bucketBelongUserId) {
        this.bucketBelongUserId = bucketBelongUserId;
        return this;
    }

    public String getBucketBelongUserId() {
        return this.bucketBelongUserId;
    }

    public BucketLinkInfo setLccId(String lccId) {
        this.lccId = lccId;
        return this;
    }

    public String getLccId() {
        return this.lccId;
    }

    public BucketLinkInfo setScope(Integer scope) {
        this.scope = scope;
        return this;
    }

    public Integer getScope() {
        return this.scope;
    }

    @Override
    public String toString() {
        return "BucketLinkInfo{" + "bucketlinkId=" + bucketlinkId + "\n" + "bucketlinkName=" + bucketlinkName + "\n" + "instanceId=" + instanceId + "\n" + "transferType="
                + transferType + "\n" + "createTime=" + createTime + "\n" + "finishTime=" + finishTime + "\n" + "conflictPolicy=" + conflictPolicy + "\n" + "throughputLimit="
                + throughputLimit + "\n" + "status=" + status + "\n" + "src=" + src + "\n" + "dst=" + dst + "\n" + "progress=" + progress + "\n" + "report=" + report + "\n"
                + "cron=" + cron + "\n" + "bucketBelongUserId=" + bucketBelongUserId + "\n" + "lccId=" + lccId + "\n" + "scope=" + scope + "\n" + "}";
    }

}