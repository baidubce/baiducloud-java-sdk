package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MySQLSlowLogTemplate {
    /**
     * 归一化SQL
     */
    private String fringerprint;

    /**
     * 归一化SQL的MD5值
     */
    private String fringerprintMD5;

    /**
     * 数据库名称
     */
    private String dbName;

    /**
     * 执行次数
     */
    private Integer executeTimes;

    /**
     * 总执行时间，单位毫秒
     */
    private Integer durationSum;

    /**
     * 最大执行时间，单位毫秒
     */
    private Integer durationMax;

    /**
     * 最小执行时间，单位毫秒
     */
    private Integer durationMin;

    /**
     * 平均执行时间，单位毫秒
     */
    private Integer durationAvg;

    /**
     * 总锁时间，单位毫秒
     */
    private Integer lockTimeSum;

    /**
     * 最大锁时间，单位毫秒
     */
    private Integer lockTimeMax;

    /**
     * 最小锁时间，单位毫秒
     */
    private Integer lockTimeMin;

    /**
     * 平均锁时间，单位毫秒
     */
    private Integer lockTimeAvg;

    /**
     * 总扫描行数
     */
    private Integer scanRowsSum;

    /**
     * 最大扫描行数
     */
    private Integer scanRowsMax;

    /**
     * 最小扫描行数
     */
    private Integer scanRowsMin;

    /**
     * 平均扫描行数
     */
    private Integer scanRowsAvg;

    /**
     * 总返回行数
     */
    private Integer returnRowsSum;

    /**
     * 最大返回行数
     */
    private Integer returnRowsMax;

    /**
     * 最小返回行数
     */
    private Integer returnRowsMin;

    /**
     * 平均返回行数
     */
    private Integer returnRowsAvg;

    public MySQLSlowLogTemplate setFringerprint(String fringerprint) {
        this.fringerprint = fringerprint;
        return this;
    }

    public String getFringerprint() {
        return this.fringerprint;
    }

    public MySQLSlowLogTemplate setFringerprintMD5(String fringerprintMD5) {
        this.fringerprintMD5 = fringerprintMD5;
        return this;
    }

    public String getFringerprintMD5() {
        return this.fringerprintMD5;
    }

    public MySQLSlowLogTemplate setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    public String getDbName() {
        return this.dbName;
    }

    public MySQLSlowLogTemplate setExecuteTimes(Integer executeTimes) {
        this.executeTimes = executeTimes;
        return this;
    }

    public Integer getExecuteTimes() {
        return this.executeTimes;
    }

    public MySQLSlowLogTemplate setDurationSum(Integer durationSum) {
        this.durationSum = durationSum;
        return this;
    }

    public Integer getDurationSum() {
        return this.durationSum;
    }

    public MySQLSlowLogTemplate setDurationMax(Integer durationMax) {
        this.durationMax = durationMax;
        return this;
    }

    public Integer getDurationMax() {
        return this.durationMax;
    }

    public MySQLSlowLogTemplate setDurationMin(Integer durationMin) {
        this.durationMin = durationMin;
        return this;
    }

    public Integer getDurationMin() {
        return this.durationMin;
    }

    public MySQLSlowLogTemplate setDurationAvg(Integer durationAvg) {
        this.durationAvg = durationAvg;
        return this;
    }

    public Integer getDurationAvg() {
        return this.durationAvg;
    }

    public MySQLSlowLogTemplate setLockTimeSum(Integer lockTimeSum) {
        this.lockTimeSum = lockTimeSum;
        return this;
    }

    public Integer getLockTimeSum() {
        return this.lockTimeSum;
    }

    public MySQLSlowLogTemplate setLockTimeMax(Integer lockTimeMax) {
        this.lockTimeMax = lockTimeMax;
        return this;
    }

    public Integer getLockTimeMax() {
        return this.lockTimeMax;
    }

    public MySQLSlowLogTemplate setLockTimeMin(Integer lockTimeMin) {
        this.lockTimeMin = lockTimeMin;
        return this;
    }

    public Integer getLockTimeMin() {
        return this.lockTimeMin;
    }

    public MySQLSlowLogTemplate setLockTimeAvg(Integer lockTimeAvg) {
        this.lockTimeAvg = lockTimeAvg;
        return this;
    }

    public Integer getLockTimeAvg() {
        return this.lockTimeAvg;
    }

    public MySQLSlowLogTemplate setScanRowsSum(Integer scanRowsSum) {
        this.scanRowsSum = scanRowsSum;
        return this;
    }

    public Integer getScanRowsSum() {
        return this.scanRowsSum;
    }

    public MySQLSlowLogTemplate setScanRowsMax(Integer scanRowsMax) {
        this.scanRowsMax = scanRowsMax;
        return this;
    }

    public Integer getScanRowsMax() {
        return this.scanRowsMax;
    }

    public MySQLSlowLogTemplate setScanRowsMin(Integer scanRowsMin) {
        this.scanRowsMin = scanRowsMin;
        return this;
    }

    public Integer getScanRowsMin() {
        return this.scanRowsMin;
    }

    public MySQLSlowLogTemplate setScanRowsAvg(Integer scanRowsAvg) {
        this.scanRowsAvg = scanRowsAvg;
        return this;
    }

    public Integer getScanRowsAvg() {
        return this.scanRowsAvg;
    }

    public MySQLSlowLogTemplate setReturnRowsSum(Integer returnRowsSum) {
        this.returnRowsSum = returnRowsSum;
        return this;
    }

    public Integer getReturnRowsSum() {
        return this.returnRowsSum;
    }

    public MySQLSlowLogTemplate setReturnRowsMax(Integer returnRowsMax) {
        this.returnRowsMax = returnRowsMax;
        return this;
    }

    public Integer getReturnRowsMax() {
        return this.returnRowsMax;
    }

    public MySQLSlowLogTemplate setReturnRowsMin(Integer returnRowsMin) {
        this.returnRowsMin = returnRowsMin;
        return this;
    }

    public Integer getReturnRowsMin() {
        return this.returnRowsMin;
    }

    public MySQLSlowLogTemplate setReturnRowsAvg(Integer returnRowsAvg) {
        this.returnRowsAvg = returnRowsAvg;
        return this;
    }

    public Integer getReturnRowsAvg() {
        return this.returnRowsAvg;
    }

    @Override
    public String toString() {
        return "MySQLSlowLogTemplate{" + "fringerprint=" + fringerprint + "\n" + "fringerprintMD5=" + fringerprintMD5 + "\n" + "dbName=" + dbName + "\n" + "executeTimes="
                + executeTimes + "\n" + "durationSum=" + durationSum + "\n" + "durationMax=" + durationMax + "\n" + "durationMin=" + durationMin + "\n" + "durationAvg="
                + durationAvg + "\n" + "lockTimeSum=" + lockTimeSum + "\n" + "lockTimeMax=" + lockTimeMax + "\n" + "lockTimeMin=" + lockTimeMin + "\n" + "lockTimeAvg="
                + lockTimeAvg + "\n" + "scanRowsSum=" + scanRowsSum + "\n" + "scanRowsMax=" + scanRowsMax + "\n" + "scanRowsMin=" + scanRowsMin + "\n" + "scanRowsAvg="
                + scanRowsAvg + "\n" + "returnRowsSum=" + returnRowsSum + "\n" + "returnRowsMax=" + returnRowsMax + "\n" + "returnRowsMin=" + returnRowsMin + "\n"
                + "returnRowsAvg=" + returnRowsAvg + "\n" + "}";
    }

}