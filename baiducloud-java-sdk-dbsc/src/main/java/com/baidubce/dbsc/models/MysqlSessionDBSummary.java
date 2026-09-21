package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MysqlSessionDBSummary {
    /**
     * 数据库名称
     */
    private String databaseName;

    /**
     * 活跃会话平均执行时间
     */
    private Double activeAverageExecuteTime;

    /**
     * 活跃会话最长执行时间
     */
    private Double activeMaxExecuteTime;

    /**
     * 活跃会话总数
     */
    private Integer activeTotalCount;

    /**
     * 活跃会话总执行时间
     */
    private Double activeTotalExecuteTime;

    /**
     * 会话平均执行时间
     */
    private Double averageExecuteTime;

    /**
     * 会话最长执行时间
     */
    private Double maxExecuteTime;

    /**
     * 会话总数
     */
    private Integer totalCount;

    /**
     * 会话总执行时间
     */
    private Double totalExecuteTime;

    public MysqlSessionDBSummary setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    public String getDatabaseName() {
        return this.databaseName;
    }

    public MysqlSessionDBSummary setActiveAverageExecuteTime(Double activeAverageExecuteTime) {
        this.activeAverageExecuteTime = activeAverageExecuteTime;
        return this;
    }

    public Double getActiveAverageExecuteTime() {
        return this.activeAverageExecuteTime;
    }

    public MysqlSessionDBSummary setActiveMaxExecuteTime(Double activeMaxExecuteTime) {
        this.activeMaxExecuteTime = activeMaxExecuteTime;
        return this;
    }

    public Double getActiveMaxExecuteTime() {
        return this.activeMaxExecuteTime;
    }

    public MysqlSessionDBSummary setActiveTotalCount(Integer activeTotalCount) {
        this.activeTotalCount = activeTotalCount;
        return this;
    }

    public Integer getActiveTotalCount() {
        return this.activeTotalCount;
    }

    public MysqlSessionDBSummary setActiveTotalExecuteTime(Double activeTotalExecuteTime) {
        this.activeTotalExecuteTime = activeTotalExecuteTime;
        return this;
    }

    public Double getActiveTotalExecuteTime() {
        return this.activeTotalExecuteTime;
    }

    public MysqlSessionDBSummary setAverageExecuteTime(Double averageExecuteTime) {
        this.averageExecuteTime = averageExecuteTime;
        return this;
    }

    public Double getAverageExecuteTime() {
        return this.averageExecuteTime;
    }

    public MysqlSessionDBSummary setMaxExecuteTime(Double maxExecuteTime) {
        this.maxExecuteTime = maxExecuteTime;
        return this;
    }

    public Double getMaxExecuteTime() {
        return this.maxExecuteTime;
    }

    public MysqlSessionDBSummary setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public MysqlSessionDBSummary setTotalExecuteTime(Double totalExecuteTime) {
        this.totalExecuteTime = totalExecuteTime;
        return this;
    }

    public Double getTotalExecuteTime() {
        return this.totalExecuteTime;
    }

    @Override
    public String toString() {
        return "MysqlSessionDBSummary{" + "databaseName=" + databaseName + "\n" + "activeAverageExecuteTime=" + activeAverageExecuteTime + "\n" + "activeMaxExecuteTime="
                + activeMaxExecuteTime + "\n" + "activeTotalCount=" + activeTotalCount + "\n" + "activeTotalExecuteTime=" + activeTotalExecuteTime + "\n" + "averageExecuteTime="
                + averageExecuteTime + "\n" + "maxExecuteTime=" + maxExecuteTime + "\n" + "totalCount=" + totalCount + "\n" + "totalExecuteTime=" + totalExecuteTime + "\n" + "}";
    }

}