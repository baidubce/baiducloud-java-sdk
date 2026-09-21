package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MongoDBSlowLogTemplate {
    /**
     * 命令唯一标识
     */
    private String fingerprintMd5;

    /**
     * 归一化SQL
     */
    private String fingerprint;

    /**
     * 命名空间
     */
    private String namespace;

    /**
     * 执行次数
     */
    private String executeTimes;

    /**
     * 命令执行总时间，单位毫秒
     */
    private Integer durationSum;

    /**
     * 命令执行最大时间，单位毫秒
     */
    private Integer durationMax;

    /**
     * 命令执行最小时间，单位毫秒
     */
    private Integer durationMin;

    /**
     * 命令执行平均时间，单位毫秒
     */
    private Integer durationAvg;

    /**
     * 命令索引扫描总行数
     */
    private Integer keyScanRowsSum;

    /**
     * 命令索引扫描总大行数
     */
    private Integer keyScanRowsMax;

    /**
     * 命令索引扫描总小行数
     */
    private Integer keyScanRowsMin;

    /**
     * 命令索引扫描平均行数
     */
    private Integer keyScanRowsAvg;

    /**
     * 命令扫描平均行数
     */
    private Integer scanRowsSum;

    /**
     * 命令扫描最大行数
     */
    private Integer scanRowsMax;

    /**
     * 命令扫描最小行数
     */
    private Integer scanRowsMin;

    /**
     * 命令扫描平均行数
     */
    private Integer scanRowsAvg;

    /**
     * 命令返回总行数
     */
    private Integer returnRowsSum;

    /**
     * 命令返回最大行数
     */
    private Integer returnRowsMax;

    /**
     * 命令返回最小行数
     */
    private Integer returnRowsMin;

    /**
     * 命令返回平均行数
     */
    private Integer returnRowsAvg;

    public MongoDBSlowLogTemplate setFingerprintMd5(String fingerprintMd5) {
        this.fingerprintMd5 = fingerprintMd5;
        return this;
    }

    public String getFingerprintMd5() {
        return this.fingerprintMd5;
    }

    public MongoDBSlowLogTemplate setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    public String getFingerprint() {
        return this.fingerprint;
    }

    public MongoDBSlowLogTemplate setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public MongoDBSlowLogTemplate setExecuteTimes(String executeTimes) {
        this.executeTimes = executeTimes;
        return this;
    }

    public String getExecuteTimes() {
        return this.executeTimes;
    }

    public MongoDBSlowLogTemplate setDurationSum(Integer durationSum) {
        this.durationSum = durationSum;
        return this;
    }

    public Integer getDurationSum() {
        return this.durationSum;
    }

    public MongoDBSlowLogTemplate setDurationMax(Integer durationMax) {
        this.durationMax = durationMax;
        return this;
    }

    public Integer getDurationMax() {
        return this.durationMax;
    }

    public MongoDBSlowLogTemplate setDurationMin(Integer durationMin) {
        this.durationMin = durationMin;
        return this;
    }

    public Integer getDurationMin() {
        return this.durationMin;
    }

    public MongoDBSlowLogTemplate setDurationAvg(Integer durationAvg) {
        this.durationAvg = durationAvg;
        return this;
    }

    public Integer getDurationAvg() {
        return this.durationAvg;
    }

    public MongoDBSlowLogTemplate setKeyScanRowsSum(Integer keyScanRowsSum) {
        this.keyScanRowsSum = keyScanRowsSum;
        return this;
    }

    public Integer getKeyScanRowsSum() {
        return this.keyScanRowsSum;
    }

    public MongoDBSlowLogTemplate setKeyScanRowsMax(Integer keyScanRowsMax) {
        this.keyScanRowsMax = keyScanRowsMax;
        return this;
    }

    public Integer getKeyScanRowsMax() {
        return this.keyScanRowsMax;
    }

    public MongoDBSlowLogTemplate setKeyScanRowsMin(Integer keyScanRowsMin) {
        this.keyScanRowsMin = keyScanRowsMin;
        return this;
    }

    public Integer getKeyScanRowsMin() {
        return this.keyScanRowsMin;
    }

    public MongoDBSlowLogTemplate setKeyScanRowsAvg(Integer keyScanRowsAvg) {
        this.keyScanRowsAvg = keyScanRowsAvg;
        return this;
    }

    public Integer getKeyScanRowsAvg() {
        return this.keyScanRowsAvg;
    }

    public MongoDBSlowLogTemplate setScanRowsSum(Integer scanRowsSum) {
        this.scanRowsSum = scanRowsSum;
        return this;
    }

    public Integer getScanRowsSum() {
        return this.scanRowsSum;
    }

    public MongoDBSlowLogTemplate setScanRowsMax(Integer scanRowsMax) {
        this.scanRowsMax = scanRowsMax;
        return this;
    }

    public Integer getScanRowsMax() {
        return this.scanRowsMax;
    }

    public MongoDBSlowLogTemplate setScanRowsMin(Integer scanRowsMin) {
        this.scanRowsMin = scanRowsMin;
        return this;
    }

    public Integer getScanRowsMin() {
        return this.scanRowsMin;
    }

    public MongoDBSlowLogTemplate setScanRowsAvg(Integer scanRowsAvg) {
        this.scanRowsAvg = scanRowsAvg;
        return this;
    }

    public Integer getScanRowsAvg() {
        return this.scanRowsAvg;
    }

    public MongoDBSlowLogTemplate setReturnRowsSum(Integer returnRowsSum) {
        this.returnRowsSum = returnRowsSum;
        return this;
    }

    public Integer getReturnRowsSum() {
        return this.returnRowsSum;
    }

    public MongoDBSlowLogTemplate setReturnRowsMax(Integer returnRowsMax) {
        this.returnRowsMax = returnRowsMax;
        return this;
    }

    public Integer getReturnRowsMax() {
        return this.returnRowsMax;
    }

    public MongoDBSlowLogTemplate setReturnRowsMin(Integer returnRowsMin) {
        this.returnRowsMin = returnRowsMin;
        return this;
    }

    public Integer getReturnRowsMin() {
        return this.returnRowsMin;
    }

    public MongoDBSlowLogTemplate setReturnRowsAvg(Integer returnRowsAvg) {
        this.returnRowsAvg = returnRowsAvg;
        return this;
    }

    public Integer getReturnRowsAvg() {
        return this.returnRowsAvg;
    }

    @Override
    public String toString() {
        return "MongoDBSlowLogTemplate{" + "fingerprintMd5=" + fingerprintMd5 + "\n" + "fingerprint=" + fingerprint + "\n" + "namespace=" + namespace + "\n" + "executeTimes="
                + executeTimes + "\n" + "durationSum=" + durationSum + "\n" + "durationMax=" + durationMax + "\n" + "durationMin=" + durationMin + "\n" + "durationAvg="
                + durationAvg + "\n" + "keyScanRowsSum=" + keyScanRowsSum + "\n" + "keyScanRowsMax=" + keyScanRowsMax + "\n" + "keyScanRowsMin=" + keyScanRowsMin + "\n"
                + "keyScanRowsAvg=" + keyScanRowsAvg + "\n" + "scanRowsSum=" + scanRowsSum + "\n" + "scanRowsMax=" + scanRowsMax + "\n" + "scanRowsMin=" + scanRowsMin + "\n"
                + "scanRowsAvg=" + scanRowsAvg + "\n" + "returnRowsSum=" + returnRowsSum + "\n" + "returnRowsMax=" + returnRowsMax + "\n" + "returnRowsMin=" + returnRowsMin + "\n"
                + "returnRowsAvg=" + returnRowsAvg + "\n" + "}";
    }

}