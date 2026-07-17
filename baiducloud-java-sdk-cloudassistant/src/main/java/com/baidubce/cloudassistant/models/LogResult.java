package com.baidubce.cloudassistant.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogResult {
    /**
     * 日志内容，顺序排列
     */
    private List<Log> logs;

    /**
     * 下一次请求使用的cursor。若子执行已结束，且nextCursor=cursor，表示已无更多日志。否则，表示可能存在更多日志
     */
    private Integer nextCursor;

    /**
     * 子执行状态。枚举值：FAILED（执行失败），RUNNING（执行中），SUCCESS（执行成功），PARTIAL_FAILED（部分成功），PENDING（等待中）
     */
    private String state;

    /**
     * 子执行id
     */
    private String childId;

    public LogResult setLogs(List<Log> logs) {
        this.logs = logs;
        return this;
    }

    public List<Log> getLogs() {
        return this.logs;
    }

    public LogResult setNextCursor(Integer nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }

    public Integer getNextCursor() {
        return this.nextCursor;
    }

    public LogResult setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public LogResult setChildId(String childId) {
        this.childId = childId;
        return this;
    }

    public String getChildId() {
        return this.childId;
    }

    @Override
    public String toString() {
        return "LogResult{" + "logs=" + logs + "\n" + "nextCursor=" + nextCursor + "\n" + "state=" + state + "\n" + "childId=" + childId + "\n" + "}";
    }

}