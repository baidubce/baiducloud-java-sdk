package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PGSlowLogInfo {
    /**
     * 产品类型
     */
    private String product;

    /**
     * 实例ID
     */
    private String appID;

    /**
     * 实例名称
     */
    private String appName;

    /**
     * 实例短ID
     */
    private String appShortID;

    /**
     * 集群ID
     */
    private String clusterID;

    /**
     * 节点ID
     */
    private String nodeID;

    /**
     * 慢日志记录唯一标识
     */
    private String uuid;

    /**
     * 进程ID
     */
    private Long pid;

    /**
     * 客户端IP
     */
    private String clientIP;

    /**
     * 数据库名称
     */
    private String currentDB;

    /**
     * 用户名
     */
    private String currentUser;

    /**
     * 执行时间（毫秒）
     */
    private Long duration;

    /**
     * 开始时间
     */
    private String start;

    /**
     * 结束时间
     */
    private String end;

    /**
     * SQL语句
     */
    private String statement;

    /**
     * SQL指纹
     */
    private String fingerprint;

    /**
     * SQL指纹的MD5值
     */
    private String fingerprintMD5;

    public PGSlowLogInfo setProduct(String product) {
        this.product = product;
        return this;
    }

    public String getProduct() {
        return this.product;
    }

    public PGSlowLogInfo setAppID(String appID) {
        this.appID = appID;
        return this;
    }

    public String getAppID() {
        return this.appID;
    }

    public PGSlowLogInfo setAppName(String appName) {
        this.appName = appName;
        return this;
    }

    public String getAppName() {
        return this.appName;
    }

    public PGSlowLogInfo setAppShortID(String appShortID) {
        this.appShortID = appShortID;
        return this;
    }

    public String getAppShortID() {
        return this.appShortID;
    }

    public PGSlowLogInfo setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getClusterID() {
        return this.clusterID;
    }

    public PGSlowLogInfo setNodeID(String nodeID) {
        this.nodeID = nodeID;
        return this;
    }

    public String getNodeID() {
        return this.nodeID;
    }

    public PGSlowLogInfo setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getUuid() {
        return this.uuid;
    }

    public PGSlowLogInfo setPid(Long pid) {
        this.pid = pid;
        return this;
    }

    public Long getPid() {
        return this.pid;
    }

    public PGSlowLogInfo setClientIP(String clientIP) {
        this.clientIP = clientIP;
        return this;
    }

    public String getClientIP() {
        return this.clientIP;
    }

    public PGSlowLogInfo setCurrentDB(String currentDB) {
        this.currentDB = currentDB;
        return this;
    }

    public String getCurrentDB() {
        return this.currentDB;
    }

    public PGSlowLogInfo setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
        return this;
    }

    public String getCurrentUser() {
        return this.currentUser;
    }

    public PGSlowLogInfo setDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    public Long getDuration() {
        return this.duration;
    }

    public PGSlowLogInfo setStart(String start) {
        this.start = start;
        return this;
    }

    public String getStart() {
        return this.start;
    }

    public PGSlowLogInfo setEnd(String end) {
        this.end = end;
        return this;
    }

    public String getEnd() {
        return this.end;
    }

    public PGSlowLogInfo setStatement(String statement) {
        this.statement = statement;
        return this;
    }

    public String getStatement() {
        return this.statement;
    }

    public PGSlowLogInfo setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    public String getFingerprint() {
        return this.fingerprint;
    }

    public PGSlowLogInfo setFingerprintMD5(String fingerprintMD5) {
        this.fingerprintMD5 = fingerprintMD5;
        return this;
    }

    public String getFingerprintMD5() {
        return this.fingerprintMD5;
    }

    @Override
    public String toString() {
        return "PGSlowLogInfo{" + "product=" + product + "\n" + "appID=" + appID + "\n" + "appName=" + appName + "\n" + "appShortID=" + appShortID + "\n" + "clusterID="
                + clusterID + "\n" + "nodeID=" + nodeID + "\n" + "uuid=" + uuid + "\n" + "pid=" + pid + "\n" + "clientIP=" + clientIP + "\n" + "currentDB=" + currentDB + "\n"
                + "currentUser=" + currentUser + "\n" + "duration=" + duration + "\n" + "start=" + start + "\n" + "end=" + end + "\n" + "statement=" + statement + "\n"
                + "fingerprint=" + fingerprint + "\n" + "fingerprintMD5=" + fingerprintMD5 + "\n" + "}";
    }

}