package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateL2BucketLinkRequest extends BaseBceRequest {

    /**
    * PFS实例ID
    */
    private String instanceId;

    /**
    * 冲突策略<br><li>1 覆盖策略<br><li>2 跳过策略<br><li>3 保留两者
    */
    private String conflictPolicy;

    /**
    * 任务流动的BOS bucket name，最长长度64
    */
    private String bucketName;

    /**
    * 任务流动的BOS bucket prefix，要求：<br><li>非"/"开始<br><li>以"/"结尾<br><li>最长长度1000<br><li>路径不支持"." ".."
    */
    private String bucketPrefix;

    /**
    * 任务流动限流，单位byte，当前只支持3个档位，分别是600MB, 1200MB, 1500MB，即：<br><li>629145600<br><li>1258291200<br><li>1572864000
    */
    private String throughputLimitBytes;

    /**
    * 任务流动报告保存的object名字<br><li>最长长度978<br><li>路径不支持"." ".."
    */
    private String reportObjectName;

    /**
    * 任务流动名称，最长长度128，(中文64)
    */
    private String bucketLinkName;

    /**
    * 任务流动类型<br><li>0 导出任务(PFS -> BOS)<br><li>1 导入任务(BOS -> PFS)
    */
    private Integer transferType;

    /**
    * 任务流动的PFS路径，要求：<br><li>以"/"开始<br><li>非"/"结尾<br><li>最长长度1000<br><li>路径不支持"." ".."
    */
    private String pfsPath;

    /**
    * 标识是否为周期性数据流动，如果为一次性任务，则不需要提供此字段，否者需要提供周期性运行规则；cron字段是一个类crontab的语法，但仅支持最简单的<code>\*</code> + <code>数字</code> 的语法：<code>\* \* \* \* \*</code> 分别对应<code>分 时 日 月
    * 周</code>这几个字段，下面是几个例子：<br><code>0 0 \* \* \*</code> 每天0点0分执行一次<br><code>0 0 1 \* \*</code> 每月的一日0点0分执行一次<br><code>0 0 \* \* 1</code> 每周一的0点0分执行一次
    * <br>说明：cron字段仅支持传入以下时间表达方式：每天的几点几分、每月的某日几点几分或每周几的几点几分，其他表达方式将被拒绝。
    */
    private String cron;

    /**
    * 跨账号字段，标明跨账号的目标用户主账号userid
    */
    private String bucketBelongUserId;

    /**
    * 当跨账号启动时，如果bucket所属lcc专区，则需要额外标名对应的bucket所属的LccID信息
    */
    private String lccId;

    /**
    * 任务可见范围，1：主账号以及子账号全部可见，2：仅主账号和子账号可见
    */
    private Integer scope;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateL2BucketLinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getConflictPolicy() {
        return conflictPolicy;
    }

    public CreateL2BucketLinkRequest setConflictPolicy(String conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
        return this;
    }

    public String getBucketName() {
        return bucketName;
    }

    public CreateL2BucketLinkRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    public String getBucketPrefix() {
        return bucketPrefix;
    }

    public CreateL2BucketLinkRequest setBucketPrefix(String bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
        return this;
    }

    public String getThroughputLimitBytes() {
        return throughputLimitBytes;
    }

    public CreateL2BucketLinkRequest setThroughputLimitBytes(String throughputLimitBytes) {
        this.throughputLimitBytes = throughputLimitBytes;
        return this;
    }

    public String getReportObjectName() {
        return reportObjectName;
    }

    public CreateL2BucketLinkRequest setReportObjectName(String reportObjectName) {
        this.reportObjectName = reportObjectName;
        return this;
    }

    public String getBucketLinkName() {
        return bucketLinkName;
    }

    public CreateL2BucketLinkRequest setBucketLinkName(String bucketLinkName) {
        this.bucketLinkName = bucketLinkName;
        return this;
    }

    public Integer getTransferType() {
        return transferType;
    }

    public CreateL2BucketLinkRequest setTransferType(Integer transferType) {
        this.transferType = transferType;
        return this;
    }

    public String getPfsPath() {
        return pfsPath;
    }

    public CreateL2BucketLinkRequest setPfsPath(String pfsPath) {
        this.pfsPath = pfsPath;
        return this;
    }

    public String getCron() {
        return cron;
    }

    public CreateL2BucketLinkRequest setCron(String cron) {
        this.cron = cron;
        return this;
    }

    public String getBucketBelongUserId() {
        return bucketBelongUserId;
    }

    public CreateL2BucketLinkRequest setBucketBelongUserId(String bucketBelongUserId) {
        this.bucketBelongUserId = bucketBelongUserId;
        return this;
    }

    public String getLccId() {
        return lccId;
    }

    public CreateL2BucketLinkRequest setLccId(String lccId) {
        this.lccId = lccId;
        return this;
    }

    public Integer getScope() {
        return scope;
    }

    public CreateL2BucketLinkRequest setScope(Integer scope) {
        this.scope = scope;
        return this;
    }

}
