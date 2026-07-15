package com.baidubce.cloudassistant.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChildRun {
    /**
     * 子执行ID
     */
    private String id;

    /**
     * 执行状态。枚举值：FAILED（执行失败），RUNNING（执行中），SUCCESS（执行完成）
     */
    private String state;

    /**
     * 子执行对应的实例信息
     */
    private Object target;

    /**
     * 子执行开始时间。unix时间戳，单位：毫秒
     */
    private Long createdTimestamp;

    /**
     * 子执行结束时间，仅执行结束时返回。unix时间戳，单位：毫秒。
     */
    private Long finishedTimestamp;

    /**
     * output
     */
    private Output output;

    /**
     * 子执行日志内容，仅当请求参数 withLog=true 时返回
     */
    private String log;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 子执行失败原因
     */
    private String failReason;

    public ChildRun setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public ChildRun setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public ChildRun setTarget(Object target) {
        this.target = target;
        return this;
    }

    public Object getTarget() {
        return this.target;
    }

    public ChildRun setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public ChildRun setFinishedTimestamp(Long finishedTimestamp) {
        this.finishedTimestamp = finishedTimestamp;
        return this;
    }

    public Long getFinishedTimestamp() {
        return this.finishedTimestamp;
    }

    public ChildRun setOutput(Output output) {
        this.output = output;
        return this;
    }

    public Output getOutput() {
        return this.output;
    }

    public ChildRun setLog(String log) {
        this.log = log;
        return this;
    }

    public String getLog() {
        return this.log;
    }

    public ChildRun setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public ChildRun setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    public String getFailReason() {
        return this.failReason;
    }

    @Override
    public String toString() {
        return "ChildRun{" + "id=" + id + "\n" + "state=" + state + "\n" + "target=" + target + "\n" + "createdTimestamp=" + createdTimestamp + "\n" + "finishedTimestamp="
                + finishedTimestamp + "\n" + "output=" + output + "\n" + "log=" + log + "\n" + "errorCode=" + errorCode + "\n" + "failReason=" + failReason + "\n" + "}";
    }

}