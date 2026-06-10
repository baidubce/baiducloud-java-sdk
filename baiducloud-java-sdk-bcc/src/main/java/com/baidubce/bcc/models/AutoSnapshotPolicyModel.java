package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoSnapshotPolicyModel {
    /**
     * 自动快照策略ID（查询磁盘详情返回）
     */
    private String id;

    /**
     * 自动快照策略名称,支持大小写字母、数字、中文以及-_ /.特殊字符, 必须以字母开头, 长度1-65。（查询磁盘详情返回）
     */
    private String name;

    /**
     * 
     */
    private List<Integer> timePoints;

    /**
     * 指定自动快照的重复日期。选定周一到周日中需要创建快照的日期, 参数为0~6的数字, 如: 0表示周一。允许选择多个日期。传递参数为一个带有格式的Json Array: [0, 1...6]。（查询磁盘详情返回）
     */
    private List<Integer> repeatWeekdays;

    /**
     * 快照状态, 有active(运行)、deleted(删除)、paused(暂停)三种状态（查询磁盘详情返回）
     */
    private String status;

    /**
     * 指定自动快照的保留时间, 单位为天。-1: 永久保存 1~65536: 指定保存天数。（查询磁盘详情返回）
     */
    private Integer retentionDays;

    /**
     * 自动快照策略的创建时间, 符合BCE规范的日期格式 (自该字段起, 及之后字段, 在volume的接口中没有返回)
     */
    private String createdTime;

    /**
     * 自动快照策略的最近更新时间, 符合BCE规范的日期格式
     */
    private String updatedTime;

    /**
     * 自动快照策略的删除时间, 符合BCE规范的日期格式
     */
    private String deletedTime;

    /**
     * 自动快照策略的最后执行时间, 符合BCE规范的日期格式
     */
    private String lastExecuteTime;

    /**
     * 关联磁盘数量
     */
    private Integer volumeCount;

    public AutoSnapshotPolicyModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public AutoSnapshotPolicyModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AutoSnapshotPolicyModel setTimePoints(List<Integer> timePoints) {
        this.timePoints = timePoints;
        return this;
    }

    public List<Integer> getTimePoints() {
        return this.timePoints;
    }

    public AutoSnapshotPolicyModel setRepeatWeekdays(List<Integer> repeatWeekdays) {
        this.repeatWeekdays = repeatWeekdays;
        return this;
    }

    public List<Integer> getRepeatWeekdays() {
        return this.repeatWeekdays;
    }

    public AutoSnapshotPolicyModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public AutoSnapshotPolicyModel setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public AutoSnapshotPolicyModel setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public AutoSnapshotPolicyModel setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    public AutoSnapshotPolicyModel setDeletedTime(String deletedTime) {
        this.deletedTime = deletedTime;
        return this;
    }

    public String getDeletedTime() {
        return this.deletedTime;
    }

    public AutoSnapshotPolicyModel setLastExecuteTime(String lastExecuteTime) {
        this.lastExecuteTime = lastExecuteTime;
        return this;
    }

    public String getLastExecuteTime() {
        return this.lastExecuteTime;
    }

    public AutoSnapshotPolicyModel setVolumeCount(Integer volumeCount) {
        this.volumeCount = volumeCount;
        return this;
    }

    public Integer getVolumeCount() {
        return this.volumeCount;
    }

    @Override
    public String toString() {
        return "AutoSnapshotPolicyModel{" + "id=" + id + "\n" + "name=" + name + "\n" + "timePoints=" + timePoints + "\n" + "repeatWeekdays=" + repeatWeekdays + "\n" + "status="
                + status + "\n" + "retentionDays=" + retentionDays + "\n" + "createdTime=" + createdTime + "\n" + "updatedTime=" + updatedTime + "\n" + "deletedTime="
                + deletedTime + "\n" + "lastExecuteTime=" + lastExecuteTime + "\n" + "volumeCount=" + volumeCount + "\n" + "}";
    }

}