package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExecutionStats {
    /**
     * 报警策略ID
     */
    private String policyId;

    /**
     * 报警策略名称
     */
    private String policyName;

    /**
     * 监控对象
     */
    private List<LogStore> objects;

    /**
     * 连续触发阈值，连续多少次触发阈值则报警
     */
    private Integer pendingCount;

    /**
     * 重复报警间隔，单位：分钟，默认值：0，表示关闭重复报警
     */
    private Integer repeatIntervalMinute;

    /**
     * 报警通知模板，参考：[BCM通知模板接口](https://cloud.baidu.com/doc/BCM/s/elmiysvfo)
     */
    private List<Notice> notices;

    /**
     * 执行次数
     */
    private Integer totalCount;

    /**
     * 执行失败次数
     */
    private Integer failCount;

    /**
     * 通知次数
     */
    private Integer noticeTotalCount;

    /**
     * 通知失败次数
     */
    private Integer noticeFailCount;

    public ExecutionStats setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getPolicyId() {
        return this.policyId;
    }

    public ExecutionStats setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public ExecutionStats setObjects(List<LogStore> objects) {
        this.objects = objects;
        return this;
    }

    public List<LogStore> getObjects() {
        return this.objects;
    }

    public ExecutionStats setPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
        return this;
    }

    public Integer getPendingCount() {
        return this.pendingCount;
    }

    public ExecutionStats setRepeatIntervalMinute(Integer repeatIntervalMinute) {
        this.repeatIntervalMinute = repeatIntervalMinute;
        return this;
    }

    public Integer getRepeatIntervalMinute() {
        return this.repeatIntervalMinute;
    }

    public ExecutionStats setNotices(List<Notice> notices) {
        this.notices = notices;
        return this;
    }

    public List<Notice> getNotices() {
        return this.notices;
    }

    public ExecutionStats setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ExecutionStats setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }

    public Integer getFailCount() {
        return this.failCount;
    }

    public ExecutionStats setNoticeTotalCount(Integer noticeTotalCount) {
        this.noticeTotalCount = noticeTotalCount;
        return this;
    }

    public Integer getNoticeTotalCount() {
        return this.noticeTotalCount;
    }

    public ExecutionStats setNoticeFailCount(Integer noticeFailCount) {
        this.noticeFailCount = noticeFailCount;
        return this;
    }

    public Integer getNoticeFailCount() {
        return this.noticeFailCount;
    }

    @Override
    public String toString() {
        return "ExecutionStats{" + "policyId=" + policyId + "\n" + "policyName=" + policyName + "\n" + "objects=" + objects + "\n" + "pendingCount=" + pendingCount + "\n"
                + "repeatIntervalMinute=" + repeatIntervalMinute + "\n" + "notices=" + notices + "\n" + "totalCount=" + totalCount + "\n" + "failCount=" + failCount + "\n"
                + "noticeTotalCount=" + noticeTotalCount + "\n" + "noticeFailCount=" + noticeFailCount + "\n" + "}";
    }

}