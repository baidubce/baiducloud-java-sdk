package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MySQLSlowLogDetail {
    /**
     * 客户端IP
     */
    private String clientIp;

    /**
     * 客户端端口
     */
    private Integer clientPort;

    /**
     * 用户名称
     */
    private String user;

    /**
     * 会话ID
     */
    private Integer connectionId;

    /**
     * 连接数据库名称
     */
    private String currentDB;

    /**
     * SQL执行时间，单位毫秒
     */
    private Integer duration;

    /**
     * SQL锁时间
     */
    private Integer lockTime;

    /**
     * SQL开始时间
     */
    private String start;

    /**
     * SQL结束时间
     */
    private String end;

    /**
     * 归一化SQL
     */
    private String fingerprint;

    /**
     * 归一化SQL指纹
     */
    private String fingerprintMd5;

    /**
     * 方法名称
     */
    private String method;

    /**
     * SQL语句
     */
    private String query;

    /**
     * 影响行数
     */
    private Integer affectedRows;

    /**
     * 扫描行数
     */
    private Integer scanRows;

    /**
     * 返回行数
     */
    private Integer returnRows;

    /**
     * SQL类型：DMLDDL
     */
    private String sqlType;

    public MySQLSlowLogDetail setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    public String getClientIp() {
        return this.clientIp;
    }

    public MySQLSlowLogDetail setClientPort(Integer clientPort) {
        this.clientPort = clientPort;
        return this;
    }

    public Integer getClientPort() {
        return this.clientPort;
    }

    public MySQLSlowLogDetail setUser(String user) {
        this.user = user;
        return this;
    }

    public String getUser() {
        return this.user;
    }

    public MySQLSlowLogDetail setConnectionId(Integer connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    public Integer getConnectionId() {
        return this.connectionId;
    }

    public MySQLSlowLogDetail setCurrentDB(String currentDB) {
        this.currentDB = currentDB;
        return this;
    }

    public String getCurrentDB() {
        return this.currentDB;
    }

    public MySQLSlowLogDetail setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public MySQLSlowLogDetail setLockTime(Integer lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    public Integer getLockTime() {
        return this.lockTime;
    }

    public MySQLSlowLogDetail setStart(String start) {
        this.start = start;
        return this;
    }

    public String getStart() {
        return this.start;
    }

    public MySQLSlowLogDetail setEnd(String end) {
        this.end = end;
        return this;
    }

    public String getEnd() {
        return this.end;
    }

    public MySQLSlowLogDetail setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    public String getFingerprint() {
        return this.fingerprint;
    }

    public MySQLSlowLogDetail setFingerprintMd5(String fingerprintMd5) {
        this.fingerprintMd5 = fingerprintMd5;
        return this;
    }

    public String getFingerprintMd5() {
        return this.fingerprintMd5;
    }

    public MySQLSlowLogDetail setMethod(String method) {
        this.method = method;
        return this;
    }

    public String getMethod() {
        return this.method;
    }

    public MySQLSlowLogDetail setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getQuery() {
        return this.query;
    }

    public MySQLSlowLogDetail setAffectedRows(Integer affectedRows) {
        this.affectedRows = affectedRows;
        return this;
    }

    public Integer getAffectedRows() {
        return this.affectedRows;
    }

    public MySQLSlowLogDetail setScanRows(Integer scanRows) {
        this.scanRows = scanRows;
        return this;
    }

    public Integer getScanRows() {
        return this.scanRows;
    }

    public MySQLSlowLogDetail setReturnRows(Integer returnRows) {
        this.returnRows = returnRows;
        return this;
    }

    public Integer getReturnRows() {
        return this.returnRows;
    }

    public MySQLSlowLogDetail setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }

    public String getSqlType() {
        return this.sqlType;
    }

    @Override
    public String toString() {
        return "MySQLSlowLogDetail{" + "clientIp=" + clientIp + "\n" + "clientPort=" + clientPort + "\n" + "user=" + user + "\n" + "connectionId=" + connectionId + "\n"
                + "currentDB=" + currentDB + "\n" + "duration=" + duration + "\n" + "lockTime=" + lockTime + "\n" + "start=" + start + "\n" + "end=" + end + "\n" + "fingerprint="
                + fingerprint + "\n" + "fingerprintMd5=" + fingerprintMd5 + "\n" + "method=" + method + "\n" + "query=" + query + "\n" + "affectedRows=" + affectedRows + "\n"
                + "scanRows=" + scanRows + "\n" + "returnRows=" + returnRows + "\n" + "sqlType=" + sqlType + "\n" + "}";
    }

}