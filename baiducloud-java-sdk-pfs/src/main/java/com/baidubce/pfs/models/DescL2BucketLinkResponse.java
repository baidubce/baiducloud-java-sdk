package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescL2BucketLinkResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    private String requestId;

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
    * <li>0 导出任务<br><li>1 导入任务
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
    * 冲突策略<br><li>1 覆盖策略<br><li>2 跳过策略<br><li>3 保留两者
    */
    private Integer conflictPolicy;

    /**
    * 任务吞吐上限，单位byte
    */
    private Integer throughputLimit;

    /**
    * 
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
    * 任务报告，在任务结束（已成功、任务失败、已取消）时生效。只有当数据流动任务为一次性任务时会返回。
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

    public String getRequestId() {
        return requestId;
    }

    public DescL2BucketLinkResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getBucketlinkId() {
        return bucketlinkId;
    }

    public DescL2BucketLinkResponse setBucketlinkId(String bucketlinkId) {
        this.bucketlinkId = bucketlinkId;
        return this;
    }

    public String getBucketlinkName() {
        return bucketlinkName;
    }

    public DescL2BucketLinkResponse setBucketlinkName(String bucketlinkName) {
        this.bucketlinkName = bucketlinkName;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public DescL2BucketLinkResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Integer getTransferType() {
        return transferType;
    }

    public DescL2BucketLinkResponse setTransferType(Integer transferType) {
        this.transferType = transferType;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public DescL2BucketLinkResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public DescL2BucketLinkResponse setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    public Integer getConflictPolicy() {
        return conflictPolicy;
    }

    public DescL2BucketLinkResponse setConflictPolicy(Integer conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
        return this;
    }

    public Integer getThroughputLimit() {
        return throughputLimit;
    }

    public DescL2BucketLinkResponse setThroughputLimit(Integer throughputLimit) {
        this.throughputLimit = throughputLimit;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public DescL2BucketLinkResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getSrc() {
        return src;
    }

    public DescL2BucketLinkResponse setSrc(String src) {
        this.src = src;
        return this;
    }

    public String getDst() {
        return dst;
    }

    public DescL2BucketLinkResponse setDst(String dst) {
        this.dst = dst;
        return this;
    }

    public Integer getProgress() {
        return progress;
    }

    public DescL2BucketLinkResponse setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    public String getReport() {
        return report;
    }

    public DescL2BucketLinkResponse setReport(String report) {
        this.report = report;
        return this;
    }

    public String getCron() {
        return cron;
    }

    public DescL2BucketLinkResponse setCron(String cron) {
        this.cron = cron;
        return this;
    }

    public String getBucketBelongUserId() {
        return bucketBelongUserId;
    }

    public DescL2BucketLinkResponse setBucketBelongUserId(String bucketBelongUserId) {
        this.bucketBelongUserId = bucketBelongUserId;
        return this;
    }

    public String getLccId() {
        return lccId;
    }

    public DescL2BucketLinkResponse setLccId(String lccId) {
        this.lccId = lccId;
        return this;
    }

    public Integer getScope() {
        return scope;
    }

    public DescL2BucketLinkResponse setScope(Integer scope) {
        this.scope = scope;
        return this;
    }

    @Override
    public String toString() {
        return "DescL2BucketLinkResponse{" + "requestId=" + requestId + "\n" + "bucketlinkId=" + bucketlinkId + "\n" + "bucketlinkName=" + bucketlinkName + "\n" + "instanceId="
                + instanceId + "\n" + "transferType=" + transferType + "\n" + "createTime=" + createTime + "\n" + "finishTime=" + finishTime + "\n" + "conflictPolicy="
                + conflictPolicy + "\n" + "throughputLimit=" + throughputLimit + "\n" + "status=" + status + "\n" + "src=" + src + "\n" + "dst=" + dst + "\n" + "progress="
                + progress + "\n" + "report=" + report + "\n" + "cron=" + cron + "\n" + "bucketBelongUserId=" + bucketBelongUserId + "\n" + "lccId=" + lccId + "\n" + "scope="
                + scope + "\n" + "}";
    }

}
