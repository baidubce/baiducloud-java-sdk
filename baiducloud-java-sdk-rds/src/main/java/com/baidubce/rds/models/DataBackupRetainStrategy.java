package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataBackupRetainStrategy {
    /**
     * 起始秒数。
     */
    private Integer startSeconds;

    /**
     * 结束秒数。
     */
    private Integer endSeconds;

    /**
     * 保留数量。
     */
    private Integer retainCount;

    /**
     * 精度（单位：秒）。
     */
    private Integer precision;

    public DataBackupRetainStrategy setStartSeconds(Integer startSeconds) {
        this.startSeconds = startSeconds;
        return this;
    }

    public Integer getStartSeconds() {
        return this.startSeconds;
    }

    public DataBackupRetainStrategy setEndSeconds(Integer endSeconds) {
        this.endSeconds = endSeconds;
        return this;
    }

    public Integer getEndSeconds() {
        return this.endSeconds;
    }

    public DataBackupRetainStrategy setRetainCount(Integer retainCount) {
        this.retainCount = retainCount;
        return this;
    }

    public Integer getRetainCount() {
        return this.retainCount;
    }

    public DataBackupRetainStrategy setPrecision(Integer precision) {
        this.precision = precision;
        return this;
    }

    public Integer getPrecision() {
        return this.precision;
    }

    @Override
    public String toString() {
        return "DataBackupRetainStrategy{" + "startSeconds=" + startSeconds + "\n" + "endSeconds=" + endSeconds + "\n" + "retainCount=" + retainCount + "\n" + "precision="
                + precision + "\n" + "}";
    }

}