package com.baidubce.dbsc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableIndexDetailItem {
    /**
     * 数据库名称
     */
    private String schemaName;

    /**
     * 表名称
     */
    private String tableName;

    /**
     * 索引名称
     */
    private String indexName;

    /**
     * 索引包含的字段名称（以逗号分隔）
     */
    private String columnName;

    /**
     * 是否唯一索引（0=唯一索引,1=非唯一索引）
     */
    private Integer nonUnique;

    /**
     * 索引类型（如BTREE、HASH等）
     */
    private String indexType;

    /**
     * 索引注释
     */
    private String comment;

    /**
     * 索引字段详情列表
     */
    private List<TableIndexColumnItem> columns;

    public TableIndexDetailItem setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    public String getSchemaName() {
        return this.schemaName;
    }

    public TableIndexDetailItem setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public String getTableName() {
        return this.tableName;
    }

    public TableIndexDetailItem setIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    public String getIndexName() {
        return this.indexName;
    }

    public TableIndexDetailItem setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    public String getColumnName() {
        return this.columnName;
    }

    public TableIndexDetailItem setNonUnique(Integer nonUnique) {
        this.nonUnique = nonUnique;
        return this;
    }

    public Integer getNonUnique() {
        return this.nonUnique;
    }

    public TableIndexDetailItem setIndexType(String indexType) {
        this.indexType = indexType;
        return this;
    }

    public String getIndexType() {
        return this.indexType;
    }

    public TableIndexDetailItem setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return this.comment;
    }

    public TableIndexDetailItem setColumns(List<TableIndexColumnItem> columns) {
        this.columns = columns;
        return this;
    }

    public List<TableIndexColumnItem> getColumns() {
        return this.columns;
    }

    @Override
    public String toString() {
        return "TableIndexDetailItem{" + "schemaName=" + schemaName + "\n" + "tableName=" + tableName + "\n" + "indexName=" + indexName + "\n" + "columnName=" + columnName + "\n"
                + "nonUnique=" + nonUnique + "\n" + "indexType=" + indexType + "\n" + "comment=" + comment + "\n" + "columns=" + columns + "\n" + "}";
    }

}