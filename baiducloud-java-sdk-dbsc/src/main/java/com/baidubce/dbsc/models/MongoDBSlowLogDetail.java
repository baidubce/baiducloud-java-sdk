package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MongoDBSlowLogDetail {
    /**
     * 命令唯一标识
     */
    private String uuid;

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
     * SQL语句
     */
    private String query;

    /**
     * SQL命令类型，比如: select,create table等
     */
    private String sqlCommand;

    /**
     * 扫描行数
     */
    private Integer scanRows;

    /**
     * 返回行数
     */
    private Integer returnRows;

    /**
     * 索引扫描行数
     */
    private Integer keyScanRows;

    /**
     * 返回结果集大小
     */
    private Integer resultLen;

    /**
     * 执行计划
     */
    private String planSummary;

    /**
     * 命名空间
     */
    private String namespace;

    public MongoDBSlowLogDetail setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getUuid() {
        return this.uuid;
    }

    public MongoDBSlowLogDetail setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    public String getClientIp() {
        return this.clientIp;
    }

    public MongoDBSlowLogDetail setClientPort(Integer clientPort) {
        this.clientPort = clientPort;
        return this;
    }

    public Integer getClientPort() {
        return this.clientPort;
    }

    public MongoDBSlowLogDetail setUser(String user) {
        this.user = user;
        return this;
    }

    public String getUser() {
        return this.user;
    }

    public MongoDBSlowLogDetail setConnectionId(Integer connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    public Integer getConnectionId() {
        return this.connectionId;
    }

    public MongoDBSlowLogDetail setCurrentDB(String currentDB) {
        this.currentDB = currentDB;
        return this;
    }

    public String getCurrentDB() {
        return this.currentDB;
    }

    public MongoDBSlowLogDetail setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public MongoDBSlowLogDetail setStart(String start) {
        this.start = start;
        return this;
    }

    public String getStart() {
        return this.start;
    }

    public MongoDBSlowLogDetail setEnd(String end) {
        this.end = end;
        return this;
    }

    public String getEnd() {
        return this.end;
    }

    public MongoDBSlowLogDetail setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    public String getFingerprint() {
        return this.fingerprint;
    }

    public MongoDBSlowLogDetail setFingerprintMd5(String fingerprintMd5) {
        this.fingerprintMd5 = fingerprintMd5;
        return this;
    }

    public String getFingerprintMd5() {
        return this.fingerprintMd5;
    }

    public MongoDBSlowLogDetail setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getQuery() {
        return this.query;
    }

    public MongoDBSlowLogDetail setSqlCommand(String sqlCommand) {
        this.sqlCommand = sqlCommand;
        return this;
    }

    public String getSqlCommand() {
        return this.sqlCommand;
    }

    public MongoDBSlowLogDetail setScanRows(Integer scanRows) {
        this.scanRows = scanRows;
        return this;
    }

    public Integer getScanRows() {
        return this.scanRows;
    }

    public MongoDBSlowLogDetail setReturnRows(Integer returnRows) {
        this.returnRows = returnRows;
        return this;
    }

    public Integer getReturnRows() {
        return this.returnRows;
    }

    public MongoDBSlowLogDetail setKeyScanRows(Integer keyScanRows) {
        this.keyScanRows = keyScanRows;
        return this;
    }

    public Integer getKeyScanRows() {
        return this.keyScanRows;
    }

    public MongoDBSlowLogDetail setResultLen(Integer resultLen) {
        this.resultLen = resultLen;
        return this;
    }

    public Integer getResultLen() {
        return this.resultLen;
    }

    public MongoDBSlowLogDetail setPlanSummary(String planSummary) {
        this.planSummary = planSummary;
        return this;
    }

    public String getPlanSummary() {
        return this.planSummary;
    }

    public MongoDBSlowLogDetail setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getNamespace() {
        return this.namespace;
    }

    @Override
    public String toString() {
        return "MongoDBSlowLogDetail{" + "uuid=" + uuid + "\n" + "clientIp=" + clientIp + "\n" + "clientPort=" + clientPort + "\n" + "user=" + user + "\n" + "connectionId="
                + connectionId + "\n" + "currentDB=" + currentDB + "\n" + "duration=" + duration + "\n" + "start=" + start + "\n" + "end=" + end + "\n" + "fingerprint="
                + fingerprint + "\n" + "fingerprintMd5=" + fingerprintMd5 + "\n" + "query=" + query + "\n" + "sqlCommand=" + sqlCommand + "\n" + "scanRows=" + scanRows + "\n"
                + "returnRows=" + returnRows + "\n" + "keyScanRows=" + keyScanRows + "\n" + "resultLen=" + resultLen + "\n" + "planSummary=" + planSummary + "\n" + "namespace="
                + namespace + "\n" + "}";
    }

}