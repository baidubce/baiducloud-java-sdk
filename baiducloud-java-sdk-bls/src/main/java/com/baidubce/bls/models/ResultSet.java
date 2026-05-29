package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultSet {
    /**
     * 查询类型
     */
    private String queryType;

    /**
     * 列名列表
     */
    private List<String> columns;

    /**
     * 列类型列表
     */
    private List<String> columnTypes;

    /**
     * 结果行数据
     */
    private List<List<Object>> rows;

    public ResultSet setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }

    public String getQueryType() {
        return this.queryType;
    }

    public ResultSet setColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }

    public List<String> getColumns() {
        return this.columns;
    }

    public ResultSet setColumnTypes(List<String> columnTypes) {
        this.columnTypes = columnTypes;
        return this;
    }

    public List<String> getColumnTypes() {
        return this.columnTypes;
    }

    public ResultSet setRows(List<List<Object>> rows) {
        this.rows = rows;
        return this;
    }

    public List<List<Object>> getRows() {
        return this.rows;
    }

    @Override
    public String toString() {
        return "ResultSet{" + "queryType=" + queryType + "\n" + "columns=" + columns + "\n" + "columnTypes=" + columnTypes + "\n" + "rows=" + rows + "\n" + "}";
    }

}