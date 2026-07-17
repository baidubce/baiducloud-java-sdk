package com.baidubce.cloudassistant.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionRun {
    /**
     * 执行ID
     */
    private String id;

    /**
     * 执行状态，枚举值：FAILED（执行失败），RUNNING（执行中），SUCCESS（执行成功），PARTIAL_FAILED（部分成功），PENDING（等待中）
     */
    private String state;

    /**
     * action
     */
    private Action action;

    /**
     * 执行开始时间。unix时间戳，单位：毫秒
     */
    private Long createdTimestamp;

    /**
     * 执行结束时间，仅执行结束时返回
     */
    private Long finishedTimestamp;

    /**
     * statistics
     */
    private Statistics statistics;

    /**
     * 子执行列表，读取详情时，响应此字段
     */
    private List<ChildRun> children;

    /**
     * 子执行总数，读取详情时，响应此字段
     */
    private Integer totalCount;

    public ActionRun setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public ActionRun setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public ActionRun setAction(Action action) {
        this.action = action;
        return this;
    }

    public Action getAction() {
        return this.action;
    }

    public ActionRun setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public ActionRun setFinishedTimestamp(Long finishedTimestamp) {
        this.finishedTimestamp = finishedTimestamp;
        return this;
    }

    public Long getFinishedTimestamp() {
        return this.finishedTimestamp;
    }

    public ActionRun setStatistics(Statistics statistics) {
        this.statistics = statistics;
        return this;
    }

    public Statistics getStatistics() {
        return this.statistics;
    }

    public ActionRun setChildren(List<ChildRun> children) {
        this.children = children;
        return this;
    }

    public List<ChildRun> getChildren() {
        return this.children;
    }

    public ActionRun setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    @Override
    public String toString() {
        return "ActionRun{" + "id=" + id + "\n" + "state=" + state + "\n" + "action=" + action + "\n" + "createdTimestamp=" + createdTimestamp + "\n" + "finishedTimestamp="
                + finishedTimestamp + "\n" + "statistics=" + statistics + "\n" + "children=" + children + "\n" + "totalCount=" + totalCount + "\n" + "}";
    }

}