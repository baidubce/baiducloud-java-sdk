package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MySQLSession {
    /**
     * 数据库线程命令
     */
    private String command;

    /**
     * 数据库名称
     */
    private String db;

    /**
     * 数据库IP:Port
     */
    private String host;

    /**
     * 会话ID
     */
    private Integer id;

    /**
     * 执行的SQL
     */
    private String sqlstmt;

    /**
     * 数据库线程状态
     */
    private String state;

    /**
     * SQL执行时间
     */
    private Integer time;

    /**
     * 事务状态
     */
    private String trxState;

    /**
     * 事务执行时间
     */
    private Integer trxTime;

    /**
     * 数据库用户
     */
    private String user;

    public MySQLSession setCommand(String command) {
        this.command = command;
        return this;
    }

    public String getCommand() {
        return this.command;
    }

    public MySQLSession setDb(String db) {
        this.db = db;
        return this;
    }

    public String getDb() {
        return this.db;
    }

    public MySQLSession setHost(String host) {
        this.host = host;
        return this;
    }

    public String getHost() {
        return this.host;
    }

    public MySQLSession setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return this.id;
    }

    public MySQLSession setSqlstmt(String sqlstmt) {
        this.sqlstmt = sqlstmt;
        return this;
    }

    public String getSqlstmt() {
        return this.sqlstmt;
    }

    public MySQLSession setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public MySQLSession setTime(Integer time) {
        this.time = time;
        return this;
    }

    public Integer getTime() {
        return this.time;
    }

    public MySQLSession setTrxState(String trxState) {
        this.trxState = trxState;
        return this;
    }

    public String getTrxState() {
        return this.trxState;
    }

    public MySQLSession setTrxTime(Integer trxTime) {
        this.trxTime = trxTime;
        return this;
    }

    public Integer getTrxTime() {
        return this.trxTime;
    }

    public MySQLSession setUser(String user) {
        this.user = user;
        return this;
    }

    public String getUser() {
        return this.user;
    }

    @Override
    public String toString() {
        return "MySQLSession{" + "command=" + command + "\n" + "db=" + db + "\n" + "host=" + host + "\n" + "id=" + id + "\n" + "sqlstmt=" + sqlstmt + "\n" + "state=" + state
                + "\n" + "time=" + time + "\n" + "trxState=" + trxState + "\n" + "trxTime=" + trxTime + "\n" + "user=" + user + "\n" + "}";
    }

}