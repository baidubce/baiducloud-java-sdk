package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MysqlTableSpaceModel {
    /**
     * 数据库名
     */
    private String databaseName;

    /**
     * 表名
     */
    private String tableName;

    /**
     * 存储引擎
     */
    private String engine;

    /**
     * 表总空间
     */
    private Long totalSpace;

    /**
     * 表数据空间
     */
    private Long dataSpace;

    /**
     * 表索引空间
     */
    private Long indexSpace;

    /**
     * 表可用空间
     */
    private Integer freeSpace;

    /**
     * 表可用空间占比
     */
    private Double freeRate;

    /**
     * 表已用空间占比
     */
    private Double usageRate;

    /**
     * 数据空间（字节）
     */
    private Integer rows;

    /**
     * 平均行长度
     */
    private Integer avgRowLength;

    /**
     * 表物理空间
     */
    private Long physicalSpace;

    public MysqlTableSpaceModel setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    public String getDatabaseName() {
        return this.databaseName;
    }

    public MysqlTableSpaceModel setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public String getTableName() {
        return this.tableName;
    }

    public MysqlTableSpaceModel setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public String getEngine() {
        return this.engine;
    }

    public MysqlTableSpaceModel setTotalSpace(Long totalSpace) {
        this.totalSpace = totalSpace;
        return this;
    }

    public Long getTotalSpace() {
        return this.totalSpace;
    }

    public MysqlTableSpaceModel setDataSpace(Long dataSpace) {
        this.dataSpace = dataSpace;
        return this;
    }

    public Long getDataSpace() {
        return this.dataSpace;
    }

    public MysqlTableSpaceModel setIndexSpace(Long indexSpace) {
        this.indexSpace = indexSpace;
        return this;
    }

    public Long getIndexSpace() {
        return this.indexSpace;
    }

    public MysqlTableSpaceModel setFreeSpace(Integer freeSpace) {
        this.freeSpace = freeSpace;
        return this;
    }

    public Integer getFreeSpace() {
        return this.freeSpace;
    }

    public MysqlTableSpaceModel setFreeRate(Double freeRate) {
        this.freeRate = freeRate;
        return this;
    }

    public Double getFreeRate() {
        return this.freeRate;
    }

    public MysqlTableSpaceModel setUsageRate(Double usageRate) {
        this.usageRate = usageRate;
        return this;
    }

    public Double getUsageRate() {
        return this.usageRate;
    }

    public MysqlTableSpaceModel setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Integer getRows() {
        return this.rows;
    }

    public MysqlTableSpaceModel setAvgRowLength(Integer avgRowLength) {
        this.avgRowLength = avgRowLength;
        return this;
    }

    public Integer getAvgRowLength() {
        return this.avgRowLength;
    }

    public MysqlTableSpaceModel setPhysicalSpace(Long physicalSpace) {
        this.physicalSpace = physicalSpace;
        return this;
    }

    public Long getPhysicalSpace() {
        return this.physicalSpace;
    }

    @Override
    public String toString() {
        return "MysqlTableSpaceModel{" + "databaseName=" + databaseName + "\n" + "tableName=" + tableName + "\n" + "engine=" + engine + "\n" + "totalSpace=" + totalSpace + "\n"
                + "dataSpace=" + dataSpace + "\n" + "indexSpace=" + indexSpace + "\n" + "freeSpace=" + freeSpace + "\n" + "freeRate=" + freeRate + "\n" + "usageRate=" + usageRate
                + "\n" + "rows=" + rows + "\n" + "avgRowLength=" + avgRowLength + "\n" + "physicalSpace=" + physicalSpace + "\n" + "}";
    }

}