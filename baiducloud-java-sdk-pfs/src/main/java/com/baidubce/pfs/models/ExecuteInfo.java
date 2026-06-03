package com.baidubce.pfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExecuteInfo {
    /**
     * 任务子ID
     */
    private String jobId;

    /**
     * 任务触发时间
     */
    private String triggerTime;

    /**
     * 任务执行状态<br>• 0: 任务成功<br>• 1: 任务失败(有报告)<br>• 2: 任务失败(没报告)
     */
    private Integer status;

    /**
     * 错误提示信息
     */
    private String errmsg;

    /**
     * 任务报告所在的bos路径
     */
    private String report;

    public ExecuteInfo setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public String getJobId() {
        return this.jobId;
    }

    public ExecuteInfo setTriggerTime(String triggerTime) {
        this.triggerTime = triggerTime;
        return this;
    }

    public String getTriggerTime() {
        return this.triggerTime;
    }

    public ExecuteInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    public ExecuteInfo setErrmsg(String errmsg) {
        this.errmsg = errmsg;
        return this;
    }

    public String getErrmsg() {
        return this.errmsg;
    }

    public ExecuteInfo setReport(String report) {
        this.report = report;
        return this;
    }

    public String getReport() {
        return this.report;
    }

    @Override
    public String toString() {
        return "ExecuteInfo{" + "jobId=" + jobId + "\n" + "triggerTime=" + triggerTime + "\n" + "status=" + status + "\n" + "errmsg=" + errmsg + "\n" + "report=" + report + "\n"
                + "}";
    }

}