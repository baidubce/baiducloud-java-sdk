package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class APIPGSlowLogTemplateItem {
    /**
     * SQL指纹的MD5值
     */
    private String fingerprintMD5;

    /**
     * SQL指纹
     */
    private String fingerprint;

    /**
     * 数据库名称
     */
    private String dbName;

    /**
     * 执行次数
     */
    private Long executeTimes;

    /**
     * 总执行时间（毫秒）
     */
    private Long durationSum;

    /**
     * 最大执行时间（毫秒）
     */
    private Long durationMax;

    /**
     * 最小执行时间（毫秒）
     */
    private Long durationMin;

    /**
     * 平均执行时间（毫秒）
     */
    private Long durationAvg;

    public APIPGSlowLogTemplateItem setFingerprintMD5(String fingerprintMD5) {
        this.fingerprintMD5 = fingerprintMD5;
        return this;
    }

    public String getFingerprintMD5() {
        return this.fingerprintMD5;
    }

    public APIPGSlowLogTemplateItem setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    public String getFingerprint() {
        return this.fingerprint;
    }

    public APIPGSlowLogTemplateItem setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    public String getDbName() {
        return this.dbName;
    }

    public APIPGSlowLogTemplateItem setExecuteTimes(Long executeTimes) {
        this.executeTimes = executeTimes;
        return this;
    }

    public Long getExecuteTimes() {
        return this.executeTimes;
    }

    public APIPGSlowLogTemplateItem setDurationSum(Long durationSum) {
        this.durationSum = durationSum;
        return this;
    }

    public Long getDurationSum() {
        return this.durationSum;
    }

    public APIPGSlowLogTemplateItem setDurationMax(Long durationMax) {
        this.durationMax = durationMax;
        return this;
    }

    public Long getDurationMax() {
        return this.durationMax;
    }

    public APIPGSlowLogTemplateItem setDurationMin(Long durationMin) {
        this.durationMin = durationMin;
        return this;
    }

    public Long getDurationMin() {
        return this.durationMin;
    }

    public APIPGSlowLogTemplateItem setDurationAvg(Long durationAvg) {
        this.durationAvg = durationAvg;
        return this;
    }

    public Long getDurationAvg() {
        return this.durationAvg;
    }

    @Override
    public String toString() {
        return "APIPGSlowLogTemplateItem{" + "fingerprintMD5=" + fingerprintMD5 + "\n" + "fingerprint=" + fingerprint + "\n" + "dbName=" + dbName + "\n" + "executeTimes="
                + executeTimes + "\n" + "durationSum=" + durationSum + "\n" + "durationMax=" + durationMax + "\n" + "durationMin=" + durationMin + "\n" + "durationAvg="
                + durationAvg + "\n" + "}";
    }

}