package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MysqlSessionUserSummary {
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

    /**
     * 数据库用户
     */
    private String userName;

    public MysqlSessionUserSummary setActiveAverageExecuteTime(Double activeAverageExecuteTime) {
        this.activeAverageExecuteTime = activeAverageExecuteTime;
        return this;
    }

    public Double getActiveAverageExecuteTime() {
        return this.activeAverageExecuteTime;
    }

    public MysqlSessionUserSummary setActiveMaxExecuteTime(Double activeMaxExecuteTime) {
        this.activeMaxExecuteTime = activeMaxExecuteTime;
        return this;
    }

    public Double getActiveMaxExecuteTime() {
        return this.activeMaxExecuteTime;
    }

    public MysqlSessionUserSummary setActiveTotalCount(Integer activeTotalCount) {
        this.activeTotalCount = activeTotalCount;
        return this;
    }

    public Integer getActiveTotalCount() {
        return this.activeTotalCount;
    }

    public MysqlSessionUserSummary setActiveTotalExecuteTime(Double activeTotalExecuteTime) {
        this.activeTotalExecuteTime = activeTotalExecuteTime;
        return this;
    }

    public Double getActiveTotalExecuteTime() {
        return this.activeTotalExecuteTime;
    }

    public MysqlSessionUserSummary setAverageExecuteTime(Double averageExecuteTime) {
        this.averageExecuteTime = averageExecuteTime;
        return this;
    }

    public Double getAverageExecuteTime() {
        return this.averageExecuteTime;
    }

    public MysqlSessionUserSummary setMaxExecuteTime(Double maxExecuteTime) {
        this.maxExecuteTime = maxExecuteTime;
        return this;
    }

    public Double getMaxExecuteTime() {
        return this.maxExecuteTime;
    }

    public MysqlSessionUserSummary setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public MysqlSessionUserSummary setTotalExecuteTime(Double totalExecuteTime) {
        this.totalExecuteTime = totalExecuteTime;
        return this;
    }

    public Double getTotalExecuteTime() {
        return this.totalExecuteTime;
    }

    public MysqlSessionUserSummary setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserName() {
        return this.userName;
    }

    @Override
    public String toString() {
        return "MysqlSessionUserSummary{" + "activeAverageExecuteTime=" + activeAverageExecuteTime + "\n" + "activeMaxExecuteTime=" + activeMaxExecuteTime + "\n"
                + "activeTotalCount=" + activeTotalCount + "\n" + "activeTotalExecuteTime=" + activeTotalExecuteTime + "\n" + "averageExecuteTime=" + averageExecuteTime + "\n"
                + "maxExecuteTime=" + maxExecuteTime + "\n" + "totalCount=" + totalCount + "\n" + "totalExecuteTime=" + totalExecuteTime + "\n" + "userName=" + userName + "\n"
                + "}";
    }

}