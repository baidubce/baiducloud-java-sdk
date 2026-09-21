package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MySQLFilterItem {
    /**
     * 限流任务ID
     */
    private String filterId;

    /**
     * 限流关键字，多组关键字，逗号分割，支持字符集utf8，除逗号为关键字外只能做分隔符使用，其他不设置限制
     */
    private String filterKey;

    /**
     * 限流规则的并发数：取值 0-100w 闭区间
     */
    private Integer filterLimit;

    /**
     * SQL限流类型，支持SELECT、UPDATE、INSERT、DELETE、REPLACE
     */
    private String filterType;

    /**
     * 任务指定操作类型：ON：开启SQL限流OFF：停止SQL限流
     */
    private String filterStatus;

    /**
     * 任务创建时间
     */
    private String createTime;

    /**
     * 任务更新时间
     */
    private String updateTime;

    public MySQLFilterItem setFilterId(String filterId) {
        this.filterId = filterId;
        return this;
    }

    public String getFilterId() {
        return this.filterId;
    }

    public MySQLFilterItem setFilterKey(String filterKey) {
        this.filterKey = filterKey;
        return this;
    }

    public String getFilterKey() {
        return this.filterKey;
    }

    public MySQLFilterItem setFilterLimit(Integer filterLimit) {
        this.filterLimit = filterLimit;
        return this;
    }

    public Integer getFilterLimit() {
        return this.filterLimit;
    }

    public MySQLFilterItem setFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }

    public String getFilterType() {
        return this.filterType;
    }

    public MySQLFilterItem setFilterStatus(String filterStatus) {
        this.filterStatus = filterStatus;
        return this;
    }

    public String getFilterStatus() {
        return this.filterStatus;
    }

    public MySQLFilterItem setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public MySQLFilterItem setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public String toString() {
        return "MySQLFilterItem{" + "filterId=" + filterId + "\n" + "filterKey=" + filterKey + "\n" + "filterLimit=" + filterLimit + "\n" + "filterType=" + filterType + "\n"
                + "filterStatus=" + filterStatus + "\n" + "createTime=" + createTime + "\n" + "updateTime=" + updateTime + "\n" + "}";
    }

}