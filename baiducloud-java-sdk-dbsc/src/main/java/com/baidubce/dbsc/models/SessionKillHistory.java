package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SessionKillHistory {
    /**
     * 会话ID
     */
    private Integer sessionId;

    /**
     * 会话连接用户
     */
    private String sessionUser;

    /**
     * 会话客户端Host
     */
    private String sessionHost;

    /**
     * 会话连接DB
     */
    private String sessionDb;

    /**
     * 会话执行的命令类型
     */
    private String sessionCommand;

    /**
     * 会话持续的时间，单位秒
     */
    private Integer sessionExecuteTime;

    /**
     * 会话状态
     */
    private String sessionState;

    /**
     * 会话执行的SQL
     */
    private String sessionSql;

    /**
     * 查杀会话任务的状态值
     */
    private Integer status;

    /**
     * 查杀会话任务的状态描述
     */
    private String statusDesc;

    /**
     * 查杀会话任务的详情，一般查杀失败时会展示
     */
    private String statusInfo;

    /**
     * 操作时间
     */
    private String operateTime;

    public SessionKillHistory setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public Integer getSessionId() {
        return this.sessionId;
    }

    public SessionKillHistory setSessionUser(String sessionUser) {
        this.sessionUser = sessionUser;
        return this;
    }

    public String getSessionUser() {
        return this.sessionUser;
    }

    public SessionKillHistory setSessionHost(String sessionHost) {
        this.sessionHost = sessionHost;
        return this;
    }

    public String getSessionHost() {
        return this.sessionHost;
    }

    public SessionKillHistory setSessionDb(String sessionDb) {
        this.sessionDb = sessionDb;
        return this;
    }

    public String getSessionDb() {
        return this.sessionDb;
    }

    public SessionKillHistory setSessionCommand(String sessionCommand) {
        this.sessionCommand = sessionCommand;
        return this;
    }

    public String getSessionCommand() {
        return this.sessionCommand;
    }

    public SessionKillHistory setSessionExecuteTime(Integer sessionExecuteTime) {
        this.sessionExecuteTime = sessionExecuteTime;
        return this;
    }

    public Integer getSessionExecuteTime() {
        return this.sessionExecuteTime;
    }

    public SessionKillHistory setSessionState(String sessionState) {
        this.sessionState = sessionState;
        return this;
    }

    public String getSessionState() {
        return this.sessionState;
    }

    public SessionKillHistory setSessionSql(String sessionSql) {
        this.sessionSql = sessionSql;
        return this;
    }

    public String getSessionSql() {
        return this.sessionSql;
    }

    public SessionKillHistory setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    public SessionKillHistory setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }

    public String getStatusDesc() {
        return this.statusDesc;
    }

    public SessionKillHistory setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }

    public String getStatusInfo() {
        return this.statusInfo;
    }

    public SessionKillHistory setOperateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }

    public String getOperateTime() {
        return this.operateTime;
    }

    @Override
    public String toString() {
        return "SessionKillHistory{" + "sessionId=" + sessionId + "\n" + "sessionUser=" + sessionUser + "\n" + "sessionHost=" + sessionHost + "\n" + "sessionDb=" + sessionDb
                + "\n" + "sessionCommand=" + sessionCommand + "\n" + "sessionExecuteTime=" + sessionExecuteTime + "\n" + "sessionState=" + sessionState + "\n" + "sessionSql="
                + sessionSql + "\n" + "status=" + status + "\n" + "statusDesc=" + statusDesc + "\n" + "statusInfo=" + statusInfo + "\n" + "operateTime=" + operateTime + "\n"
                + "}";
    }

}