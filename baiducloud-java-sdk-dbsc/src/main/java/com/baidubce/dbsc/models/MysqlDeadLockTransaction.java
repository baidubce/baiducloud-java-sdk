package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MysqlDeadLockTransaction {
    /**
     * 数据库名
     */
    private String database;

    /**
     * 堆号
     */
    private Integer heapNo;

    /**
     * 索引名
     */
    private String index;

    /**
     * 是否预测生成
     */
    private Boolean isPrediction;

    /**
     * 锁模式
     */
    private String lockMode;

    /**
     * 锁类型
     */
    private String lockType;

    /**
     * 页号
     */
    private Integer pageNo;

    /**
     * 记录锁类型
     */
    private String recordLockType;

    /**
     * 空间ID
     */
    private Integer spaceId;

    /**
     * 表名
     */
    private String table;

    /**
     * 等待/持有
     */
    private String waitHold;

    /**
     * 查询语句
     */
    private String query;

    /**
     * 线程ID
     */
    private Integer threadID;

    /**
     * 事务ID
     */
    private String trxId;

    /**
     * 事务序号
     */
    private Integer trxSeq;

    /**
     * 事务时间
     */
    private String trxTime;

    /**
     * 用户名
     */
    private String user;

    /**
     * 是否被Kill0-否1-是
     */
    private Integer victim;

    public MysqlDeadLockTransaction setDatabase(String database) {
        this.database = database;
        return this;
    }

    public String getDatabase() {
        return this.database;
    }

    public MysqlDeadLockTransaction setHeapNo(Integer heapNo) {
        this.heapNo = heapNo;
        return this;
    }

    public Integer getHeapNo() {
        return this.heapNo;
    }

    public MysqlDeadLockTransaction setIndex(String index) {
        this.index = index;
        return this;
    }

    public String getIndex() {
        return this.index;
    }

    public MysqlDeadLockTransaction setIsPrediction(Boolean isPrediction) {
        this.isPrediction = isPrediction;
        return this;
    }

    public Boolean getIsPrediction() {
        return this.isPrediction;
    }

    public MysqlDeadLockTransaction setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }

    public String getLockMode() {
        return this.lockMode;
    }

    public MysqlDeadLockTransaction setLockType(String lockType) {
        this.lockType = lockType;
        return this;
    }

    public String getLockType() {
        return this.lockType;
    }

    public MysqlDeadLockTransaction setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public MysqlDeadLockTransaction setRecordLockType(String recordLockType) {
        this.recordLockType = recordLockType;
        return this;
    }

    public String getRecordLockType() {
        return this.recordLockType;
    }

    public MysqlDeadLockTransaction setSpaceId(Integer spaceId) {
        this.spaceId = spaceId;
        return this;
    }

    public Integer getSpaceId() {
        return this.spaceId;
    }

    public MysqlDeadLockTransaction setTable(String table) {
        this.table = table;
        return this;
    }

    public String getTable() {
        return this.table;
    }

    public MysqlDeadLockTransaction setWaitHold(String waitHold) {
        this.waitHold = waitHold;
        return this;
    }

    public String getWaitHold() {
        return this.waitHold;
    }

    public MysqlDeadLockTransaction setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getQuery() {
        return this.query;
    }

    public MysqlDeadLockTransaction setThreadID(Integer threadID) {
        this.threadID = threadID;
        return this;
    }

    public Integer getThreadID() {
        return this.threadID;
    }

    public MysqlDeadLockTransaction setTrxId(String trxId) {
        this.trxId = trxId;
        return this;
    }

    public String getTrxId() {
        return this.trxId;
    }

    public MysqlDeadLockTransaction setTrxSeq(Integer trxSeq) {
        this.trxSeq = trxSeq;
        return this;
    }

    public Integer getTrxSeq() {
        return this.trxSeq;
    }

    public MysqlDeadLockTransaction setTrxTime(String trxTime) {
        this.trxTime = trxTime;
        return this;
    }

    public String getTrxTime() {
        return this.trxTime;
    }

    public MysqlDeadLockTransaction setUser(String user) {
        this.user = user;
        return this;
    }

    public String getUser() {
        return this.user;
    }

    public MysqlDeadLockTransaction setVictim(Integer victim) {
        this.victim = victim;
        return this;
    }

    public Integer getVictim() {
        return this.victim;
    }

    @Override
    public String toString() {
        return "MysqlDeadLockTransaction{" + "database=" + database + "\n" + "heapNo=" + heapNo + "\n" + "index=" + index + "\n" + "isPrediction=" + isPrediction + "\n"
                + "lockMode=" + lockMode + "\n" + "lockType=" + lockType + "\n" + "pageNo=" + pageNo + "\n" + "recordLockType=" + recordLockType + "\n" + "spaceId=" + spaceId
                + "\n" + "table=" + table + "\n" + "waitHold=" + waitHold + "\n" + "query=" + query + "\n" + "threadID=" + threadID + "\n" + "trxId=" + trxId + "\n" + "trxSeq="
                + trxSeq + "\n" + "trxTime=" + trxTime + "\n" + "user=" + user + "\n" + "victim=" + victim + "\n" + "}";
    }

}