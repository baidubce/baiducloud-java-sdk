package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MysqlDatabaseSpaceModel {
    /**
     * 数据库名称
     */
    private String databaseName;

    /**
     * 数据库总空间
     */
    private Integer totalSpace;

    /**
     * 数据库数据空间
     */
    private Integer dataSpace;

    /**
     * 数据库索引空间
     */
    private Integer indexSpace;

    /**
     * 数据库可用空间
     */
    private Integer freeSpace;

    /**
     * 数据库可用空间占比（如"0.0004"）
     */
    private Double freeRate;

    /**
     * 数据库已用空间占比（如"0.9996"）
     */
    private Double usageRate;

    /**
     * 数据库总行数
     */
    private Integer rows;

    /**
     * 数据库物理空间
     */
    private Integer physicalSpace;

    /**
     * 数据库表数量
     */
    private Integer tableCount;

    public MysqlDatabaseSpaceModel setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    public String getDatabaseName() {
        return this.databaseName;
    }

    public MysqlDatabaseSpaceModel setTotalSpace(Integer totalSpace) {
        this.totalSpace = totalSpace;
        return this;
    }

    public Integer getTotalSpace() {
        return this.totalSpace;
    }

    public MysqlDatabaseSpaceModel setDataSpace(Integer dataSpace) {
        this.dataSpace = dataSpace;
        return this;
    }

    public Integer getDataSpace() {
        return this.dataSpace;
    }

    public MysqlDatabaseSpaceModel setIndexSpace(Integer indexSpace) {
        this.indexSpace = indexSpace;
        return this;
    }

    public Integer getIndexSpace() {
        return this.indexSpace;
    }

    public MysqlDatabaseSpaceModel setFreeSpace(Integer freeSpace) {
        this.freeSpace = freeSpace;
        return this;
    }

    public Integer getFreeSpace() {
        return this.freeSpace;
    }

    public MysqlDatabaseSpaceModel setFreeRate(Double freeRate) {
        this.freeRate = freeRate;
        return this;
    }

    public Double getFreeRate() {
        return this.freeRate;
    }

    public MysqlDatabaseSpaceModel setUsageRate(Double usageRate) {
        this.usageRate = usageRate;
        return this;
    }

    public Double getUsageRate() {
        return this.usageRate;
    }

    public MysqlDatabaseSpaceModel setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Integer getRows() {
        return this.rows;
    }

    public MysqlDatabaseSpaceModel setPhysicalSpace(Integer physicalSpace) {
        this.physicalSpace = physicalSpace;
        return this;
    }

    public Integer getPhysicalSpace() {
        return this.physicalSpace;
    }

    public MysqlDatabaseSpaceModel setTableCount(Integer tableCount) {
        this.tableCount = tableCount;
        return this;
    }

    public Integer getTableCount() {
        return this.tableCount;
    }

    @Override
    public String toString() {
        return "MysqlDatabaseSpaceModel{" + "databaseName=" + databaseName + "\n" + "totalSpace=" + totalSpace + "\n" + "dataSpace=" + dataSpace + "\n" + "indexSpace="
                + indexSpace + "\n" + "freeSpace=" + freeSpace + "\n" + "freeRate=" + freeRate + "\n" + "usageRate=" + usageRate + "\n" + "rows=" + rows + "\n" + "physicalSpace="
                + physicalSpace + "\n" + "tableCount=" + tableCount + "\n" + "}";
    }

}