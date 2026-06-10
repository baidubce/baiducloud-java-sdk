package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoSnapshotPolicyInfo {
    /**
     * 快照策略ID
     */
    private String id;

    /**
     * 快照策略名称
     */
    private String name;

    /**
     * 自动快照策略中设置的执行时间点
     */
    private List<Integer> timePoints;

    /**
     * 自动快照策略中设置的执行日期
     */
    private List<Integer> repeatWeekdays;

    /**
     * 保留天数
     */
    private Integer retentionDays;

    /**
     * 快照策略状态
     */
    private String status;

    public AutoSnapshotPolicyInfo setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public AutoSnapshotPolicyInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AutoSnapshotPolicyInfo setTimePoints(List<Integer> timePoints) {
        this.timePoints = timePoints;
        return this;
    }

    public List<Integer> getTimePoints() {
        return this.timePoints;
    }

    public AutoSnapshotPolicyInfo setRepeatWeekdays(List<Integer> repeatWeekdays) {
        this.repeatWeekdays = repeatWeekdays;
        return this;
    }

    public List<Integer> getRepeatWeekdays() {
        return this.repeatWeekdays;
    }

    public AutoSnapshotPolicyInfo setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public AutoSnapshotPolicyInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "AutoSnapshotPolicyInfo{" + "id=" + id + "\n" + "name=" + name + "\n" + "timePoints=" + timePoints + "\n" + "repeatWeekdays=" + repeatWeekdays + "\n"
                + "retentionDays=" + retentionDays + "\n" + "status=" + status + "\n" + "}";
    }

}