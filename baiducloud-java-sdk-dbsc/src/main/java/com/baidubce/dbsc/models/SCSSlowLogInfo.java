package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SCSSlowLogInfo {
    /**
     * 慢日志内容
     */
    private String content;

    /**
     * 执行耗时（单位：微妙）
     */
    private Long logDuration;

    /**
     * 操作的key
     */
    private String logKey;

    /**
     * 命令
     */
    private String logSql;

    /**
     * 生成日志时间
     */
    private String logTime;

    /**
     * 慢日志ID
     */
    private Long slowLogId;

    /**
     * IP地址以及端口号
     */
    private String clientIp;

    public SCSSlowLogInfo setContent(String content) {
        this.content = content;
        return this;
    }

    public String getContent() {
        return this.content;
    }

    public SCSSlowLogInfo setLogDuration(Long logDuration) {
        this.logDuration = logDuration;
        return this;
    }

    public Long getLogDuration() {
        return this.logDuration;
    }

    public SCSSlowLogInfo setLogKey(String logKey) {
        this.logKey = logKey;
        return this;
    }

    public String getLogKey() {
        return this.logKey;
    }

    public SCSSlowLogInfo setLogSql(String logSql) {
        this.logSql = logSql;
        return this;
    }

    public String getLogSql() {
        return this.logSql;
    }

    public SCSSlowLogInfo setLogTime(String logTime) {
        this.logTime = logTime;
        return this;
    }

    public String getLogTime() {
        return this.logTime;
    }

    public SCSSlowLogInfo setSlowLogId(Long slowLogId) {
        this.slowLogId = slowLogId;
        return this;
    }

    public Long getSlowLogId() {
        return this.slowLogId;
    }

    public SCSSlowLogInfo setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    public String getClientIp() {
        return this.clientIp;
    }

    @Override
    public String toString() {
        return "SCSSlowLogInfo{" + "content=" + content + "\n" + "logDuration=" + logDuration + "\n" + "logKey=" + logKey + "\n" + "logSql=" + logSql + "\n" + "logTime=" + logTime
                + "\n" + "slowLogId=" + slowLogId + "\n" + "clientIp=" + clientIp + "\n" + "}";
    }

}